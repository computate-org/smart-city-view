package org.computate.smartvillageview.enus.model.traffic.simulation.report;

import java.util.Optional;

import org.computate.smartvillageview.enus.config.ConfigKeys;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.kafka.client.producer.KafkaProducerRecord;
import io.vertx.pgclient.PgPool;

/**
 * Translate: false
 **/
public class SimulationReportEnUSApiServiceImpl extends SimulationReportEnUSGenApiServiceImpl {

	public SimulationReportEnUSApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

	@Override
	public Future<SimulationReport> patchrunsimulationSimulationReportFuture(SimulationReport o, Boolean inheritPk) {
		Promise<SimulationReport> promise = Promise.promise();
		LOG.info("Sending record to kafka");
		super.patchrunsimulationSimulationReportFuture(o, inheritPk).onSuccess(simulationReport -> {
			try {
				String topic = config.getString(ConfigKeys.KAFKA_TOPIC_SUMO_RUN);
				JsonObject body = JsonObject.mapFrom(simulationReport);
				KafkaProducerRecord<String, String> record = KafkaProducerRecord.create(topic, body.encode());
				kafkaProducer.send(record).onSuccess(recordMetadata -> {
					LOG.info(String.format("Sent record to kafka topic %s: %s", topic, body.encode()));
					promise.complete(simulationReport);
				}).onFailure(ex -> {
					LOG.error(String.format("Could not send record to kafka topic %s: %s", topic, body.encode()), ex);
					promise.fail(ex);
				});
			} catch(Exception ex) {
				LOG.error(String.format("Could not send record to kafka: %s", Optional.ofNullable(JsonObject.mapFrom(simulationReport)).map(b -> b.encode()).orElse("")), ex);
				promise.fail(ex);
			}
		}).onFailure(ex -> {
			LOG.error("Could not send record to kafka", ex);
			promise.fail(ex);
		});
		return promise.future();
	}
}
