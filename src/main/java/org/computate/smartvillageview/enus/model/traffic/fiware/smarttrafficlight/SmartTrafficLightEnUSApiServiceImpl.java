package org.computate.smartvillageview.enus.model.traffic.fiware.smarttrafficlight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport;
import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.vertx.api.ApiRequest;

import io.vertx.core.Future;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.pgclient.PgPool;

/**
 * Translate: false
 **/
public class SmartTrafficLightEnUSApiServiceImpl extends SmartTrafficLightEnUSGenApiServiceImpl {

	public SmartTrafficLightEnUSApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor workerExecutor, PgPool pgPool, KafkaProducer<String, String> kafkaProducer, WebClient webClient, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, workerExecutor, pgPool, kafkaProducer, webClient, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

	@Override
	public Future<Void> persistSmartTrafficLight(SmartTrafficLight o, Boolean inheritPk) {
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		ApiRequest apiRequest = siteRequest.getApiRequest_();
		List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
		List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
		for(Long key : o.getReportKeys()) {
			pks.add(key);
			classes.add(SimulationReport.CLASS_SIMPLE_NAME);
		}
		return super.persistSmartTrafficLight(o, inheritPk);
	}
}
