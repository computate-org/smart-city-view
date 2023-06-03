package org.computate.smartvillageview.enus.model.traffic.simulation;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
import io.vertx.core.json.JsonObject;
import java.util.Date;
import java.util.Set;
import org.computate.vertx.api.ApiRequest;
import org.computate.smartvillageview.enus.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import java.util.Map;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.util.Locale;
import java.time.OffsetDateTime;
import java.lang.String;
import java.math.BigDecimal;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.Long;
import org.computate.smartvillageview.enus.model.traffic.simulation.report.SimulationReport;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
 * <h3>About the TrafficSimulation class and it's generated class TrafficSimulationGen&lt;BaseModel&gt;: </h3>extends TrafficSimulationGen
 * <p>
 * This Java class extends a generated Java class TrafficSimulationGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation">Find the class TrafficSimulation in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TrafficSimulationGen<BaseModel>
 * <p>This <code>class TrafficSimulation extends TrafficSimulationGen&lt;BaseModel&gt;</code>, which means it extends a newly generated TrafficSimulationGen. 
 * The generated <code>class TrafficSimulationGen extends BaseModel</code> which means that TrafficSimulation extends TrafficSimulationGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * ApiMethode: Search
 * <p>This class contains a comment <b>"ApiMethod: Search"</b>, which creates an API "Search". 
 * </p>
 * ApiMethode: GET
 * <p>This class contains a comment <b>"ApiMethod: GET"</b>, which creates an API "GET". 
 * </p>
 * ApiMethode: PATCH
 * <p>This class contains a comment <b>"ApiMethod: PATCH"</b>, which creates an API "PATCH". 
 * </p>
 * ApiMethode: POST
 * <p>This class contains a comment <b>"ApiMethod: POST"</b>, which creates an API "POST". 
 * </p>
 * ApiMethode: PUTImport
 * <p>This class contains a comment <b>"ApiMethod: PUTImport"</b>, which creates an API "PUTImport". 
 * </p>
 * ApiMethode: SearchPage
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * ApiMethode: MapSearchPage
 * <p>This class contains a comment <b>"ApiMethod: MapSearchPage"</b>, which creates an API "MapSearchPage". 
 * </p>
 * ApiTag.enUS: true
 * <p>This class contains a comment <b>"ApiTag: Traffic Simulation"</b>, which groups all of the OpenAPIs for TrafficSimulation objects under the tag "Traffic Simulation". 
 * </p>
 * ApiUri.enUS: /api/traffic-simulation
 * <p>This class contains a comment <b>"ApiUri: /api/traffic-simulation"</b>, which defines the base API URI for TrafficSimulation objects as "/api/traffic-simulation" in the OpenAPI spec. 
 * </p>
 * Color: 2017-shaded-spruce
 * <p>This class contains a comment <b>"Color: 2017-shaded-spruce"</b>, which styles the TrafficSimulation page "2017-shaded-spruce". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-2017-shaded-spruce" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: duotone
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the TrafficSimulation page with a group of "duotone". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "duotone", together is "fa-duotone". 
 * A Font Awesome icon group of "duotone" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, sharp, and kit. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: traffic-light-stop
 * <p>This class contains a comment <b>"IconName: traffic-light-stop"</b>, which adds icons on the TrafficSimulation page with a name of "traffic-light-stop". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-duotone fa-" followed by the icon name, which is "fa-duotone fa-traffic-light-stop". 
 * A Font Awesome icon of "fa-duotone fa-traffic-light-stop" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the TrafficSimulation class will inherit the helpful inherited class comments from the super class TrafficSimulationGen. 
 * </p>
 * Rows: 100
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the TrafficSimulation API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Order: 8
 * <p>This class contains a comment <b>"Order: 8"</b>, which means this class will be sorted by the given number 8 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * SqlOrder: 2
 * <p>This class contains a comment <b>"SqlOrder: 2"</b>, which means this class will be sorted by the given number 2 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * Model: true
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulationPage. 
 * </p>
 * SuperPage.enUS: BaseModelPage
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseModelPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseModelPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulationPage extends org.computate.smartvillageview.enus.model.base.BaseModelPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TrafficSimulation Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
 * </p>
 * <p>
 *   Adding protected void methods beginning with an underscore with a Promise as the only parameter will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   <pre>
 *   
 *   	protected void _promiseBefore(Promise&lt;Void&gt; promise) {
 *   		promise.complete();
 *   	}
 *   </pre>
 * </p>
 * <p>
 *   Java classes with the `Model: true` will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   If a super class of this Java class with `Model: true`, then the child class will also inherit `Promise: true`. 
 * </p>
 * Role.enUS: SiteAdmin
 * <p>
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this TrafficSimulation API. 
 * It's possible to reconfigure the roles required to access the TrafficSimulation API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLE_REQUIRED_TrafficSimulation: ["SiteAdmin"]</pre>
 * AName.enUS: a traffic simulation
 * <p>This class contains a comment <b>"AName.enUS: a traffic simulation"</b>, which identifies the language context to describe a TrafficSimulation as "a traffic simulation". 
 * </p>
 * <p>
 * Delete the class TrafficSimulation in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.simulation in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smartabyar-smartvillage in Solr: 
 * curl -k 'https://solr-solr.apps-crc.testing/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smartabyar\-smartvillage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class TrafficSimulationGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficSimulation.class);

	public static final String TrafficSimulation_AName_enUS = "a traffic simulation";
	public static final String TrafficSimulation_This_enUS = "this ";
	public static final String TrafficSimulation_ThisName_enUS = "this traffic simulation";
	public static final String TrafficSimulation_A_enUS = "a ";
	public static final String TrafficSimulation_TheName_enUS = "the traffic simulation";
	public static final String TrafficSimulation_NameSingular_enUS = "traffic simulation";
	public static final String TrafficSimulation_NamePlural_enUS = "traffic simulations";
	public static final String TrafficSimulation_NameActual_enUS = "current traffic simulation";
	public static final String TrafficSimulation_AllName_enUS = "all the traffic simulations";
	public static final String TrafficSimulation_SearchAllNameBy_enUS = "search traffic simulations by ";
	public static final String TrafficSimulation_Title_enUS = "traffic simulations";
	public static final String TrafficSimulation_ThePluralName_enUS = "the traffic simulations";
	public static final String TrafficSimulation_NoNameFound_enUS = "no traffic simulation found";
	public static final String TrafficSimulation_ApiUri_enUS = "/api/traffic-simulation";
	public static final String TrafficSimulation_ApiUriSearchPage_enUS = "/traffic-simulation";
	public static final String TrafficSimulation_OfName_enUS = "of traffic simulation";
	public static final String TrafficSimulation_ANameAdjective_enUS = "a traffic simulation";
	public static final String TrafficSimulation_NameAdjectiveSingular_enUS = "traffic simulation";
	public static final String TrafficSimulation_NameAdjectivePlural_enUS = "traffic simulations";
	public static final String Search_enUS_Uri = "/api/traffic-simulation";
	public static final String Search_enUS_ImageUri = "/png/api/traffic-simulation-999.png";
	public static final String GET_enUS_Uri = "/api/traffic-simulation/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/traffic-simulation/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/traffic-simulation";
	public static final String PATCH_enUS_ImageUri = "/png/api/traffic-simulation-999.png";
	public static final String POST_enUS_Uri = "/api/traffic-simulation";
	public static final String POST_enUS_ImageUri = "/png/api/traffic-simulation-999.png";
	public static final String PUTImport_enUS_Uri = "/api/traffic-simulation-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/traffic-simulation-import-999.png";
	public static final String SearchPage_enUS_Uri = "/traffic-simulation";
	public static final String SearchPage_enUS_ImageUri = "/png/traffic-simulation-999.png";
	public static final String MapSearchPage_enUS_Uri = "/traffic-simulation-map";
	public static final String MapSearchPage_enUS_ImageUri = "/png/traffic-simulation-map-999.png";

	public static final String TrafficSimulation_Color = "2017-shaded-spruce";
	public static final String TrafficSimulation_IconGroup = "duotone";
	public static final String TrafficSimulation_IconName = "traffic-light-stop";
	public static final Integer TrafficSimulation_Rows = 100;

	///////////////////
	// startDateTime //
	///////////////////


	/**	 The entity startDateTime
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime startDateTime;

	/**	<br> The entity startDateTime
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:startDateTime">Find the entity startDateTime in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _startDateTime(Wrap<ZonedDateTime> w);

	public ZonedDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(ZonedDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	@JsonIgnore
	public void setStartDateTime(Instant o) {
		this.startDateTime = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setStartDateTime(String o) {
		this.startDateTime = TrafficSimulation.staticSetStartDateTime(siteRequest_, o);
	}
	public static ZonedDateTime staticSetStartDateTime(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(Optional.ofNullable(siteRequest_).map(r -> r.getConfig()).map(config -> config.getString(ConfigKeys.SITE_ZONE)).map(z -> ZoneId.of(z)).orElse(ZoneId.of("UTC"))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setStartDateTime(Date o) {
		this.startDateTime = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected TrafficSimulation startDateTimeInit() {
		Wrap<ZonedDateTime> startDateTimeWrap = new Wrap<ZonedDateTime>().var("startDateTime");
		if(startDateTime == null) {
			_startDateTime(startDateTimeWrap);
			setStartDateTime(startDateTimeWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Date staticSearchStartDateTime(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrStartDateTime(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqStartDateTime(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrStartDateTime(siteRequest_, TrafficSimulation.staticSearchStartDateTime(siteRequest_, TrafficSimulation.staticSetStartDateTime(siteRequest_, o)));
	}

	public OffsetDateTime sqlStartDateTime() {
		return startDateTime == null ? null : startDateTime.toOffsetDateTime();
	}

	////////////////////
	// simulationName //
	////////////////////


	/**	 The entity simulationName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String simulationName;

	/**	<br> The entity simulationName
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:simulationName">Find the entity simulationName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _simulationName(Wrap<String> w);

	public String getSimulationName() {
		return simulationName;
	}
	public void setSimulationName(String o) {
		this.simulationName = TrafficSimulation.staticSetSimulationName(siteRequest_, o);
	}
	public static String staticSetSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulation simulationNameInit() {
		Wrap<String> simulationNameWrap = new Wrap<String>().var("simulationName");
		if(simulationName == null) {
			_simulationName(simulationNameWrap);
			setSimulationName(simulationNameWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static String staticSearchSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSimulationName(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrSimulationName(siteRequest_, TrafficSimulation.staticSearchSimulationName(siteRequest_, TrafficSimulation.staticSetSimulationName(siteRequest_, o)));
	}

	public String sqlSimulationName() {
		return simulationName;
	}

	/////////////////
	// sumocfgPath //
	/////////////////


	/**	 The entity sumocfgPath
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sumocfgPath;

	/**	<br> The entity sumocfgPath
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:sumocfgPath">Find the entity sumocfgPath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sumocfgPath(Wrap<String> w);

	public String getSumocfgPath() {
		return sumocfgPath;
	}
	public void setSumocfgPath(String o) {
		this.sumocfgPath = TrafficSimulation.staticSetSumocfgPath(siteRequest_, o);
	}
	public static String staticSetSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulation sumocfgPathInit() {
		Wrap<String> sumocfgPathWrap = new Wrap<String>().var("sumocfgPath");
		if(sumocfgPath == null) {
			_sumocfgPath(sumocfgPathWrap);
			setSumocfgPath(sumocfgPathWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static String staticSearchSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSumocfgPath(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrSumocfgPath(siteRequest_, TrafficSimulation.staticSearchSumocfgPath(siteRequest_, TrafficSimulation.staticSetSumocfgPath(siteRequest_, o)));
	}

	public String sqlSumocfgPath() {
		return sumocfgPath;
	}

	/////////////////
	// fcdFilePath //
	/////////////////


	/**	 The entity fcdFilePath
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String fcdFilePath;

	/**	<br> The entity fcdFilePath
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:fcdFilePath">Find the entity fcdFilePath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _fcdFilePath(Wrap<String> w);

	public String getFcdFilePath() {
		return fcdFilePath;
	}
	public void setFcdFilePath(String o) {
		this.fcdFilePath = TrafficSimulation.staticSetFcdFilePath(siteRequest_, o);
	}
	public static String staticSetFcdFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulation fcdFilePathInit() {
		Wrap<String> fcdFilePathWrap = new Wrap<String>().var("fcdFilePath");
		if(fcdFilePath == null) {
			_fcdFilePath(fcdFilePathWrap);
			setFcdFilePath(fcdFilePathWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static String staticSearchFcdFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFcdFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFcdFilePath(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrFcdFilePath(siteRequest_, TrafficSimulation.staticSearchFcdFilePath(siteRequest_, TrafficSimulation.staticSetFcdFilePath(siteRequest_, o)));
	}

	public String sqlFcdFilePath() {
		return fcdFilePath;
	}

	/////////////////
	// netFilePath //
	/////////////////


	/**	 The entity netFilePath
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String netFilePath;

	/**	<br> The entity netFilePath
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:netFilePath">Find the entity netFilePath in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _netFilePath(Wrap<String> w);

	public String getNetFilePath() {
		return netFilePath;
	}
	public void setNetFilePath(String o) {
		this.netFilePath = TrafficSimulation.staticSetNetFilePath(siteRequest_, o);
	}
	public static String staticSetNetFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficSimulation netFilePathInit() {
		Wrap<String> netFilePathWrap = new Wrap<String>().var("netFilePath");
		if(netFilePath == null) {
			_netFilePath(netFilePathWrap);
			setNetFilePath(netFilePathWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static String staticSearchNetFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrNetFilePath(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqNetFilePath(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrNetFilePath(siteRequest_, TrafficSimulation.staticSearchNetFilePath(siteRequest_, TrafficSimulation.staticSetNetFilePath(siteRequest_, o)));
	}

	public String sqlNetFilePath() {
		return netFilePath;
	}

	//////////////////
	// startSeconds //
	//////////////////


	/**	 The entity startSeconds
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal startSeconds;

	/**	<br> The entity startSeconds
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:startSeconds">Find the entity startSeconds in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _startSeconds(Wrap<BigDecimal> w);

	public BigDecimal getStartSeconds() {
		return startSeconds;
	}

	public void setStartSeconds(BigDecimal startSeconds) {
		this.startSeconds = startSeconds;
	}
	@JsonIgnore
	public void setStartSeconds(String o) {
		this.startSeconds = TrafficSimulation.staticSetStartSeconds(siteRequest_, o);
	}
	public static BigDecimal staticSetStartSeconds(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setStartSeconds(Double o) {
		setStartSeconds(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setStartSeconds(Integer o) {
		setStartSeconds(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setStartSeconds(Number o) {
		setStartSeconds(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation startSecondsInit() {
		Wrap<BigDecimal> startSecondsWrap = new Wrap<BigDecimal>().var("startSeconds");
		if(startSeconds == null) {
			_startSeconds(startSecondsWrap);
			setStartSeconds(startSecondsWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchStartSeconds(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrStartSeconds(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStartSeconds(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrStartSeconds(siteRequest_, TrafficSimulation.staticSearchStartSeconds(siteRequest_, TrafficSimulation.staticSetStartSeconds(siteRequest_, o)));
	}

	public BigDecimal sqlStartSeconds() {
		return startSeconds;
	}

	////////////////
	// endSeconds //
	////////////////


	/**	 The entity endSeconds
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal endSeconds;

	/**	<br> The entity endSeconds
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:endSeconds">Find the entity endSeconds in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _endSeconds(Wrap<BigDecimal> w);

	public BigDecimal getEndSeconds() {
		return endSeconds;
	}

	public void setEndSeconds(BigDecimal endSeconds) {
		this.endSeconds = endSeconds;
	}
	@JsonIgnore
	public void setEndSeconds(String o) {
		this.endSeconds = TrafficSimulation.staticSetEndSeconds(siteRequest_, o);
	}
	public static BigDecimal staticSetEndSeconds(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setEndSeconds(Double o) {
		setEndSeconds(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setEndSeconds(Integer o) {
		setEndSeconds(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setEndSeconds(Number o) {
		setEndSeconds(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation endSecondsInit() {
		Wrap<BigDecimal> endSecondsWrap = new Wrap<BigDecimal>().var("endSeconds");
		if(endSeconds == null) {
			_endSeconds(endSecondsWrap);
			setEndSeconds(endSecondsWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchEndSeconds(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrEndSeconds(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqEndSeconds(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrEndSeconds(siteRequest_, TrafficSimulation.staticSearchEndSeconds(siteRequest_, TrafficSimulation.staticSetEndSeconds(siteRequest_, o)));
	}

	public BigDecimal sqlEndSeconds() {
		return endSeconds;
	}

	/////////////////
	// stepSeconds //
	/////////////////


	/**	 The entity stepSeconds
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal stepSeconds;

	/**	<br> The entity stepSeconds
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:stepSeconds">Find the entity stepSeconds in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stepSeconds(Wrap<BigDecimal> w);

	public BigDecimal getStepSeconds() {
		return stepSeconds;
	}

	public void setStepSeconds(BigDecimal stepSeconds) {
		this.stepSeconds = stepSeconds;
	}
	@JsonIgnore
	public void setStepSeconds(String o) {
		this.stepSeconds = TrafficSimulation.staticSetStepSeconds(siteRequest_, o);
	}
	public static BigDecimal staticSetStepSeconds(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setStepSeconds(Double o) {
		setStepSeconds(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setStepSeconds(Integer o) {
		setStepSeconds(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setStepSeconds(Number o) {
		setStepSeconds(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation stepSecondsInit() {
		Wrap<BigDecimal> stepSecondsWrap = new Wrap<BigDecimal>().var("stepSeconds");
		if(stepSeconds == null) {
			_stepSeconds(stepSecondsWrap);
			setStepSeconds(stepSecondsWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchStepSeconds(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrStepSeconds(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStepSeconds(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrStepSeconds(siteRequest_, TrafficSimulation.staticSearchStepSeconds(siteRequest_, TrafficSimulation.staticSetStepSeconds(siteRequest_, o)));
	}

	public BigDecimal sqlStepSeconds() {
		return stepSeconds;
	}

	/////////////////////////////////////////
	// paramAvgVehiclePerMinFromWestToEast //
	/////////////////////////////////////////


	/**	 The entity paramAvgVehiclePerMinFromWestToEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramAvgVehiclePerMinFromWestToEast;

	/**	<br> The entity paramAvgVehiclePerMinFromWestToEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramAvgVehiclePerMinFromWestToEast">Find the entity paramAvgVehiclePerMinFromWestToEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramAvgVehiclePerMinFromWestToEast(Wrap<BigDecimal> w);

	public BigDecimal getParamAvgVehiclePerMinFromWestToEast() {
		return paramAvgVehiclePerMinFromWestToEast;
	}

	public void setParamAvgVehiclePerMinFromWestToEast(BigDecimal paramAvgVehiclePerMinFromWestToEast) {
		this.paramAvgVehiclePerMinFromWestToEast = paramAvgVehiclePerMinFromWestToEast;
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromWestToEast(String o) {
		this.paramAvgVehiclePerMinFromWestToEast = TrafficSimulation.staticSetParamAvgVehiclePerMinFromWestToEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromWestToEast(Double o) {
		setParamAvgVehiclePerMinFromWestToEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromWestToEast(Integer o) {
		setParamAvgVehiclePerMinFromWestToEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromWestToEast(Number o) {
		setParamAvgVehiclePerMinFromWestToEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramAvgVehiclePerMinFromWestToEastInit() {
		Wrap<BigDecimal> paramAvgVehiclePerMinFromWestToEastWrap = new Wrap<BigDecimal>().var("paramAvgVehiclePerMinFromWestToEast");
		if(paramAvgVehiclePerMinFromWestToEast == null) {
			_paramAvgVehiclePerMinFromWestToEast(paramAvgVehiclePerMinFromWestToEastWrap);
			setParamAvgVehiclePerMinFromWestToEast(paramAvgVehiclePerMinFromWestToEastWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgVehiclePerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamAvgVehiclePerMinFromWestToEast(siteRequest_, TrafficSimulation.staticSearchParamAvgVehiclePerMinFromWestToEast(siteRequest_, TrafficSimulation.staticSetParamAvgVehiclePerMinFromWestToEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamAvgVehiclePerMinFromWestToEast() {
		return paramAvgVehiclePerMinFromWestToEast;
	}

	///////////////////////////////////////////
	// paramAvgVehiclePerMinFromSouthToNorth //
	///////////////////////////////////////////


	/**	 The entity paramAvgVehiclePerMinFromSouthToNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramAvgVehiclePerMinFromSouthToNorth;

	/**	<br> The entity paramAvgVehiclePerMinFromSouthToNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramAvgVehiclePerMinFromSouthToNorth">Find the entity paramAvgVehiclePerMinFromSouthToNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramAvgVehiclePerMinFromSouthToNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamAvgVehiclePerMinFromSouthToNorth() {
		return paramAvgVehiclePerMinFromSouthToNorth;
	}

	public void setParamAvgVehiclePerMinFromSouthToNorth(BigDecimal paramAvgVehiclePerMinFromSouthToNorth) {
		this.paramAvgVehiclePerMinFromSouthToNorth = paramAvgVehiclePerMinFromSouthToNorth;
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromSouthToNorth(String o) {
		this.paramAvgVehiclePerMinFromSouthToNorth = TrafficSimulation.staticSetParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromSouthToNorth(Double o) {
		setParamAvgVehiclePerMinFromSouthToNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromSouthToNorth(Integer o) {
		setParamAvgVehiclePerMinFromSouthToNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgVehiclePerMinFromSouthToNorth(Number o) {
		setParamAvgVehiclePerMinFromSouthToNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramAvgVehiclePerMinFromSouthToNorthInit() {
		Wrap<BigDecimal> paramAvgVehiclePerMinFromSouthToNorthWrap = new Wrap<BigDecimal>().var("paramAvgVehiclePerMinFromSouthToNorth");
		if(paramAvgVehiclePerMinFromSouthToNorth == null) {
			_paramAvgVehiclePerMinFromSouthToNorth(paramAvgVehiclePerMinFromSouthToNorthWrap);
			setParamAvgVehiclePerMinFromSouthToNorth(paramAvgVehiclePerMinFromSouthToNorthWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgVehiclePerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, TrafficSimulation.staticSearchParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, TrafficSimulation.staticSetParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamAvgVehiclePerMinFromSouthToNorth() {
		return paramAvgVehiclePerMinFromSouthToNorth;
	}

	/////////////////////////////////////
	// paramVehicleDemandScalingFactor //
	/////////////////////////////////////


	/**	 The entity paramVehicleDemandScalingFactor
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramVehicleDemandScalingFactor;

	/**	<br> The entity paramVehicleDemandScalingFactor
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramVehicleDemandScalingFactor">Find the entity paramVehicleDemandScalingFactor in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramVehicleDemandScalingFactor(Wrap<BigDecimal> w);

	public BigDecimal getParamVehicleDemandScalingFactor() {
		return paramVehicleDemandScalingFactor;
	}

	public void setParamVehicleDemandScalingFactor(BigDecimal paramVehicleDemandScalingFactor) {
		this.paramVehicleDemandScalingFactor = paramVehicleDemandScalingFactor;
	}
	@JsonIgnore
	public void setParamVehicleDemandScalingFactor(String o) {
		this.paramVehicleDemandScalingFactor = TrafficSimulation.staticSetParamVehicleDemandScalingFactor(siteRequest_, o);
	}
	public static BigDecimal staticSetParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamVehicleDemandScalingFactor(Double o) {
		setParamVehicleDemandScalingFactor(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleDemandScalingFactor(Integer o) {
		setParamVehicleDemandScalingFactor(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleDemandScalingFactor(Number o) {
		setParamVehicleDemandScalingFactor(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramVehicleDemandScalingFactorInit() {
		Wrap<BigDecimal> paramVehicleDemandScalingFactorWrap = new Wrap<BigDecimal>().var("paramVehicleDemandScalingFactor");
		if(paramVehicleDemandScalingFactor == null) {
			_paramVehicleDemandScalingFactor(paramVehicleDemandScalingFactorWrap);
			setParamVehicleDemandScalingFactor(paramVehicleDemandScalingFactorWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamVehicleDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamVehicleDemandScalingFactor(siteRequest_, TrafficSimulation.staticSearchParamVehicleDemandScalingFactor(siteRequest_, TrafficSimulation.staticSetParamVehicleDemandScalingFactor(siteRequest_, o)));
	}

	public BigDecimal sqlParamVehicleDemandScalingFactor() {
		return paramVehicleDemandScalingFactor;
	}

	////////////////////////////////////////////
	// paramAvgPedestrianPerMinFromWestToEast //
	////////////////////////////////////////////


	/**	 The entity paramAvgPedestrianPerMinFromWestToEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramAvgPedestrianPerMinFromWestToEast;

	/**	<br> The entity paramAvgPedestrianPerMinFromWestToEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramAvgPedestrianPerMinFromWestToEast">Find the entity paramAvgPedestrianPerMinFromWestToEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramAvgPedestrianPerMinFromWestToEast(Wrap<BigDecimal> w);

	public BigDecimal getParamAvgPedestrianPerMinFromWestToEast() {
		return paramAvgPedestrianPerMinFromWestToEast;
	}

	public void setParamAvgPedestrianPerMinFromWestToEast(BigDecimal paramAvgPedestrianPerMinFromWestToEast) {
		this.paramAvgPedestrianPerMinFromWestToEast = paramAvgPedestrianPerMinFromWestToEast;
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromWestToEast(String o) {
		this.paramAvgPedestrianPerMinFromWestToEast = TrafficSimulation.staticSetParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromWestToEast(Double o) {
		setParamAvgPedestrianPerMinFromWestToEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromWestToEast(Integer o) {
		setParamAvgPedestrianPerMinFromWestToEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromWestToEast(Number o) {
		setParamAvgPedestrianPerMinFromWestToEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramAvgPedestrianPerMinFromWestToEastInit() {
		Wrap<BigDecimal> paramAvgPedestrianPerMinFromWestToEastWrap = new Wrap<BigDecimal>().var("paramAvgPedestrianPerMinFromWestToEast");
		if(paramAvgPedestrianPerMinFromWestToEast == null) {
			_paramAvgPedestrianPerMinFromWestToEast(paramAvgPedestrianPerMinFromWestToEastWrap);
			setParamAvgPedestrianPerMinFromWestToEast(paramAvgPedestrianPerMinFromWestToEastWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgPedestrianPerMinFromWestToEast(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamAvgPedestrianPerMinFromWestToEast(siteRequest_, TrafficSimulation.staticSearchParamAvgPedestrianPerMinFromWestToEast(siteRequest_, TrafficSimulation.staticSetParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamAvgPedestrianPerMinFromWestToEast() {
		return paramAvgPedestrianPerMinFromWestToEast;
	}

	//////////////////////////////////////////////
	// paramAvgPedestrianPerMinFromSouthToNorth //
	//////////////////////////////////////////////


	/**	 The entity paramAvgPedestrianPerMinFromSouthToNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramAvgPedestrianPerMinFromSouthToNorth;

	/**	<br> The entity paramAvgPedestrianPerMinFromSouthToNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramAvgPedestrianPerMinFromSouthToNorth">Find the entity paramAvgPedestrianPerMinFromSouthToNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramAvgPedestrianPerMinFromSouthToNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamAvgPedestrianPerMinFromSouthToNorth() {
		return paramAvgPedestrianPerMinFromSouthToNorth;
	}

	public void setParamAvgPedestrianPerMinFromSouthToNorth(BigDecimal paramAvgPedestrianPerMinFromSouthToNorth) {
		this.paramAvgPedestrianPerMinFromSouthToNorth = paramAvgPedestrianPerMinFromSouthToNorth;
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromSouthToNorth(String o) {
		this.paramAvgPedestrianPerMinFromSouthToNorth = TrafficSimulation.staticSetParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromSouthToNorth(Double o) {
		setParamAvgPedestrianPerMinFromSouthToNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromSouthToNorth(Integer o) {
		setParamAvgPedestrianPerMinFromSouthToNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamAvgPedestrianPerMinFromSouthToNorth(Number o) {
		setParamAvgPedestrianPerMinFromSouthToNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramAvgPedestrianPerMinFromSouthToNorthInit() {
		Wrap<BigDecimal> paramAvgPedestrianPerMinFromSouthToNorthWrap = new Wrap<BigDecimal>().var("paramAvgPedestrianPerMinFromSouthToNorth");
		if(paramAvgPedestrianPerMinFromSouthToNorth == null) {
			_paramAvgPedestrianPerMinFromSouthToNorth(paramAvgPedestrianPerMinFromSouthToNorthWrap);
			setParamAvgPedestrianPerMinFromSouthToNorth(paramAvgPedestrianPerMinFromSouthToNorthWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamAvgPedestrianPerMinFromSouthToNorth(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, TrafficSimulation.staticSearchParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, TrafficSimulation.staticSetParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamAvgPedestrianPerMinFromSouthToNorth() {
		return paramAvgPedestrianPerMinFromSouthToNorth;
	}

	////////////////////////////////////////
	// paramPedestrianDemandScalingFactor //
	////////////////////////////////////////


	/**	 The entity paramPedestrianDemandScalingFactor
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianDemandScalingFactor;

	/**	<br> The entity paramPedestrianDemandScalingFactor
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramPedestrianDemandScalingFactor">Find the entity paramPedestrianDemandScalingFactor in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianDemandScalingFactor(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianDemandScalingFactor() {
		return paramPedestrianDemandScalingFactor;
	}

	public void setParamPedestrianDemandScalingFactor(BigDecimal paramPedestrianDemandScalingFactor) {
		this.paramPedestrianDemandScalingFactor = paramPedestrianDemandScalingFactor;
	}
	@JsonIgnore
	public void setParamPedestrianDemandScalingFactor(String o) {
		this.paramPedestrianDemandScalingFactor = TrafficSimulation.staticSetParamPedestrianDemandScalingFactor(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianDemandScalingFactor(Double o) {
		setParamPedestrianDemandScalingFactor(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianDemandScalingFactor(Integer o) {
		setParamPedestrianDemandScalingFactor(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianDemandScalingFactor(Number o) {
		setParamPedestrianDemandScalingFactor(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramPedestrianDemandScalingFactorInit() {
		Wrap<BigDecimal> paramPedestrianDemandScalingFactorWrap = new Wrap<BigDecimal>().var("paramPedestrianDemandScalingFactor");
		if(paramPedestrianDemandScalingFactor == null) {
			_paramPedestrianDemandScalingFactor(paramPedestrianDemandScalingFactorWrap);
			setParamPedestrianDemandScalingFactor(paramPedestrianDemandScalingFactorWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianDemandScalingFactor(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamPedestrianDemandScalingFactor(siteRequest_, TrafficSimulation.staticSearchParamPedestrianDemandScalingFactor(siteRequest_, TrafficSimulation.staticSetParamPedestrianDemandScalingFactor(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianDemandScalingFactor() {
		return paramPedestrianDemandScalingFactor;
	}

	//////////////////////
	// paramDemandScale //
	//////////////////////


	/**	 The entity paramDemandScale
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<BigDecimal> paramDemandScale = new ArrayList<BigDecimal>();

	/**	<br> The entity paramDemandScale
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramDemandScale">Find the entity paramDemandScale in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _paramDemandScale(List<BigDecimal> l);

	public List<BigDecimal> getParamDemandScale() {
		return paramDemandScale;
	}

	public void setParamDemandScale(List<BigDecimal> paramDemandScale) {
		this.paramDemandScale = paramDemandScale;
	}
	@JsonIgnore
	public void setParamDemandScale(String o) {
		BigDecimal l = TrafficSimulation.staticSetParamDemandScale(siteRequest_, o);
		if(l != null)
			addParamDemandScale(l);
	}
	public static BigDecimal staticSetParamDemandScale(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamDemandScale(Double o) {
		addParamDemandScale(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamDemandScale(Integer o) {
		addParamDemandScale(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamDemandScale(Number o) {
		addParamDemandScale(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	public TrafficSimulation addParamDemandScale(BigDecimal...objects) {
		for(BigDecimal o : objects) {
			addParamDemandScale(o);
		}
		return (TrafficSimulation)this;
	}
	public TrafficSimulation addParamDemandScale(BigDecimal o) {
		if(o != null)
			this.paramDemandScale.add(o);
		return (TrafficSimulation)this;
	}
	@JsonIgnore
	public void setParamDemandScale(JsonArray objects) {
		paramDemandScale.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addParamDemandScale(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
		}
	}
	public TrafficSimulation addParamDemandScale(String o) {
		if(NumberUtils.isParsable(o)) {
			BigDecimal p = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
			addParamDemandScale(p);
		}
		return (TrafficSimulation)this;
	}
	protected TrafficSimulation paramDemandScaleInit() {
		_paramDemandScale(paramDemandScale);
		return (TrafficSimulation)this;
	}

	public static BigDecimal staticSearchParamDemandScale(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o;
	}

	public static String staticSearchStrParamDemandScale(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamDemandScale(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamDemandScale(siteRequest_, TrafficSimulation.staticSearchParamDemandScale(siteRequest_, TrafficSimulation.staticSetParamDemandScale(siteRequest_, o)));
	}

	public Number[] sqlParamDemandScale() {
		return paramDemandScale.stream().map(v -> (Number)v).toArray(Number[]::new);
	}

	//////////////////////////////////
	// paramMinGreenTimeSecWestEast //
	//////////////////////////////////


	/**	 The entity paramMinGreenTimeSecWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramMinGreenTimeSecWestEast;

	/**	<br> The entity paramMinGreenTimeSecWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramMinGreenTimeSecWestEast">Find the entity paramMinGreenTimeSecWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramMinGreenTimeSecWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamMinGreenTimeSecWestEast() {
		return paramMinGreenTimeSecWestEast;
	}

	public void setParamMinGreenTimeSecWestEast(BigDecimal paramMinGreenTimeSecWestEast) {
		this.paramMinGreenTimeSecWestEast = paramMinGreenTimeSecWestEast;
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecWestEast(String o) {
		this.paramMinGreenTimeSecWestEast = TrafficSimulation.staticSetParamMinGreenTimeSecWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecWestEast(Double o) {
		setParamMinGreenTimeSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecWestEast(Integer o) {
		setParamMinGreenTimeSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecWestEast(Number o) {
		setParamMinGreenTimeSecWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramMinGreenTimeSecWestEastInit() {
		Wrap<BigDecimal> paramMinGreenTimeSecWestEastWrap = new Wrap<BigDecimal>().var("paramMinGreenTimeSecWestEast");
		if(paramMinGreenTimeSecWestEast == null) {
			_paramMinGreenTimeSecWestEast(paramMinGreenTimeSecWestEastWrap);
			setParamMinGreenTimeSecWestEast(paramMinGreenTimeSecWestEastWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMinGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamMinGreenTimeSecWestEast(siteRequest_, TrafficSimulation.staticSearchParamMinGreenTimeSecWestEast(siteRequest_, TrafficSimulation.staticSetParamMinGreenTimeSecWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamMinGreenTimeSecWestEast() {
		return paramMinGreenTimeSecWestEast;
	}

	//////////////////////////////////
	// paramMaxGreenTimeSecWestEast //
	//////////////////////////////////


	/**	 The entity paramMaxGreenTimeSecWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramMaxGreenTimeSecWestEast;

	/**	<br> The entity paramMaxGreenTimeSecWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramMaxGreenTimeSecWestEast">Find the entity paramMaxGreenTimeSecWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramMaxGreenTimeSecWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamMaxGreenTimeSecWestEast() {
		return paramMaxGreenTimeSecWestEast;
	}

	public void setParamMaxGreenTimeSecWestEast(BigDecimal paramMaxGreenTimeSecWestEast) {
		this.paramMaxGreenTimeSecWestEast = paramMaxGreenTimeSecWestEast;
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecWestEast(String o) {
		this.paramMaxGreenTimeSecWestEast = TrafficSimulation.staticSetParamMaxGreenTimeSecWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecWestEast(Double o) {
		setParamMaxGreenTimeSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecWestEast(Integer o) {
		setParamMaxGreenTimeSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecWestEast(Number o) {
		setParamMaxGreenTimeSecWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramMaxGreenTimeSecWestEastInit() {
		Wrap<BigDecimal> paramMaxGreenTimeSecWestEastWrap = new Wrap<BigDecimal>().var("paramMaxGreenTimeSecWestEast");
		if(paramMaxGreenTimeSecWestEast == null) {
			_paramMaxGreenTimeSecWestEast(paramMaxGreenTimeSecWestEastWrap);
			setParamMaxGreenTimeSecWestEast(paramMaxGreenTimeSecWestEastWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMaxGreenTimeSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamMaxGreenTimeSecWestEast(siteRequest_, TrafficSimulation.staticSearchParamMaxGreenTimeSecWestEast(siteRequest_, TrafficSimulation.staticSetParamMaxGreenTimeSecWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamMaxGreenTimeSecWestEast() {
		return paramMaxGreenTimeSecWestEast;
	}

	////////////////////////////////////
	// paramMinGreenTimeSecSouthNorth //
	////////////////////////////////////


	/**	 The entity paramMinGreenTimeSecSouthNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramMinGreenTimeSecSouthNorth;

	/**	<br> The entity paramMinGreenTimeSecSouthNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramMinGreenTimeSecSouthNorth">Find the entity paramMinGreenTimeSecSouthNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramMinGreenTimeSecSouthNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamMinGreenTimeSecSouthNorth() {
		return paramMinGreenTimeSecSouthNorth;
	}

	public void setParamMinGreenTimeSecSouthNorth(BigDecimal paramMinGreenTimeSecSouthNorth) {
		this.paramMinGreenTimeSecSouthNorth = paramMinGreenTimeSecSouthNorth;
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecSouthNorth(String o) {
		this.paramMinGreenTimeSecSouthNorth = TrafficSimulation.staticSetParamMinGreenTimeSecSouthNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecSouthNorth(Double o) {
		setParamMinGreenTimeSecSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecSouthNorth(Integer o) {
		setParamMinGreenTimeSecSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMinGreenTimeSecSouthNorth(Number o) {
		setParamMinGreenTimeSecSouthNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramMinGreenTimeSecSouthNorthInit() {
		Wrap<BigDecimal> paramMinGreenTimeSecSouthNorthWrap = new Wrap<BigDecimal>().var("paramMinGreenTimeSecSouthNorth");
		if(paramMinGreenTimeSecSouthNorth == null) {
			_paramMinGreenTimeSecSouthNorth(paramMinGreenTimeSecSouthNorthWrap);
			setParamMinGreenTimeSecSouthNorth(paramMinGreenTimeSecSouthNorthWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMinGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamMinGreenTimeSecSouthNorth(siteRequest_, TrafficSimulation.staticSearchParamMinGreenTimeSecSouthNorth(siteRequest_, TrafficSimulation.staticSetParamMinGreenTimeSecSouthNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamMinGreenTimeSecSouthNorth() {
		return paramMinGreenTimeSecSouthNorth;
	}

	////////////////////////////////////
	// paramMaxGreenTimeSecSouthNorth //
	////////////////////////////////////


	/**	 The entity paramMaxGreenTimeSecSouthNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramMaxGreenTimeSecSouthNorth;

	/**	<br> The entity paramMaxGreenTimeSecSouthNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramMaxGreenTimeSecSouthNorth">Find the entity paramMaxGreenTimeSecSouthNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramMaxGreenTimeSecSouthNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamMaxGreenTimeSecSouthNorth() {
		return paramMaxGreenTimeSecSouthNorth;
	}

	public void setParamMaxGreenTimeSecSouthNorth(BigDecimal paramMaxGreenTimeSecSouthNorth) {
		this.paramMaxGreenTimeSecSouthNorth = paramMaxGreenTimeSecSouthNorth;
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecSouthNorth(String o) {
		this.paramMaxGreenTimeSecSouthNorth = TrafficSimulation.staticSetParamMaxGreenTimeSecSouthNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecSouthNorth(Double o) {
		setParamMaxGreenTimeSecSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecSouthNorth(Integer o) {
		setParamMaxGreenTimeSecSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamMaxGreenTimeSecSouthNorth(Number o) {
		setParamMaxGreenTimeSecSouthNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramMaxGreenTimeSecSouthNorthInit() {
		Wrap<BigDecimal> paramMaxGreenTimeSecSouthNorthWrap = new Wrap<BigDecimal>().var("paramMaxGreenTimeSecSouthNorth");
		if(paramMaxGreenTimeSecSouthNorth == null) {
			_paramMaxGreenTimeSecSouthNorth(paramMaxGreenTimeSecSouthNorthWrap);
			setParamMaxGreenTimeSecSouthNorth(paramMaxGreenTimeSecSouthNorthWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamMaxGreenTimeSecSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamMaxGreenTimeSecSouthNorth(siteRequest_, TrafficSimulation.staticSearchParamMaxGreenTimeSecSouthNorth(siteRequest_, TrafficSimulation.staticSetParamMaxGreenTimeSecSouthNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamMaxGreenTimeSecSouthNorth() {
		return paramMaxGreenTimeSecSouthNorth;
	}

	///////////////////////////////////////////////
	// paramPedestrianWaitThresholdSecNorthSouth //
	///////////////////////////////////////////////


	/**	 The entity paramPedestrianWaitThresholdSecNorthSouth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianWaitThresholdSecNorthSouth;

	/**	<br> The entity paramPedestrianWaitThresholdSecNorthSouth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramPedestrianWaitThresholdSecNorthSouth">Find the entity paramPedestrianWaitThresholdSecNorthSouth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianWaitThresholdSecNorthSouth(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianWaitThresholdSecNorthSouth() {
		return paramPedestrianWaitThresholdSecNorthSouth;
	}

	public void setParamPedestrianWaitThresholdSecNorthSouth(BigDecimal paramPedestrianWaitThresholdSecNorthSouth) {
		this.paramPedestrianWaitThresholdSecNorthSouth = paramPedestrianWaitThresholdSecNorthSouth;
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecNorthSouth(String o) {
		this.paramPedestrianWaitThresholdSecNorthSouth = TrafficSimulation.staticSetParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecNorthSouth(Double o) {
		setParamPedestrianWaitThresholdSecNorthSouth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecNorthSouth(Integer o) {
		setParamPedestrianWaitThresholdSecNorthSouth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecNorthSouth(Number o) {
		setParamPedestrianWaitThresholdSecNorthSouth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramPedestrianWaitThresholdSecNorthSouthInit() {
		Wrap<BigDecimal> paramPedestrianWaitThresholdSecNorthSouthWrap = new Wrap<BigDecimal>().var("paramPedestrianWaitThresholdSecNorthSouth");
		if(paramPedestrianWaitThresholdSecNorthSouth == null) {
			_paramPedestrianWaitThresholdSecNorthSouth(paramPedestrianWaitThresholdSecNorthSouthWrap);
			setParamPedestrianWaitThresholdSecNorthSouth(paramPedestrianWaitThresholdSecNorthSouthWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianWaitThresholdSecNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, TrafficSimulation.staticSearchParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, TrafficSimulation.staticSetParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianWaitThresholdSecNorthSouth() {
		return paramPedestrianWaitThresholdSecNorthSouth;
	}

	/////////////////////////////////////////////
	// paramPedestrianWaitThresholdSecWestEast //
	/////////////////////////////////////////////


	/**	 The entity paramPedestrianWaitThresholdSecWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianWaitThresholdSecWestEast;

	/**	<br> The entity paramPedestrianWaitThresholdSecWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramPedestrianWaitThresholdSecWestEast">Find the entity paramPedestrianWaitThresholdSecWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianWaitThresholdSecWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianWaitThresholdSecWestEast() {
		return paramPedestrianWaitThresholdSecWestEast;
	}

	public void setParamPedestrianWaitThresholdSecWestEast(BigDecimal paramPedestrianWaitThresholdSecWestEast) {
		this.paramPedestrianWaitThresholdSecWestEast = paramPedestrianWaitThresholdSecWestEast;
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecWestEast(String o) {
		this.paramPedestrianWaitThresholdSecWestEast = TrafficSimulation.staticSetParamPedestrianWaitThresholdSecWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecWestEast(Double o) {
		setParamPedestrianWaitThresholdSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecWestEast(Integer o) {
		setParamPedestrianWaitThresholdSecWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianWaitThresholdSecWestEast(Number o) {
		setParamPedestrianWaitThresholdSecWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramPedestrianWaitThresholdSecWestEastInit() {
		Wrap<BigDecimal> paramPedestrianWaitThresholdSecWestEastWrap = new Wrap<BigDecimal>().var("paramPedestrianWaitThresholdSecWestEast");
		if(paramPedestrianWaitThresholdSecWestEast == null) {
			_paramPedestrianWaitThresholdSecWestEast(paramPedestrianWaitThresholdSecWestEastWrap);
			setParamPedestrianWaitThresholdSecWestEast(paramPedestrianWaitThresholdSecWestEastWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianWaitThresholdSecWestEast(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamPedestrianWaitThresholdSecWestEast(siteRequest_, TrafficSimulation.staticSearchParamPedestrianWaitThresholdSecWestEast(siteRequest_, TrafficSimulation.staticSetParamPedestrianWaitThresholdSecWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianWaitThresholdSecWestEast() {
		return paramPedestrianWaitThresholdSecWestEast;
	}

	////////////////////////////////////////
	// paramVehicleQueueThresholdWestEast //
	////////////////////////////////////////


	/**	 The entity paramVehicleQueueThresholdWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramVehicleQueueThresholdWestEast;

	/**	<br> The entity paramVehicleQueueThresholdWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramVehicleQueueThresholdWestEast">Find the entity paramVehicleQueueThresholdWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramVehicleQueueThresholdWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamVehicleQueueThresholdWestEast() {
		return paramVehicleQueueThresholdWestEast;
	}

	public void setParamVehicleQueueThresholdWestEast(BigDecimal paramVehicleQueueThresholdWestEast) {
		this.paramVehicleQueueThresholdWestEast = paramVehicleQueueThresholdWestEast;
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdWestEast(String o) {
		this.paramVehicleQueueThresholdWestEast = TrafficSimulation.staticSetParamVehicleQueueThresholdWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdWestEast(Double o) {
		setParamVehicleQueueThresholdWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdWestEast(Integer o) {
		setParamVehicleQueueThresholdWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdWestEast(Number o) {
		setParamVehicleQueueThresholdWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramVehicleQueueThresholdWestEastInit() {
		Wrap<BigDecimal> paramVehicleQueueThresholdWestEastWrap = new Wrap<BigDecimal>().var("paramVehicleQueueThresholdWestEast");
		if(paramVehicleQueueThresholdWestEast == null) {
			_paramVehicleQueueThresholdWestEast(paramVehicleQueueThresholdWestEastWrap);
			setParamVehicleQueueThresholdWestEast(paramVehicleQueueThresholdWestEastWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamVehicleQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamVehicleQueueThresholdWestEast(siteRequest_, TrafficSimulation.staticSearchParamVehicleQueueThresholdWestEast(siteRequest_, TrafficSimulation.staticSetParamVehicleQueueThresholdWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamVehicleQueueThresholdWestEast() {
		return paramVehicleQueueThresholdWestEast;
	}

	//////////////////////////////////////////
	// paramVehicleQueueThresholdSouthNorth //
	//////////////////////////////////////////


	/**	 The entity paramVehicleQueueThresholdSouthNorth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramVehicleQueueThresholdSouthNorth;

	/**	<br> The entity paramVehicleQueueThresholdSouthNorth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramVehicleQueueThresholdSouthNorth">Find the entity paramVehicleQueueThresholdSouthNorth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramVehicleQueueThresholdSouthNorth(Wrap<BigDecimal> w);

	public BigDecimal getParamVehicleQueueThresholdSouthNorth() {
		return paramVehicleQueueThresholdSouthNorth;
	}

	public void setParamVehicleQueueThresholdSouthNorth(BigDecimal paramVehicleQueueThresholdSouthNorth) {
		this.paramVehicleQueueThresholdSouthNorth = paramVehicleQueueThresholdSouthNorth;
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdSouthNorth(String o) {
		this.paramVehicleQueueThresholdSouthNorth = TrafficSimulation.staticSetParamVehicleQueueThresholdSouthNorth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdSouthNorth(Double o) {
		setParamVehicleQueueThresholdSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdSouthNorth(Integer o) {
		setParamVehicleQueueThresholdSouthNorth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamVehicleQueueThresholdSouthNorth(Number o) {
		setParamVehicleQueueThresholdSouthNorth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramVehicleQueueThresholdSouthNorthInit() {
		Wrap<BigDecimal> paramVehicleQueueThresholdSouthNorthWrap = new Wrap<BigDecimal>().var("paramVehicleQueueThresholdSouthNorth");
		if(paramVehicleQueueThresholdSouthNorth == null) {
			_paramVehicleQueueThresholdSouthNorth(paramVehicleQueueThresholdSouthNorthWrap);
			setParamVehicleQueueThresholdSouthNorth(paramVehicleQueueThresholdSouthNorthWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamVehicleQueueThresholdSouthNorth(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamVehicleQueueThresholdSouthNorth(siteRequest_, TrafficSimulation.staticSearchParamVehicleQueueThresholdSouthNorth(siteRequest_, TrafficSimulation.staticSetParamVehicleQueueThresholdSouthNorth(siteRequest_, o)));
	}

	public BigDecimal sqlParamVehicleQueueThresholdSouthNorth() {
		return paramVehicleQueueThresholdSouthNorth;
	}

	/////////////////////////////////////////////
	// paramPedestrianQueueThresholdNorthSouth //
	/////////////////////////////////////////////


	/**	 The entity paramPedestrianQueueThresholdNorthSouth
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianQueueThresholdNorthSouth;

	/**	<br> The entity paramPedestrianQueueThresholdNorthSouth
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramPedestrianQueueThresholdNorthSouth">Find the entity paramPedestrianQueueThresholdNorthSouth in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianQueueThresholdNorthSouth(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianQueueThresholdNorthSouth() {
		return paramPedestrianQueueThresholdNorthSouth;
	}

	public void setParamPedestrianQueueThresholdNorthSouth(BigDecimal paramPedestrianQueueThresholdNorthSouth) {
		this.paramPedestrianQueueThresholdNorthSouth = paramPedestrianQueueThresholdNorthSouth;
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdNorthSouth(String o) {
		this.paramPedestrianQueueThresholdNorthSouth = TrafficSimulation.staticSetParamPedestrianQueueThresholdNorthSouth(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdNorthSouth(Double o) {
		setParamPedestrianQueueThresholdNorthSouth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdNorthSouth(Integer o) {
		setParamPedestrianQueueThresholdNorthSouth(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdNorthSouth(Number o) {
		setParamPedestrianQueueThresholdNorthSouth(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramPedestrianQueueThresholdNorthSouthInit() {
		Wrap<BigDecimal> paramPedestrianQueueThresholdNorthSouthWrap = new Wrap<BigDecimal>().var("paramPedestrianQueueThresholdNorthSouth");
		if(paramPedestrianQueueThresholdNorthSouth == null) {
			_paramPedestrianQueueThresholdNorthSouth(paramPedestrianQueueThresholdNorthSouthWrap);
			setParamPedestrianQueueThresholdNorthSouth(paramPedestrianQueueThresholdNorthSouthWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianQueueThresholdNorthSouth(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamPedestrianQueueThresholdNorthSouth(siteRequest_, TrafficSimulation.staticSearchParamPedestrianQueueThresholdNorthSouth(siteRequest_, TrafficSimulation.staticSetParamPedestrianQueueThresholdNorthSouth(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianQueueThresholdNorthSouth() {
		return paramPedestrianQueueThresholdNorthSouth;
	}

	///////////////////////////////////////////
	// paramPedestrianQueueThresholdWestEast //
	///////////////////////////////////////////


	/**	 The entity paramPedestrianQueueThresholdWestEast
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramPedestrianQueueThresholdWestEast;

	/**	<br> The entity paramPedestrianQueueThresholdWestEast
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramPedestrianQueueThresholdWestEast">Find the entity paramPedestrianQueueThresholdWestEast in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramPedestrianQueueThresholdWestEast(Wrap<BigDecimal> w);

	public BigDecimal getParamPedestrianQueueThresholdWestEast() {
		return paramPedestrianQueueThresholdWestEast;
	}

	public void setParamPedestrianQueueThresholdWestEast(BigDecimal paramPedestrianQueueThresholdWestEast) {
		this.paramPedestrianQueueThresholdWestEast = paramPedestrianQueueThresholdWestEast;
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdWestEast(String o) {
		this.paramPedestrianQueueThresholdWestEast = TrafficSimulation.staticSetParamPedestrianQueueThresholdWestEast(siteRequest_, o);
	}
	public static BigDecimal staticSetParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdWestEast(Double o) {
		setParamPedestrianQueueThresholdWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdWestEast(Integer o) {
		setParamPedestrianQueueThresholdWestEast(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamPedestrianQueueThresholdWestEast(Number o) {
		setParamPedestrianQueueThresholdWestEast(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramPedestrianQueueThresholdWestEastInit() {
		Wrap<BigDecimal> paramPedestrianQueueThresholdWestEastWrap = new Wrap<BigDecimal>().var("paramPedestrianQueueThresholdWestEast");
		if(paramPedestrianQueueThresholdWestEast == null) {
			_paramPedestrianQueueThresholdWestEast(paramPedestrianQueueThresholdWestEastWrap);
			setParamPedestrianQueueThresholdWestEast(paramPedestrianQueueThresholdWestEastWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamPedestrianQueueThresholdWestEast(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamPedestrianQueueThresholdWestEast(siteRequest_, TrafficSimulation.staticSearchParamPedestrianQueueThresholdWestEast(siteRequest_, TrafficSimulation.staticSetParamPedestrianQueueThresholdWestEast(siteRequest_, o)));
	}

	public BigDecimal sqlParamPedestrianQueueThresholdWestEast() {
		return paramPedestrianQueueThresholdWestEast;
	}

	///////////////////
	// paramStepSize //
	///////////////////


	/**	 The entity paramStepSize
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paramStepSize;

	/**	<br> The entity paramStepSize
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramStepSize">Find the entity paramStepSize in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramStepSize(Wrap<BigDecimal> w);

	public BigDecimal getParamStepSize() {
		return paramStepSize;
	}

	public void setParamStepSize(BigDecimal paramStepSize) {
		this.paramStepSize = paramStepSize;
	}
	@JsonIgnore
	public void setParamStepSize(String o) {
		this.paramStepSize = TrafficSimulation.staticSetParamStepSize(siteRequest_, o);
	}
	public static BigDecimal staticSetParamStepSize(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setParamStepSize(Double o) {
		setParamStepSize(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamStepSize(Integer o) {
		setParamStepSize(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setParamStepSize(Number o) {
		setParamStepSize(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected TrafficSimulation paramStepSizeInit() {
		Wrap<BigDecimal> paramStepSizeWrap = new Wrap<BigDecimal>().var("paramStepSize");
		if(paramStepSize == null) {
			_paramStepSize(paramStepSizeWrap);
			setParamStepSize(paramStepSizeWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Double staticSearchParamStepSize(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrParamStepSize(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamStepSize(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamStepSize(siteRequest_, TrafficSimulation.staticSearchParamStepSize(siteRequest_, TrafficSimulation.staticSetParamStepSize(siteRequest_, o)));
	}

	public BigDecimal sqlParamStepSize() {
		return paramStepSize;
	}

	//////////////////
	// paramRunTime //
	//////////////////


	/**	 The entity paramRunTime
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer paramRunTime;

	/**	<br> The entity paramRunTime
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramRunTime">Find the entity paramRunTime in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramRunTime(Wrap<Integer> w);

	public Integer getParamRunTime() {
		return paramRunTime;
	}

	public void setParamRunTime(Integer paramRunTime) {
		this.paramRunTime = paramRunTime;
	}
	@JsonIgnore
	public void setParamRunTime(String o) {
		this.paramRunTime = TrafficSimulation.staticSetParamRunTime(siteRequest_, o);
	}
	public static Integer staticSetParamRunTime(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficSimulation paramRunTimeInit() {
		Wrap<Integer> paramRunTimeWrap = new Wrap<Integer>().var("paramRunTime");
		if(paramRunTime == null) {
			_paramRunTime(paramRunTimeWrap);
			setParamRunTime(paramRunTimeWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Integer staticSearchParamRunTime(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamRunTime(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamRunTime(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamRunTime(siteRequest_, TrafficSimulation.staticSearchParamRunTime(siteRequest_, TrafficSimulation.staticSetParamRunTime(siteRequest_, o)));
	}

	public Integer sqlParamRunTime() {
		return paramRunTime;
	}

	//////////////////////
	// paramItersPerPar //
	//////////////////////


	/**	 The entity paramItersPerPar
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer paramItersPerPar;

	/**	<br> The entity paramItersPerPar
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramItersPerPar">Find the entity paramItersPerPar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramItersPerPar(Wrap<Integer> w);

	public Integer getParamItersPerPar() {
		return paramItersPerPar;
	}

	public void setParamItersPerPar(Integer paramItersPerPar) {
		this.paramItersPerPar = paramItersPerPar;
	}
	@JsonIgnore
	public void setParamItersPerPar(String o) {
		this.paramItersPerPar = TrafficSimulation.staticSetParamItersPerPar(siteRequest_, o);
	}
	public static Integer staticSetParamItersPerPar(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficSimulation paramItersPerParInit() {
		Wrap<Integer> paramItersPerParWrap = new Wrap<Integer>().var("paramItersPerPar");
		if(paramItersPerPar == null) {
			_paramItersPerPar(paramItersPerParWrap);
			setParamItersPerPar(paramItersPerParWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Integer staticSearchParamItersPerPar(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamItersPerPar(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamItersPerPar(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamItersPerPar(siteRequest_, TrafficSimulation.staticSearchParamItersPerPar(siteRequest_, TrafficSimulation.staticSetParamItersPerPar(siteRequest_, o)));
	}

	public Integer sqlParamItersPerPar() {
		return paramItersPerPar;
	}

	///////////////////////
	// paramTotalIterNum //
	///////////////////////


	/**	 The entity paramTotalIterNum
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer paramTotalIterNum;

	/**	<br> The entity paramTotalIterNum
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:paramTotalIterNum">Find the entity paramTotalIterNum in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _paramTotalIterNum(Wrap<Integer> w);

	public Integer getParamTotalIterNum() {
		return paramTotalIterNum;
	}

	public void setParamTotalIterNum(Integer paramTotalIterNum) {
		this.paramTotalIterNum = paramTotalIterNum;
	}
	@JsonIgnore
	public void setParamTotalIterNum(String o) {
		this.paramTotalIterNum = TrafficSimulation.staticSetParamTotalIterNum(siteRequest_, o);
	}
	public static Integer staticSetParamTotalIterNum(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficSimulation paramTotalIterNumInit() {
		Wrap<Integer> paramTotalIterNumWrap = new Wrap<Integer>().var("paramTotalIterNum");
		if(paramTotalIterNum == null) {
			_paramTotalIterNum(paramTotalIterNumWrap);
			setParamTotalIterNum(paramTotalIterNumWrap.o);
		}
		return (TrafficSimulation)this;
	}

	public static Integer staticSearchParamTotalIterNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrParamTotalIterNum(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqParamTotalIterNum(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrParamTotalIterNum(siteRequest_, TrafficSimulation.staticSearchParamTotalIterNum(siteRequest_, TrafficSimulation.staticSetParamTotalIterNum(siteRequest_, o)));
	}

	public Integer sqlParamTotalIterNum() {
		return paramTotalIterNum;
	}

	////////////////
	// reportKeys //
	////////////////


	/**	 The entity reportKeys
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> reportKeys = new ArrayList<Long>();

	/**	<br> The entity reportKeys
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:reportKeys">Find the entity reportKeys in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _reportKeys(List<Long> w);

	public List<Long> getReportKeys() {
		return reportKeys;
	}

	public void setReportKeys(List<Long> reportKeys) {
		this.reportKeys = reportKeys;
	}
	@JsonIgnore
	public void setReportKeys(String o) {
		Long l = TrafficSimulation.staticSetReportKeys(siteRequest_, o);
		if(l != null)
			addReportKeys(l);
	}
	public static Long staticSetReportKeys(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	public TrafficSimulation addReportKeys(Long...objects) {
		for(Long o : objects) {
			addReportKeys(o);
		}
		return (TrafficSimulation)this;
	}
	public TrafficSimulation addReportKeys(Long o) {
		if(o != null)
			this.reportKeys.add(o);
		return (TrafficSimulation)this;
	}
	@JsonIgnore
	public void setReportKeys(JsonArray objects) {
		reportKeys.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			setReportKeys(o);
		}
	}
	public TrafficSimulation addReportKeys(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addReportKeys(p);
		}
		return (TrafficSimulation)this;
	}
	protected TrafficSimulation reportKeysInit() {
		_reportKeys(reportKeys);
		return (TrafficSimulation)this;
	}

	public static Long staticSearchReportKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrReportKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportKeys(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrReportKeys(siteRequest_, TrafficSimulation.staticSearchReportKeys(siteRequest_, TrafficSimulation.staticSetReportKeys(siteRequest_, o)));
	}

	public Number[] sqlReportKeys() {
		return reportKeys.stream().map(v -> (Number)v).toArray(Number[]::new);
	}

	////////////////////
	// tlsStatesPaths //
	////////////////////


	/**	 The entity tlsStatesPaths
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> tlsStatesPaths = new ArrayList<String>();

	/**	<br> The entity tlsStatesPaths
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:tlsStatesPaths">Find the entity tlsStatesPaths in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _tlsStatesPaths(List<String> l);

	public List<String> getTlsStatesPaths() {
		return tlsStatesPaths;
	}
	public void setTlsStatesPaths(String o) {
		String l = TrafficSimulation.staticSetTlsStatesPaths(siteRequest_, o);
		if(l != null)
			addTlsStatesPaths(l);
	}
	public static String staticSetTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public TrafficSimulation addTlsStatesPaths(String...objects) {
		for(String o : objects) {
			addTlsStatesPaths(o);
		}
		return (TrafficSimulation)this;
	}
	public TrafficSimulation addTlsStatesPaths(String o) {
		if(o != null)
			this.tlsStatesPaths.add(o);
		return (TrafficSimulation)this;
	}
	@JsonIgnore
	public void setTlsStatesPaths(JsonArray objects) {
		tlsStatesPaths.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addTlsStatesPaths(o);
		}
	}
	protected TrafficSimulation tlsStatesPathsInit() {
		_tlsStatesPaths(tlsStatesPaths);
		return (TrafficSimulation)this;
	}

	public static String staticSearchTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTlsStatesPaths(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrTlsStatesPaths(siteRequest_, TrafficSimulation.staticSearchTlsStatesPaths(siteRequest_, TrafficSimulation.staticSetTlsStatesPaths(siteRequest_, o)));
	}

	/////////////////////////
	// additionalFilePaths //
	/////////////////////////


	/**	 The entity additionalFilePaths
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> additionalFilePaths = new ArrayList<String>();

	/**	<br> The entity additionalFilePaths
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr-solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.simulation.TrafficSimulation&fq=entiteVar_enUS_indexed_string:additionalFilePaths">Find the entity additionalFilePaths in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _additionalFilePaths(List<String> l);

	public List<String> getAdditionalFilePaths() {
		return additionalFilePaths;
	}
	public void setAdditionalFilePaths(String o) {
		String l = TrafficSimulation.staticSetAdditionalFilePaths(siteRequest_, o);
		if(l != null)
			addAdditionalFilePaths(l);
	}
	public static String staticSetAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public TrafficSimulation addAdditionalFilePaths(String...objects) {
		for(String o : objects) {
			addAdditionalFilePaths(o);
		}
		return (TrafficSimulation)this;
	}
	public TrafficSimulation addAdditionalFilePaths(String o) {
		if(o != null)
			this.additionalFilePaths.add(o);
		return (TrafficSimulation)this;
	}
	@JsonIgnore
	public void setAdditionalFilePaths(JsonArray objects) {
		additionalFilePaths.clear();
		if(objects == null)
			return;
		for(int i = 0; i < objects.size(); i++) {
			String o = objects.getString(i);
			addAdditionalFilePaths(o);
		}
	}
	protected TrafficSimulation additionalFilePathsInit() {
		_additionalFilePaths(additionalFilePaths);
		return (TrafficSimulation)this;
	}

	public static String staticSearchAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAdditionalFilePaths(SiteRequestEnUS siteRequest_, String o) {
		return TrafficSimulation.staticSearchStrAdditionalFilePaths(siteRequest_, TrafficSimulation.staticSearchAdditionalFilePaths(siteRequest_, TrafficSimulation.staticSetAdditionalFilePaths(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTrafficSimulation(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTrafficSimulation();
	}

	public Future<Void> promiseDeepTrafficSimulation() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTrafficSimulation(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseModel(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseTrafficSimulation(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				startDateTimeInit();
				simulationNameInit();
				sumocfgPathInit();
				fcdFilePathInit();
				netFilePathInit();
				startSecondsInit();
				endSecondsInit();
				stepSecondsInit();
				paramAvgVehiclePerMinFromWestToEastInit();
				paramAvgVehiclePerMinFromSouthToNorthInit();
				paramVehicleDemandScalingFactorInit();
				paramAvgPedestrianPerMinFromWestToEastInit();
				paramAvgPedestrianPerMinFromSouthToNorthInit();
				paramPedestrianDemandScalingFactorInit();
				paramDemandScaleInit();
				paramMinGreenTimeSecWestEastInit();
				paramMaxGreenTimeSecWestEastInit();
				paramMinGreenTimeSecSouthNorthInit();
				paramMaxGreenTimeSecSouthNorthInit();
				paramPedestrianWaitThresholdSecNorthSouthInit();
				paramPedestrianWaitThresholdSecWestEastInit();
				paramVehicleQueueThresholdWestEastInit();
				paramVehicleQueueThresholdSouthNorthInit();
				paramPedestrianQueueThresholdNorthSouthInit();
				paramPedestrianQueueThresholdWestEastInit();
				paramStepSizeInit();
				paramRunTimeInit();
				paramItersPerParInit();
				paramTotalIterNumInit();
				reportKeysInit();
				tlsStatesPathsInit();
				additionalFilePathsInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepTrafficSimulation(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficSimulation(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficSimulation(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficSimulation(v);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainTrafficSimulation(String var) {
		TrafficSimulation oTrafficSimulation = (TrafficSimulation)this;
		switch(var) {
			case "startDateTime":
				return oTrafficSimulation.startDateTime;
			case "simulationName":
				return oTrafficSimulation.simulationName;
			case "sumocfgPath":
				return oTrafficSimulation.sumocfgPath;
			case "fcdFilePath":
				return oTrafficSimulation.fcdFilePath;
			case "netFilePath":
				return oTrafficSimulation.netFilePath;
			case "startSeconds":
				return oTrafficSimulation.startSeconds;
			case "endSeconds":
				return oTrafficSimulation.endSeconds;
			case "stepSeconds":
				return oTrafficSimulation.stepSeconds;
			case "paramAvgVehiclePerMinFromWestToEast":
				return oTrafficSimulation.paramAvgVehiclePerMinFromWestToEast;
			case "paramAvgVehiclePerMinFromSouthToNorth":
				return oTrafficSimulation.paramAvgVehiclePerMinFromSouthToNorth;
			case "paramVehicleDemandScalingFactor":
				return oTrafficSimulation.paramVehicleDemandScalingFactor;
			case "paramAvgPedestrianPerMinFromWestToEast":
				return oTrafficSimulation.paramAvgPedestrianPerMinFromWestToEast;
			case "paramAvgPedestrianPerMinFromSouthToNorth":
				return oTrafficSimulation.paramAvgPedestrianPerMinFromSouthToNorth;
			case "paramPedestrianDemandScalingFactor":
				return oTrafficSimulation.paramPedestrianDemandScalingFactor;
			case "paramDemandScale":
				return oTrafficSimulation.paramDemandScale;
			case "paramMinGreenTimeSecWestEast":
				return oTrafficSimulation.paramMinGreenTimeSecWestEast;
			case "paramMaxGreenTimeSecWestEast":
				return oTrafficSimulation.paramMaxGreenTimeSecWestEast;
			case "paramMinGreenTimeSecSouthNorth":
				return oTrafficSimulation.paramMinGreenTimeSecSouthNorth;
			case "paramMaxGreenTimeSecSouthNorth":
				return oTrafficSimulation.paramMaxGreenTimeSecSouthNorth;
			case "paramPedestrianWaitThresholdSecNorthSouth":
				return oTrafficSimulation.paramPedestrianWaitThresholdSecNorthSouth;
			case "paramPedestrianWaitThresholdSecWestEast":
				return oTrafficSimulation.paramPedestrianWaitThresholdSecWestEast;
			case "paramVehicleQueueThresholdWestEast":
				return oTrafficSimulation.paramVehicleQueueThresholdWestEast;
			case "paramVehicleQueueThresholdSouthNorth":
				return oTrafficSimulation.paramVehicleQueueThresholdSouthNorth;
			case "paramPedestrianQueueThresholdNorthSouth":
				return oTrafficSimulation.paramPedestrianQueueThresholdNorthSouth;
			case "paramPedestrianQueueThresholdWestEast":
				return oTrafficSimulation.paramPedestrianQueueThresholdWestEast;
			case "paramStepSize":
				return oTrafficSimulation.paramStepSize;
			case "paramRunTime":
				return oTrafficSimulation.paramRunTime;
			case "paramItersPerPar":
				return oTrafficSimulation.paramItersPerPar;
			case "paramTotalIterNum":
				return oTrafficSimulation.paramTotalIterNum;
			case "reportKeys":
				return oTrafficSimulation.reportKeys;
			case "tlsStatesPaths":
				return oTrafficSimulation.tlsStatesPaths;
			case "additionalFilePaths":
				return oTrafficSimulation.additionalFilePaths;
			default:
				return super.obtainBaseModel(var);
		}
	}

	///////////////
	// relate //
	///////////////

	@Override public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateTrafficSimulation(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficSimulation(String var, Object val) {
		TrafficSimulation oTrafficSimulation = (TrafficSimulation)this;
		switch(var) {
			case "reportKeys":
				oTrafficSimulation.addReportKeys((Long)val);
				if(!saves.contains("reportKeys"))
					saves.add("reportKeys");
				return val;
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficSimulation(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficSimulation(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "startDateTime":
			return TrafficSimulation.staticSetStartDateTime(siteRequest_, o);
		case "simulationName":
			return TrafficSimulation.staticSetSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return TrafficSimulation.staticSetSumocfgPath(siteRequest_, o);
		case "fcdFilePath":
			return TrafficSimulation.staticSetFcdFilePath(siteRequest_, o);
		case "netFilePath":
			return TrafficSimulation.staticSetNetFilePath(siteRequest_, o);
		case "startSeconds":
			return TrafficSimulation.staticSetStartSeconds(siteRequest_, o);
		case "endSeconds":
			return TrafficSimulation.staticSetEndSeconds(siteRequest_, o);
		case "stepSeconds":
			return TrafficSimulation.staticSetStepSeconds(siteRequest_, o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return TrafficSimulation.staticSetParamAvgVehiclePerMinFromWestToEast(siteRequest_, o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return TrafficSimulation.staticSetParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o);
		case "paramVehicleDemandScalingFactor":
			return TrafficSimulation.staticSetParamVehicleDemandScalingFactor(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return TrafficSimulation.staticSetParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return TrafficSimulation.staticSetParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o);
		case "paramPedestrianDemandScalingFactor":
			return TrafficSimulation.staticSetParamPedestrianDemandScalingFactor(siteRequest_, o);
		case "paramDemandScale":
			return TrafficSimulation.staticSetParamDemandScale(siteRequest_, o);
		case "paramMinGreenTimeSecWestEast":
			return TrafficSimulation.staticSetParamMinGreenTimeSecWestEast(siteRequest_, o);
		case "paramMaxGreenTimeSecWestEast":
			return TrafficSimulation.staticSetParamMaxGreenTimeSecWestEast(siteRequest_, o);
		case "paramMinGreenTimeSecSouthNorth":
			return TrafficSimulation.staticSetParamMinGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramMaxGreenTimeSecSouthNorth":
			return TrafficSimulation.staticSetParamMaxGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return TrafficSimulation.staticSetParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return TrafficSimulation.staticSetParamPedestrianWaitThresholdSecWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdWestEast":
			return TrafficSimulation.staticSetParamVehicleQueueThresholdWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdSouthNorth":
			return TrafficSimulation.staticSetParamVehicleQueueThresholdSouthNorth(siteRequest_, o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return TrafficSimulation.staticSetParamPedestrianQueueThresholdNorthSouth(siteRequest_, o);
		case "paramPedestrianQueueThresholdWestEast":
			return TrafficSimulation.staticSetParamPedestrianQueueThresholdWestEast(siteRequest_, o);
		case "paramStepSize":
			return TrafficSimulation.staticSetParamStepSize(siteRequest_, o);
		case "paramRunTime":
			return TrafficSimulation.staticSetParamRunTime(siteRequest_, o);
		case "paramItersPerPar":
			return TrafficSimulation.staticSetParamItersPerPar(siteRequest_, o);
		case "paramTotalIterNum":
			return TrafficSimulation.staticSetParamTotalIterNum(siteRequest_, o);
		case "reportKeys":
			return TrafficSimulation.staticSetReportKeys(siteRequest_, o);
		case "tlsStatesPaths":
			return TrafficSimulation.staticSetTlsStatesPaths(siteRequest_, o);
		case "additionalFilePaths":
			return TrafficSimulation.staticSetAdditionalFilePaths(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficSimulation(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficSimulation(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "startDateTime":
			return TrafficSimulation.staticSearchStartDateTime(siteRequest_, (ZonedDateTime)o);
		case "simulationName":
			return TrafficSimulation.staticSearchSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return TrafficSimulation.staticSearchSumocfgPath(siteRequest_, (String)o);
		case "fcdFilePath":
			return TrafficSimulation.staticSearchFcdFilePath(siteRequest_, (String)o);
		case "netFilePath":
			return TrafficSimulation.staticSearchNetFilePath(siteRequest_, (String)o);
		case "startSeconds":
			return TrafficSimulation.staticSearchStartSeconds(siteRequest_, (BigDecimal)o);
		case "endSeconds":
			return TrafficSimulation.staticSearchEndSeconds(siteRequest_, (BigDecimal)o);
		case "stepSeconds":
			return TrafficSimulation.staticSearchStepSeconds(siteRequest_, (BigDecimal)o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return TrafficSimulation.staticSearchParamAvgVehiclePerMinFromWestToEast(siteRequest_, (BigDecimal)o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return TrafficSimulation.staticSearchParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, (BigDecimal)o);
		case "paramVehicleDemandScalingFactor":
			return TrafficSimulation.staticSearchParamVehicleDemandScalingFactor(siteRequest_, (BigDecimal)o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return TrafficSimulation.staticSearchParamAvgPedestrianPerMinFromWestToEast(siteRequest_, (BigDecimal)o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return TrafficSimulation.staticSearchParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianDemandScalingFactor":
			return TrafficSimulation.staticSearchParamPedestrianDemandScalingFactor(siteRequest_, (BigDecimal)o);
		case "paramDemandScale":
			return TrafficSimulation.staticSearchParamDemandScale(siteRequest_, (BigDecimal)o);
		case "paramMinGreenTimeSecWestEast":
			return TrafficSimulation.staticSearchParamMinGreenTimeSecWestEast(siteRequest_, (BigDecimal)o);
		case "paramMaxGreenTimeSecWestEast":
			return TrafficSimulation.staticSearchParamMaxGreenTimeSecWestEast(siteRequest_, (BigDecimal)o);
		case "paramMinGreenTimeSecSouthNorth":
			return TrafficSimulation.staticSearchParamMinGreenTimeSecSouthNorth(siteRequest_, (BigDecimal)o);
		case "paramMaxGreenTimeSecSouthNorth":
			return TrafficSimulation.staticSearchParamMaxGreenTimeSecSouthNorth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return TrafficSimulation.staticSearchParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return TrafficSimulation.staticSearchParamPedestrianWaitThresholdSecWestEast(siteRequest_, (BigDecimal)o);
		case "paramVehicleQueueThresholdWestEast":
			return TrafficSimulation.staticSearchParamVehicleQueueThresholdWestEast(siteRequest_, (BigDecimal)o);
		case "paramVehicleQueueThresholdSouthNorth":
			return TrafficSimulation.staticSearchParamVehicleQueueThresholdSouthNorth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return TrafficSimulation.staticSearchParamPedestrianQueueThresholdNorthSouth(siteRequest_, (BigDecimal)o);
		case "paramPedestrianQueueThresholdWestEast":
			return TrafficSimulation.staticSearchParamPedestrianQueueThresholdWestEast(siteRequest_, (BigDecimal)o);
		case "paramStepSize":
			return TrafficSimulation.staticSearchParamStepSize(siteRequest_, (BigDecimal)o);
		case "paramRunTime":
			return TrafficSimulation.staticSearchParamRunTime(siteRequest_, (Integer)o);
		case "paramItersPerPar":
			return TrafficSimulation.staticSearchParamItersPerPar(siteRequest_, (Integer)o);
		case "paramTotalIterNum":
			return TrafficSimulation.staticSearchParamTotalIterNum(siteRequest_, (Integer)o);
		case "reportKeys":
			return TrafficSimulation.staticSearchReportKeys(siteRequest_, (Long)o);
		case "tlsStatesPaths":
			return TrafficSimulation.staticSearchTlsStatesPaths(siteRequest_, (String)o);
		case "additionalFilePaths":
			return TrafficSimulation.staticSearchAdditionalFilePaths(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficSimulation(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficSimulation(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "startDateTime":
			return TrafficSimulation.staticSearchStrStartDateTime(siteRequest_, (Date)o);
		case "simulationName":
			return TrafficSimulation.staticSearchStrSimulationName(siteRequest_, (String)o);
		case "sumocfgPath":
			return TrafficSimulation.staticSearchStrSumocfgPath(siteRequest_, (String)o);
		case "fcdFilePath":
			return TrafficSimulation.staticSearchStrFcdFilePath(siteRequest_, (String)o);
		case "netFilePath":
			return TrafficSimulation.staticSearchStrNetFilePath(siteRequest_, (String)o);
		case "startSeconds":
			return TrafficSimulation.staticSearchStrStartSeconds(siteRequest_, (Double)o);
		case "endSeconds":
			return TrafficSimulation.staticSearchStrEndSeconds(siteRequest_, (Double)o);
		case "stepSeconds":
			return TrafficSimulation.staticSearchStrStepSeconds(siteRequest_, (Double)o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return TrafficSimulation.staticSearchStrParamAvgVehiclePerMinFromWestToEast(siteRequest_, (Double)o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return TrafficSimulation.staticSearchStrParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, (Double)o);
		case "paramVehicleDemandScalingFactor":
			return TrafficSimulation.staticSearchStrParamVehicleDemandScalingFactor(siteRequest_, (Double)o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return TrafficSimulation.staticSearchStrParamAvgPedestrianPerMinFromWestToEast(siteRequest_, (Double)o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return TrafficSimulation.staticSearchStrParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, (Double)o);
		case "paramPedestrianDemandScalingFactor":
			return TrafficSimulation.staticSearchStrParamPedestrianDemandScalingFactor(siteRequest_, (Double)o);
		case "paramDemandScale":
			return TrafficSimulation.staticSearchStrParamDemandScale(siteRequest_, (BigDecimal)o);
		case "paramMinGreenTimeSecWestEast":
			return TrafficSimulation.staticSearchStrParamMinGreenTimeSecWestEast(siteRequest_, (Double)o);
		case "paramMaxGreenTimeSecWestEast":
			return TrafficSimulation.staticSearchStrParamMaxGreenTimeSecWestEast(siteRequest_, (Double)o);
		case "paramMinGreenTimeSecSouthNorth":
			return TrafficSimulation.staticSearchStrParamMinGreenTimeSecSouthNorth(siteRequest_, (Double)o);
		case "paramMaxGreenTimeSecSouthNorth":
			return TrafficSimulation.staticSearchStrParamMaxGreenTimeSecSouthNorth(siteRequest_, (Double)o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return TrafficSimulation.staticSearchStrParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, (Double)o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return TrafficSimulation.staticSearchStrParamPedestrianWaitThresholdSecWestEast(siteRequest_, (Double)o);
		case "paramVehicleQueueThresholdWestEast":
			return TrafficSimulation.staticSearchStrParamVehicleQueueThresholdWestEast(siteRequest_, (Double)o);
		case "paramVehicleQueueThresholdSouthNorth":
			return TrafficSimulation.staticSearchStrParamVehicleQueueThresholdSouthNorth(siteRequest_, (Double)o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return TrafficSimulation.staticSearchStrParamPedestrianQueueThresholdNorthSouth(siteRequest_, (Double)o);
		case "paramPedestrianQueueThresholdWestEast":
			return TrafficSimulation.staticSearchStrParamPedestrianQueueThresholdWestEast(siteRequest_, (Double)o);
		case "paramStepSize":
			return TrafficSimulation.staticSearchStrParamStepSize(siteRequest_, (Double)o);
		case "paramRunTime":
			return TrafficSimulation.staticSearchStrParamRunTime(siteRequest_, (Integer)o);
		case "paramItersPerPar":
			return TrafficSimulation.staticSearchStrParamItersPerPar(siteRequest_, (Integer)o);
		case "paramTotalIterNum":
			return TrafficSimulation.staticSearchStrParamTotalIterNum(siteRequest_, (Integer)o);
		case "reportKeys":
			return TrafficSimulation.staticSearchStrReportKeys(siteRequest_, (Long)o);
		case "tlsStatesPaths":
			return TrafficSimulation.staticSearchStrTlsStatesPaths(siteRequest_, (String)o);
		case "additionalFilePaths":
			return TrafficSimulation.staticSearchStrAdditionalFilePaths(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficSimulation(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficSimulation(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "startDateTime":
			return TrafficSimulation.staticSearchFqStartDateTime(siteRequest_, o);
		case "simulationName":
			return TrafficSimulation.staticSearchFqSimulationName(siteRequest_, o);
		case "sumocfgPath":
			return TrafficSimulation.staticSearchFqSumocfgPath(siteRequest_, o);
		case "fcdFilePath":
			return TrafficSimulation.staticSearchFqFcdFilePath(siteRequest_, o);
		case "netFilePath":
			return TrafficSimulation.staticSearchFqNetFilePath(siteRequest_, o);
		case "startSeconds":
			return TrafficSimulation.staticSearchFqStartSeconds(siteRequest_, o);
		case "endSeconds":
			return TrafficSimulation.staticSearchFqEndSeconds(siteRequest_, o);
		case "stepSeconds":
			return TrafficSimulation.staticSearchFqStepSeconds(siteRequest_, o);
		case "paramAvgVehiclePerMinFromWestToEast":
			return TrafficSimulation.staticSearchFqParamAvgVehiclePerMinFromWestToEast(siteRequest_, o);
		case "paramAvgVehiclePerMinFromSouthToNorth":
			return TrafficSimulation.staticSearchFqParamAvgVehiclePerMinFromSouthToNorth(siteRequest_, o);
		case "paramVehicleDemandScalingFactor":
			return TrafficSimulation.staticSearchFqParamVehicleDemandScalingFactor(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromWestToEast":
			return TrafficSimulation.staticSearchFqParamAvgPedestrianPerMinFromWestToEast(siteRequest_, o);
		case "paramAvgPedestrianPerMinFromSouthToNorth":
			return TrafficSimulation.staticSearchFqParamAvgPedestrianPerMinFromSouthToNorth(siteRequest_, o);
		case "paramPedestrianDemandScalingFactor":
			return TrafficSimulation.staticSearchFqParamPedestrianDemandScalingFactor(siteRequest_, o);
		case "paramDemandScale":
			return TrafficSimulation.staticSearchFqParamDemandScale(siteRequest_, o);
		case "paramMinGreenTimeSecWestEast":
			return TrafficSimulation.staticSearchFqParamMinGreenTimeSecWestEast(siteRequest_, o);
		case "paramMaxGreenTimeSecWestEast":
			return TrafficSimulation.staticSearchFqParamMaxGreenTimeSecWestEast(siteRequest_, o);
		case "paramMinGreenTimeSecSouthNorth":
			return TrafficSimulation.staticSearchFqParamMinGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramMaxGreenTimeSecSouthNorth":
			return TrafficSimulation.staticSearchFqParamMaxGreenTimeSecSouthNorth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecNorthSouth":
			return TrafficSimulation.staticSearchFqParamPedestrianWaitThresholdSecNorthSouth(siteRequest_, o);
		case "paramPedestrianWaitThresholdSecWestEast":
			return TrafficSimulation.staticSearchFqParamPedestrianWaitThresholdSecWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdWestEast":
			return TrafficSimulation.staticSearchFqParamVehicleQueueThresholdWestEast(siteRequest_, o);
		case "paramVehicleQueueThresholdSouthNorth":
			return TrafficSimulation.staticSearchFqParamVehicleQueueThresholdSouthNorth(siteRequest_, o);
		case "paramPedestrianQueueThresholdNorthSouth":
			return TrafficSimulation.staticSearchFqParamPedestrianQueueThresholdNorthSouth(siteRequest_, o);
		case "paramPedestrianQueueThresholdWestEast":
			return TrafficSimulation.staticSearchFqParamPedestrianQueueThresholdWestEast(siteRequest_, o);
		case "paramStepSize":
			return TrafficSimulation.staticSearchFqParamStepSize(siteRequest_, o);
		case "paramRunTime":
			return TrafficSimulation.staticSearchFqParamRunTime(siteRequest_, o);
		case "paramItersPerPar":
			return TrafficSimulation.staticSearchFqParamItersPerPar(siteRequest_, o);
		case "paramTotalIterNum":
			return TrafficSimulation.staticSearchFqParamTotalIterNum(siteRequest_, o);
		case "reportKeys":
			return TrafficSimulation.staticSearchFqReportKeys(siteRequest_, o);
		case "tlsStatesPaths":
			return TrafficSimulation.staticSearchFqTlsStatesPaths(siteRequest_, o);
		case "additionalFilePaths":
			return TrafficSimulation.staticSearchFqAdditionalFilePaths(siteRequest_, o);
			default:
				return BaseModel.staticSearchFqBaseModel(entityVar,  siteRequest_, o);
		}
	}

	/////////////
	// persist //
	/////////////

	@Override public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistTrafficSimulation(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistTrafficSimulation(String var, Object val) {
		String varLower = var.toLowerCase();
			if("startdatetime".equals(varLower)) {
				if(val instanceof String) {
					setStartDateTime((String)val);
				} else if(val instanceof OffsetDateTime) {
					setStartDateTime(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				}
				saves.add("startDateTime");
				return val;
			} else if("simulationname".equals(varLower)) {
				if(val instanceof String) {
					setSimulationName((String)val);
				}
				saves.add("simulationName");
				return val;
			} else if("sumocfgpath".equals(varLower)) {
				if(val instanceof String) {
					setSumocfgPath((String)val);
				}
				saves.add("sumocfgPath");
				return val;
			} else if("fcdfilepath".equals(varLower)) {
				if(val instanceof String) {
					setFcdFilePath((String)val);
				}
				saves.add("fcdFilePath");
				return val;
			} else if("netfilepath".equals(varLower)) {
				if(val instanceof String) {
					setNetFilePath((String)val);
				}
				saves.add("netFilePath");
				return val;
			} else if("startseconds".equals(varLower)) {
				if(val instanceof String) {
					setStartSeconds((String)val);
				} else if(val instanceof Number) {
					setStartSeconds(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("startSeconds");
				return val;
			} else if("endseconds".equals(varLower)) {
				if(val instanceof String) {
					setEndSeconds((String)val);
				} else if(val instanceof Number) {
					setEndSeconds(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("endSeconds");
				return val;
			} else if("stepseconds".equals(varLower)) {
				if(val instanceof String) {
					setStepSeconds((String)val);
				} else if(val instanceof Number) {
					setStepSeconds(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("stepSeconds");
				return val;
			} else if("paramavgvehicleperminfromwesttoeast".equals(varLower)) {
				if(val instanceof String) {
					setParamAvgVehiclePerMinFromWestToEast((String)val);
				} else if(val instanceof Number) {
					setParamAvgVehiclePerMinFromWestToEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramAvgVehiclePerMinFromWestToEast");
				return val;
			} else if("paramavgvehicleperminfromsouthtonorth".equals(varLower)) {
				if(val instanceof String) {
					setParamAvgVehiclePerMinFromSouthToNorth((String)val);
				} else if(val instanceof Number) {
					setParamAvgVehiclePerMinFromSouthToNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramAvgVehiclePerMinFromSouthToNorth");
				return val;
			} else if("paramvehicledemandscalingfactor".equals(varLower)) {
				if(val instanceof String) {
					setParamVehicleDemandScalingFactor((String)val);
				} else if(val instanceof Number) {
					setParamVehicleDemandScalingFactor(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramVehicleDemandScalingFactor");
				return val;
			} else if("paramavgpedestrianperminfromwesttoeast".equals(varLower)) {
				if(val instanceof String) {
					setParamAvgPedestrianPerMinFromWestToEast((String)val);
				} else if(val instanceof Number) {
					setParamAvgPedestrianPerMinFromWestToEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramAvgPedestrianPerMinFromWestToEast");
				return val;
			} else if("paramavgpedestrianperminfromsouthtonorth".equals(varLower)) {
				if(val instanceof String) {
					setParamAvgPedestrianPerMinFromSouthToNorth((String)val);
				} else if(val instanceof Number) {
					setParamAvgPedestrianPerMinFromSouthToNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramAvgPedestrianPerMinFromSouthToNorth");
				return val;
			} else if("parampedestriandemandscalingfactor".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianDemandScalingFactor((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianDemandScalingFactor(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianDemandScalingFactor");
				return val;
			} else if("paramdemandscale".equals(varLower)) {
				if(val instanceof List<?>) {
					((List<BigDecimal>)val).stream().forEach(v -> addParamDemandScale(v));
				} else if(val instanceof JsonArray) {
					((JsonArray)val).stream().forEach(v -> setParamDemandScale(v.toString()));
				} else if(val instanceof BigDecimal[]) {
					Arrays.asList((BigDecimal[])val).stream().forEach(v -> setParamDemandScale((BigDecimal)v));
				} else if(val instanceof Number[]) {
					Arrays.asList((Number[])val).stream().forEach(v -> setParamDemandScale((Number)v));
				}
				if(!saves.contains("paramDemandScale")) {
					saves.add("paramDemandScale");
				}
				return val;
			} else if("parammingreentimesecwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamMinGreenTimeSecWestEast((String)val);
				} else if(val instanceof Number) {
					setParamMinGreenTimeSecWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramMinGreenTimeSecWestEast");
				return val;
			} else if("parammaxgreentimesecwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamMaxGreenTimeSecWestEast((String)val);
				} else if(val instanceof Number) {
					setParamMaxGreenTimeSecWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramMaxGreenTimeSecWestEast");
				return val;
			} else if("parammingreentimesecsouthnorth".equals(varLower)) {
				if(val instanceof String) {
					setParamMinGreenTimeSecSouthNorth((String)val);
				} else if(val instanceof Number) {
					setParamMinGreenTimeSecSouthNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramMinGreenTimeSecSouthNorth");
				return val;
			} else if("parammaxgreentimesecsouthnorth".equals(varLower)) {
				if(val instanceof String) {
					setParamMaxGreenTimeSecSouthNorth((String)val);
				} else if(val instanceof Number) {
					setParamMaxGreenTimeSecSouthNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramMaxGreenTimeSecSouthNorth");
				return val;
			} else if("parampedestrianwaitthresholdsecnorthsouth".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianWaitThresholdSecNorthSouth((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianWaitThresholdSecNorthSouth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianWaitThresholdSecNorthSouth");
				return val;
			} else if("parampedestrianwaitthresholdsecwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianWaitThresholdSecWestEast((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianWaitThresholdSecWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianWaitThresholdSecWestEast");
				return val;
			} else if("paramvehiclequeuethresholdwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamVehicleQueueThresholdWestEast((String)val);
				} else if(val instanceof Number) {
					setParamVehicleQueueThresholdWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramVehicleQueueThresholdWestEast");
				return val;
			} else if("paramvehiclequeuethresholdsouthnorth".equals(varLower)) {
				if(val instanceof String) {
					setParamVehicleQueueThresholdSouthNorth((String)val);
				} else if(val instanceof Number) {
					setParamVehicleQueueThresholdSouthNorth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramVehicleQueueThresholdSouthNorth");
				return val;
			} else if("parampedestrianqueuethresholdnorthsouth".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianQueueThresholdNorthSouth((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianQueueThresholdNorthSouth(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianQueueThresholdNorthSouth");
				return val;
			} else if("parampedestrianqueuethresholdwesteast".equals(varLower)) {
				if(val instanceof String) {
					setParamPedestrianQueueThresholdWestEast((String)val);
				} else if(val instanceof Number) {
					setParamPedestrianQueueThresholdWestEast(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramPedestrianQueueThresholdWestEast");
				return val;
			} else if("paramstepsize".equals(varLower)) {
				if(val instanceof String) {
					setParamStepSize((String)val);
				} else if(val instanceof Number) {
					setParamStepSize(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("paramStepSize");
				return val;
			} else if("paramruntime".equals(varLower)) {
				if(val instanceof Integer) {
					setParamRunTime((Integer)val);
				} else {
					setParamRunTime(val == null ? null : val.toString());
				}
				saves.add("paramRunTime");
				return val;
			} else if("paramitersperpar".equals(varLower)) {
				if(val instanceof Integer) {
					setParamItersPerPar((Integer)val);
				} else {
					setParamItersPerPar(val == null ? null : val.toString());
				}
				saves.add("paramItersPerPar");
				return val;
			} else if("paramtotaliternum".equals(varLower)) {
				if(val instanceof Integer) {
					setParamTotalIterNum((Integer)val);
				} else {
					setParamTotalIterNum(val == null ? null : val.toString());
				}
				saves.add("paramTotalIterNum");
				return val;
		} else {
			return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateTrafficSimulation(doc);
	}
	public void populateTrafficSimulation(SolrResponse.Doc doc) {
		TrafficSimulation oTrafficSimulation = (TrafficSimulation)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			if(saves.contains("startDateTime")) {
				Date startDateTime = (Date)doc.get("startDateTime_docvalues_date");
				if(startDateTime != null)
					oTrafficSimulation.setStartDateTime(startDateTime);
			}

			if(saves.contains("simulationName")) {
				String simulationName = (String)doc.get("simulationName_docvalues_string");
				if(simulationName != null)
					oTrafficSimulation.setSimulationName(simulationName);
			}

			if(saves.contains("sumocfgPath")) {
				String sumocfgPath = (String)doc.get("sumocfgPath_docvalues_string");
				if(sumocfgPath != null)
					oTrafficSimulation.setSumocfgPath(sumocfgPath);
			}

			if(saves.contains("fcdFilePath")) {
				String fcdFilePath = (String)doc.get("fcdFilePath_docvalues_string");
				if(fcdFilePath != null)
					oTrafficSimulation.setFcdFilePath(fcdFilePath);
			}

			if(saves.contains("netFilePath")) {
				String netFilePath = (String)doc.get("netFilePath_docvalues_string");
				if(netFilePath != null)
					oTrafficSimulation.setNetFilePath(netFilePath);
			}

			if(saves.contains("startSeconds")) {
				Double startSeconds = (Double)doc.get("startSeconds_docvalues_double");
				if(startSeconds != null)
					oTrafficSimulation.setStartSeconds(startSeconds);
			}

			if(saves.contains("endSeconds")) {
				Double endSeconds = (Double)doc.get("endSeconds_docvalues_double");
				if(endSeconds != null)
					oTrafficSimulation.setEndSeconds(endSeconds);
			}

			if(saves.contains("stepSeconds")) {
				Double stepSeconds = (Double)doc.get("stepSeconds_docvalues_double");
				if(stepSeconds != null)
					oTrafficSimulation.setStepSeconds(stepSeconds);
			}

			if(saves.contains("paramAvgVehiclePerMinFromWestToEast")) {
				Double paramAvgVehiclePerMinFromWestToEast = (Double)doc.get("paramAvgVehiclePerMinFromWestToEast_docvalues_double");
				if(paramAvgVehiclePerMinFromWestToEast != null)
					oTrafficSimulation.setParamAvgVehiclePerMinFromWestToEast(paramAvgVehiclePerMinFromWestToEast);
			}

			if(saves.contains("paramAvgVehiclePerMinFromSouthToNorth")) {
				Double paramAvgVehiclePerMinFromSouthToNorth = (Double)doc.get("paramAvgVehiclePerMinFromSouthToNorth_docvalues_double");
				if(paramAvgVehiclePerMinFromSouthToNorth != null)
					oTrafficSimulation.setParamAvgVehiclePerMinFromSouthToNorth(paramAvgVehiclePerMinFromSouthToNorth);
			}

			if(saves.contains("paramVehicleDemandScalingFactor")) {
				Double paramVehicleDemandScalingFactor = (Double)doc.get("paramVehicleDemandScalingFactor_docvalues_double");
				if(paramVehicleDemandScalingFactor != null)
					oTrafficSimulation.setParamVehicleDemandScalingFactor(paramVehicleDemandScalingFactor);
			}

			if(saves.contains("paramAvgPedestrianPerMinFromWestToEast")) {
				Double paramAvgPedestrianPerMinFromWestToEast = (Double)doc.get("paramAvgPedestrianPerMinFromWestToEast_docvalues_double");
				if(paramAvgPedestrianPerMinFromWestToEast != null)
					oTrafficSimulation.setParamAvgPedestrianPerMinFromWestToEast(paramAvgPedestrianPerMinFromWestToEast);
			}

			if(saves.contains("paramAvgPedestrianPerMinFromSouthToNorth")) {
				Double paramAvgPedestrianPerMinFromSouthToNorth = (Double)doc.get("paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double");
				if(paramAvgPedestrianPerMinFromSouthToNorth != null)
					oTrafficSimulation.setParamAvgPedestrianPerMinFromSouthToNorth(paramAvgPedestrianPerMinFromSouthToNorth);
			}

			if(saves.contains("paramPedestrianDemandScalingFactor")) {
				Double paramPedestrianDemandScalingFactor = (Double)doc.get("paramPedestrianDemandScalingFactor_docvalues_double");
				if(paramPedestrianDemandScalingFactor != null)
					oTrafficSimulation.setParamPedestrianDemandScalingFactor(paramPedestrianDemandScalingFactor);
			}

			if(saves.contains("paramDemandScale")) {
				List<BigDecimal> paramDemandScale = (List<BigDecimal>)doc.get("paramDemandScale_docvalues_doubles");
				if(paramDemandScale != null)
					oTrafficSimulation.paramDemandScale.addAll(paramDemandScale);
			}

			if(saves.contains("paramMinGreenTimeSecWestEast")) {
				Double paramMinGreenTimeSecWestEast = (Double)doc.get("paramMinGreenTimeSecWestEast_docvalues_double");
				if(paramMinGreenTimeSecWestEast != null)
					oTrafficSimulation.setParamMinGreenTimeSecWestEast(paramMinGreenTimeSecWestEast);
			}

			if(saves.contains("paramMaxGreenTimeSecWestEast")) {
				Double paramMaxGreenTimeSecWestEast = (Double)doc.get("paramMaxGreenTimeSecWestEast_docvalues_double");
				if(paramMaxGreenTimeSecWestEast != null)
					oTrafficSimulation.setParamMaxGreenTimeSecWestEast(paramMaxGreenTimeSecWestEast);
			}

			if(saves.contains("paramMinGreenTimeSecSouthNorth")) {
				Double paramMinGreenTimeSecSouthNorth = (Double)doc.get("paramMinGreenTimeSecSouthNorth_docvalues_double");
				if(paramMinGreenTimeSecSouthNorth != null)
					oTrafficSimulation.setParamMinGreenTimeSecSouthNorth(paramMinGreenTimeSecSouthNorth);
			}

			if(saves.contains("paramMaxGreenTimeSecSouthNorth")) {
				Double paramMaxGreenTimeSecSouthNorth = (Double)doc.get("paramMaxGreenTimeSecSouthNorth_docvalues_double");
				if(paramMaxGreenTimeSecSouthNorth != null)
					oTrafficSimulation.setParamMaxGreenTimeSecSouthNorth(paramMaxGreenTimeSecSouthNorth);
			}

			if(saves.contains("paramPedestrianWaitThresholdSecNorthSouth")) {
				Double paramPedestrianWaitThresholdSecNorthSouth = (Double)doc.get("paramPedestrianWaitThresholdSecNorthSouth_docvalues_double");
				if(paramPedestrianWaitThresholdSecNorthSouth != null)
					oTrafficSimulation.setParamPedestrianWaitThresholdSecNorthSouth(paramPedestrianWaitThresholdSecNorthSouth);
			}

			if(saves.contains("paramPedestrianWaitThresholdSecWestEast")) {
				Double paramPedestrianWaitThresholdSecWestEast = (Double)doc.get("paramPedestrianWaitThresholdSecWestEast_docvalues_double");
				if(paramPedestrianWaitThresholdSecWestEast != null)
					oTrafficSimulation.setParamPedestrianWaitThresholdSecWestEast(paramPedestrianWaitThresholdSecWestEast);
			}

			if(saves.contains("paramVehicleQueueThresholdWestEast")) {
				Double paramVehicleQueueThresholdWestEast = (Double)doc.get("paramVehicleQueueThresholdWestEast_docvalues_double");
				if(paramVehicleQueueThresholdWestEast != null)
					oTrafficSimulation.setParamVehicleQueueThresholdWestEast(paramVehicleQueueThresholdWestEast);
			}

			if(saves.contains("paramVehicleQueueThresholdSouthNorth")) {
				Double paramVehicleQueueThresholdSouthNorth = (Double)doc.get("paramVehicleQueueThresholdSouthNorth_docvalues_double");
				if(paramVehicleQueueThresholdSouthNorth != null)
					oTrafficSimulation.setParamVehicleQueueThresholdSouthNorth(paramVehicleQueueThresholdSouthNorth);
			}

			if(saves.contains("paramPedestrianQueueThresholdNorthSouth")) {
				Double paramPedestrianQueueThresholdNorthSouth = (Double)doc.get("paramPedestrianQueueThresholdNorthSouth_docvalues_double");
				if(paramPedestrianQueueThresholdNorthSouth != null)
					oTrafficSimulation.setParamPedestrianQueueThresholdNorthSouth(paramPedestrianQueueThresholdNorthSouth);
			}

			if(saves.contains("paramPedestrianQueueThresholdWestEast")) {
				Double paramPedestrianQueueThresholdWestEast = (Double)doc.get("paramPedestrianQueueThresholdWestEast_docvalues_double");
				if(paramPedestrianQueueThresholdWestEast != null)
					oTrafficSimulation.setParamPedestrianQueueThresholdWestEast(paramPedestrianQueueThresholdWestEast);
			}

			if(saves.contains("paramStepSize")) {
				Double paramStepSize = (Double)doc.get("paramStepSize_docvalues_double");
				if(paramStepSize != null)
					oTrafficSimulation.setParamStepSize(paramStepSize);
			}

			if(saves.contains("paramRunTime")) {
				Integer paramRunTime = (Integer)doc.get("paramRunTime_docvalues_int");
				if(paramRunTime != null)
					oTrafficSimulation.setParamRunTime(paramRunTime);
			}

			if(saves.contains("paramItersPerPar")) {
				Integer paramItersPerPar = (Integer)doc.get("paramItersPerPar_docvalues_int");
				if(paramItersPerPar != null)
					oTrafficSimulation.setParamItersPerPar(paramItersPerPar);
			}

			if(saves.contains("paramTotalIterNum")) {
				Integer paramTotalIterNum = (Integer)doc.get("paramTotalIterNum_docvalues_int");
				if(paramTotalIterNum != null)
					oTrafficSimulation.setParamTotalIterNum(paramTotalIterNum);
			}

			List<Long> reportKeys = (List<Long>)doc.get("reportKeys_docvalues_longs");
			if(reportKeys != null)
				oTrafficSimulation.reportKeys.addAll(reportKeys);
		}

		super.populateBaseModel(doc);
	}

	public void indexTrafficSimulation(JsonObject doc) {
		if(startDateTime != null) {
			doc.put("startDateTime_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(startDateTime.toInstant(), ZoneId.of("UTC"))));
		}
		if(simulationName != null) {
			doc.put("simulationName_docvalues_string", simulationName);
		}
		if(sumocfgPath != null) {
			doc.put("sumocfgPath_docvalues_string", sumocfgPath);
		}
		if(fcdFilePath != null) {
			doc.put("fcdFilePath_docvalues_string", fcdFilePath);
		}
		if(netFilePath != null) {
			doc.put("netFilePath_docvalues_string", netFilePath);
		}
		if(startSeconds != null) {
			doc.put("startSeconds_docvalues_double", startSeconds.doubleValue());
		}
		if(endSeconds != null) {
			doc.put("endSeconds_docvalues_double", endSeconds.doubleValue());
		}
		if(stepSeconds != null) {
			doc.put("stepSeconds_docvalues_double", stepSeconds.doubleValue());
		}
		if(paramAvgVehiclePerMinFromWestToEast != null) {
			doc.put("paramAvgVehiclePerMinFromWestToEast_docvalues_double", paramAvgVehiclePerMinFromWestToEast.doubleValue());
		}
		if(paramAvgVehiclePerMinFromSouthToNorth != null) {
			doc.put("paramAvgVehiclePerMinFromSouthToNorth_docvalues_double", paramAvgVehiclePerMinFromSouthToNorth.doubleValue());
		}
		if(paramVehicleDemandScalingFactor != null) {
			doc.put("paramVehicleDemandScalingFactor_docvalues_double", paramVehicleDemandScalingFactor.doubleValue());
		}
		if(paramAvgPedestrianPerMinFromWestToEast != null) {
			doc.put("paramAvgPedestrianPerMinFromWestToEast_docvalues_double", paramAvgPedestrianPerMinFromWestToEast.doubleValue());
		}
		if(paramAvgPedestrianPerMinFromSouthToNorth != null) {
			doc.put("paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double", paramAvgPedestrianPerMinFromSouthToNorth.doubleValue());
		}
		if(paramPedestrianDemandScalingFactor != null) {
			doc.put("paramPedestrianDemandScalingFactor_docvalues_double", paramPedestrianDemandScalingFactor.doubleValue());
		}
		if(paramDemandScale != null) {
			JsonArray l = new JsonArray();
			doc.put("paramDemandScale_docvalues_doubles", l);
			for(BigDecimal o : paramDemandScale) {
				l.add(o);
			}
		}
		if(paramMinGreenTimeSecWestEast != null) {
			doc.put("paramMinGreenTimeSecWestEast_docvalues_double", paramMinGreenTimeSecWestEast.doubleValue());
		}
		if(paramMaxGreenTimeSecWestEast != null) {
			doc.put("paramMaxGreenTimeSecWestEast_docvalues_double", paramMaxGreenTimeSecWestEast.doubleValue());
		}
		if(paramMinGreenTimeSecSouthNorth != null) {
			doc.put("paramMinGreenTimeSecSouthNorth_docvalues_double", paramMinGreenTimeSecSouthNorth.doubleValue());
		}
		if(paramMaxGreenTimeSecSouthNorth != null) {
			doc.put("paramMaxGreenTimeSecSouthNorth_docvalues_double", paramMaxGreenTimeSecSouthNorth.doubleValue());
		}
		if(paramPedestrianWaitThresholdSecNorthSouth != null) {
			doc.put("paramPedestrianWaitThresholdSecNorthSouth_docvalues_double", paramPedestrianWaitThresholdSecNorthSouth.doubleValue());
		}
		if(paramPedestrianWaitThresholdSecWestEast != null) {
			doc.put("paramPedestrianWaitThresholdSecWestEast_docvalues_double", paramPedestrianWaitThresholdSecWestEast.doubleValue());
		}
		if(paramVehicleQueueThresholdWestEast != null) {
			doc.put("paramVehicleQueueThresholdWestEast_docvalues_double", paramVehicleQueueThresholdWestEast.doubleValue());
		}
		if(paramVehicleQueueThresholdSouthNorth != null) {
			doc.put("paramVehicleQueueThresholdSouthNorth_docvalues_double", paramVehicleQueueThresholdSouthNorth.doubleValue());
		}
		if(paramPedestrianQueueThresholdNorthSouth != null) {
			doc.put("paramPedestrianQueueThresholdNorthSouth_docvalues_double", paramPedestrianQueueThresholdNorthSouth.doubleValue());
		}
		if(paramPedestrianQueueThresholdWestEast != null) {
			doc.put("paramPedestrianQueueThresholdWestEast_docvalues_double", paramPedestrianQueueThresholdWestEast.doubleValue());
		}
		if(paramStepSize != null) {
			doc.put("paramStepSize_docvalues_double", paramStepSize.doubleValue());
		}
		if(paramRunTime != null) {
			doc.put("paramRunTime_docvalues_int", paramRunTime);
		}
		if(paramItersPerPar != null) {
			doc.put("paramItersPerPar_docvalues_int", paramItersPerPar);
		}
		if(paramTotalIterNum != null) {
			doc.put("paramTotalIterNum_docvalues_int", paramTotalIterNum);
		}
		if(reportKeys != null) {
			JsonArray l = new JsonArray();
			doc.put("reportKeys_docvalues_longs", l);
			for(Long o : reportKeys) {
				l.add(o);
			}
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredTrafficSimulation(String entityVar) {
		switch(entityVar) {
			case "startDateTime":
				return "startDateTime_docvalues_date";
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
			case "fcdFilePath":
				return "fcdFilePath_docvalues_string";
			case "netFilePath":
				return "netFilePath_docvalues_string";
			case "startSeconds":
				return "startSeconds_docvalues_double";
			case "endSeconds":
				return "endSeconds_docvalues_double";
			case "stepSeconds":
				return "stepSeconds_docvalues_double";
			case "paramAvgVehiclePerMinFromWestToEast":
				return "paramAvgVehiclePerMinFromWestToEast_docvalues_double";
			case "paramAvgVehiclePerMinFromSouthToNorth":
				return "paramAvgVehiclePerMinFromSouthToNorth_docvalues_double";
			case "paramVehicleDemandScalingFactor":
				return "paramVehicleDemandScalingFactor_docvalues_double";
			case "paramAvgPedestrianPerMinFromWestToEast":
				return "paramAvgPedestrianPerMinFromWestToEast_docvalues_double";
			case "paramAvgPedestrianPerMinFromSouthToNorth":
				return "paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double";
			case "paramPedestrianDemandScalingFactor":
				return "paramPedestrianDemandScalingFactor_docvalues_double";
			case "paramDemandScale":
				return "paramDemandScale_docvalues_doubles";
			case "paramMinGreenTimeSecWestEast":
				return "paramMinGreenTimeSecWestEast_docvalues_double";
			case "paramMaxGreenTimeSecWestEast":
				return "paramMaxGreenTimeSecWestEast_docvalues_double";
			case "paramMinGreenTimeSecSouthNorth":
				return "paramMinGreenTimeSecSouthNorth_docvalues_double";
			case "paramMaxGreenTimeSecSouthNorth":
				return "paramMaxGreenTimeSecSouthNorth_docvalues_double";
			case "paramPedestrianWaitThresholdSecNorthSouth":
				return "paramPedestrianWaitThresholdSecNorthSouth_docvalues_double";
			case "paramPedestrianWaitThresholdSecWestEast":
				return "paramPedestrianWaitThresholdSecWestEast_docvalues_double";
			case "paramVehicleQueueThresholdWestEast":
				return "paramVehicleQueueThresholdWestEast_docvalues_double";
			case "paramVehicleQueueThresholdSouthNorth":
				return "paramVehicleQueueThresholdSouthNorth_docvalues_double";
			case "paramPedestrianQueueThresholdNorthSouth":
				return "paramPedestrianQueueThresholdNorthSouth_docvalues_double";
			case "paramPedestrianQueueThresholdWestEast":
				return "paramPedestrianQueueThresholdWestEast_docvalues_double";
			case "paramStepSize":
				return "paramStepSize_docvalues_double";
			case "paramRunTime":
				return "paramRunTime_docvalues_int";
			case "paramItersPerPar":
				return "paramItersPerPar_docvalues_int";
			case "paramTotalIterNum":
				return "paramTotalIterNum_docvalues_int";
			case "reportKeys":
				return "reportKeys_docvalues_longs";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedTrafficSimulation(String entityVar) {
		switch(entityVar) {
			case "startDateTime":
				return "startDateTime_docvalues_date";
			case "simulationName":
				return "simulationName_docvalues_string";
			case "sumocfgPath":
				return "sumocfgPath_docvalues_string";
			case "fcdFilePath":
				return "fcdFilePath_docvalues_string";
			case "netFilePath":
				return "netFilePath_docvalues_string";
			case "startSeconds":
				return "startSeconds_docvalues_double";
			case "endSeconds":
				return "endSeconds_docvalues_double";
			case "stepSeconds":
				return "stepSeconds_docvalues_double";
			case "paramAvgVehiclePerMinFromWestToEast":
				return "paramAvgVehiclePerMinFromWestToEast_docvalues_double";
			case "paramAvgVehiclePerMinFromSouthToNorth":
				return "paramAvgVehiclePerMinFromSouthToNorth_docvalues_double";
			case "paramVehicleDemandScalingFactor":
				return "paramVehicleDemandScalingFactor_docvalues_double";
			case "paramAvgPedestrianPerMinFromWestToEast":
				return "paramAvgPedestrianPerMinFromWestToEast_docvalues_double";
			case "paramAvgPedestrianPerMinFromSouthToNorth":
				return "paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double";
			case "paramPedestrianDemandScalingFactor":
				return "paramPedestrianDemandScalingFactor_docvalues_double";
			case "paramDemandScale":
				return "paramDemandScale_docvalues_doubles";
			case "paramMinGreenTimeSecWestEast":
				return "paramMinGreenTimeSecWestEast_docvalues_double";
			case "paramMaxGreenTimeSecWestEast":
				return "paramMaxGreenTimeSecWestEast_docvalues_double";
			case "paramMinGreenTimeSecSouthNorth":
				return "paramMinGreenTimeSecSouthNorth_docvalues_double";
			case "paramMaxGreenTimeSecSouthNorth":
				return "paramMaxGreenTimeSecSouthNorth_docvalues_double";
			case "paramPedestrianWaitThresholdSecNorthSouth":
				return "paramPedestrianWaitThresholdSecNorthSouth_docvalues_double";
			case "paramPedestrianWaitThresholdSecWestEast":
				return "paramPedestrianWaitThresholdSecWestEast_docvalues_double";
			case "paramVehicleQueueThresholdWestEast":
				return "paramVehicleQueueThresholdWestEast_docvalues_double";
			case "paramVehicleQueueThresholdSouthNorth":
				return "paramVehicleQueueThresholdSouthNorth_docvalues_double";
			case "paramPedestrianQueueThresholdNorthSouth":
				return "paramPedestrianQueueThresholdNorthSouth_docvalues_double";
			case "paramPedestrianQueueThresholdWestEast":
				return "paramPedestrianQueueThresholdWestEast_docvalues_double";
			case "paramStepSize":
				return "paramStepSize_docvalues_double";
			case "paramRunTime":
				return "paramRunTime_docvalues_int";
			case "paramItersPerPar":
				return "paramItersPerPar_docvalues_int";
			case "paramTotalIterNum":
				return "paramTotalIterNum_docvalues_int";
			case "reportKeys":
				return "reportKeys_docvalues_longs";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String searchVarTrafficSimulation(String searchVar) {
		switch(searchVar) {
			case "startDateTime_docvalues_date":
				return "startDateTime";
			case "simulationName_docvalues_string":
				return "simulationName";
			case "sumocfgPath_docvalues_string":
				return "sumocfgPath";
			case "fcdFilePath_docvalues_string":
				return "fcdFilePath";
			case "netFilePath_docvalues_string":
				return "netFilePath";
			case "startSeconds_docvalues_double":
				return "startSeconds";
			case "endSeconds_docvalues_double":
				return "endSeconds";
			case "stepSeconds_docvalues_double":
				return "stepSeconds";
			case "paramAvgVehiclePerMinFromWestToEast_docvalues_double":
				return "paramAvgVehiclePerMinFromWestToEast";
			case "paramAvgVehiclePerMinFromSouthToNorth_docvalues_double":
				return "paramAvgVehiclePerMinFromSouthToNorth";
			case "paramVehicleDemandScalingFactor_docvalues_double":
				return "paramVehicleDemandScalingFactor";
			case "paramAvgPedestrianPerMinFromWestToEast_docvalues_double":
				return "paramAvgPedestrianPerMinFromWestToEast";
			case "paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double":
				return "paramAvgPedestrianPerMinFromSouthToNorth";
			case "paramPedestrianDemandScalingFactor_docvalues_double":
				return "paramPedestrianDemandScalingFactor";
			case "paramDemandScale_docvalues_doubles":
				return "paramDemandScale";
			case "paramMinGreenTimeSecWestEast_docvalues_double":
				return "paramMinGreenTimeSecWestEast";
			case "paramMaxGreenTimeSecWestEast_docvalues_double":
				return "paramMaxGreenTimeSecWestEast";
			case "paramMinGreenTimeSecSouthNorth_docvalues_double":
				return "paramMinGreenTimeSecSouthNorth";
			case "paramMaxGreenTimeSecSouthNorth_docvalues_double":
				return "paramMaxGreenTimeSecSouthNorth";
			case "paramPedestrianWaitThresholdSecNorthSouth_docvalues_double":
				return "paramPedestrianWaitThresholdSecNorthSouth";
			case "paramPedestrianWaitThresholdSecWestEast_docvalues_double":
				return "paramPedestrianWaitThresholdSecWestEast";
			case "paramVehicleQueueThresholdWestEast_docvalues_double":
				return "paramVehicleQueueThresholdWestEast";
			case "paramVehicleQueueThresholdSouthNorth_docvalues_double":
				return "paramVehicleQueueThresholdSouthNorth";
			case "paramPedestrianQueueThresholdNorthSouth_docvalues_double":
				return "paramPedestrianQueueThresholdNorthSouth";
			case "paramPedestrianQueueThresholdWestEast_docvalues_double":
				return "paramPedestrianQueueThresholdWestEast";
			case "paramStepSize_docvalues_double":
				return "paramStepSize";
			case "paramRunTime_docvalues_int":
				return "paramRunTime";
			case "paramItersPerPar_docvalues_int":
				return "paramItersPerPar";
			case "paramTotalIterNum_docvalues_int":
				return "paramTotalIterNum";
			case "reportKeys_docvalues_longs":
				return "reportKeys";
			default:
				return BaseModel.searchVarBaseModel(searchVar);
		}
	}

	public static String varSearchTrafficSimulation(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedTrafficSimulation(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeTrafficSimulation(doc);
	}
	public void storeTrafficSimulation(SolrResponse.Doc doc) {
		TrafficSimulation oTrafficSimulation = (TrafficSimulation)this;

		oTrafficSimulation.setStartDateTime(Optional.ofNullable(doc.get("startDateTime_docvalues_date")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setSimulationName(Optional.ofNullable(doc.get("simulationName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setSumocfgPath(Optional.ofNullable(doc.get("sumocfgPath_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setFcdFilePath(Optional.ofNullable(doc.get("fcdFilePath_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setNetFilePath(Optional.ofNullable(doc.get("netFilePath_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setStartSeconds(Optional.ofNullable(doc.get("startSeconds_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setEndSeconds(Optional.ofNullable(doc.get("endSeconds_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setStepSeconds(Optional.ofNullable(doc.get("stepSeconds_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamAvgVehiclePerMinFromWestToEast(Optional.ofNullable(doc.get("paramAvgVehiclePerMinFromWestToEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamAvgVehiclePerMinFromSouthToNorth(Optional.ofNullable(doc.get("paramAvgVehiclePerMinFromSouthToNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamVehicleDemandScalingFactor(Optional.ofNullable(doc.get("paramVehicleDemandScalingFactor_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamAvgPedestrianPerMinFromWestToEast(Optional.ofNullable(doc.get("paramAvgPedestrianPerMinFromWestToEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamAvgPedestrianPerMinFromSouthToNorth(Optional.ofNullable(doc.get("paramAvgPedestrianPerMinFromSouthToNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamPedestrianDemandScalingFactor(Optional.ofNullable(doc.get("paramPedestrianDemandScalingFactor_docvalues_double")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("paramDemandScale_docvalues_doubles")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oTrafficSimulation.addParamDemandScale(v.toString());
		});
		oTrafficSimulation.setParamMinGreenTimeSecWestEast(Optional.ofNullable(doc.get("paramMinGreenTimeSecWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamMaxGreenTimeSecWestEast(Optional.ofNullable(doc.get("paramMaxGreenTimeSecWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamMinGreenTimeSecSouthNorth(Optional.ofNullable(doc.get("paramMinGreenTimeSecSouthNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamMaxGreenTimeSecSouthNorth(Optional.ofNullable(doc.get("paramMaxGreenTimeSecSouthNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamPedestrianWaitThresholdSecNorthSouth(Optional.ofNullable(doc.get("paramPedestrianWaitThresholdSecNorthSouth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamPedestrianWaitThresholdSecWestEast(Optional.ofNullable(doc.get("paramPedestrianWaitThresholdSecWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamVehicleQueueThresholdWestEast(Optional.ofNullable(doc.get("paramVehicleQueueThresholdWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamVehicleQueueThresholdSouthNorth(Optional.ofNullable(doc.get("paramVehicleQueueThresholdSouthNorth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamPedestrianQueueThresholdNorthSouth(Optional.ofNullable(doc.get("paramPedestrianQueueThresholdNorthSouth_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamPedestrianQueueThresholdWestEast(Optional.ofNullable(doc.get("paramPedestrianQueueThresholdWestEast_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamStepSize(Optional.ofNullable(doc.get("paramStepSize_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamRunTime(Optional.ofNullable(doc.get("paramRunTime_docvalues_int")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamItersPerPar(Optional.ofNullable(doc.get("paramItersPerPar_docvalues_int")).map(v -> v.toString()).orElse(null));
		oTrafficSimulation.setParamTotalIterNum(Optional.ofNullable(doc.get("paramTotalIterNum_docvalues_int")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("reportKeys_docvalues_longs")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oTrafficSimulation.addReportKeys(v.toString());
		});

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestTrafficSimulation() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof TrafficSimulation) {
			TrafficSimulation original = (TrafficSimulation)o;
			if(!Objects.equals(startDateTime, original.getStartDateTime()))
				apiRequest.addVars("startDateTime");
			if(!Objects.equals(simulationName, original.getSimulationName()))
				apiRequest.addVars("simulationName");
			if(!Objects.equals(sumocfgPath, original.getSumocfgPath()))
				apiRequest.addVars("sumocfgPath");
			if(!Objects.equals(fcdFilePath, original.getFcdFilePath()))
				apiRequest.addVars("fcdFilePath");
			if(!Objects.equals(netFilePath, original.getNetFilePath()))
				apiRequest.addVars("netFilePath");
			if(!Objects.equals(startSeconds, original.getStartSeconds()))
				apiRequest.addVars("startSeconds");
			if(!Objects.equals(endSeconds, original.getEndSeconds()))
				apiRequest.addVars("endSeconds");
			if(!Objects.equals(stepSeconds, original.getStepSeconds()))
				apiRequest.addVars("stepSeconds");
			if(!Objects.equals(paramAvgVehiclePerMinFromWestToEast, original.getParamAvgVehiclePerMinFromWestToEast()))
				apiRequest.addVars("paramAvgVehiclePerMinFromWestToEast");
			if(!Objects.equals(paramAvgVehiclePerMinFromSouthToNorth, original.getParamAvgVehiclePerMinFromSouthToNorth()))
				apiRequest.addVars("paramAvgVehiclePerMinFromSouthToNorth");
			if(!Objects.equals(paramVehicleDemandScalingFactor, original.getParamVehicleDemandScalingFactor()))
				apiRequest.addVars("paramVehicleDemandScalingFactor");
			if(!Objects.equals(paramAvgPedestrianPerMinFromWestToEast, original.getParamAvgPedestrianPerMinFromWestToEast()))
				apiRequest.addVars("paramAvgPedestrianPerMinFromWestToEast");
			if(!Objects.equals(paramAvgPedestrianPerMinFromSouthToNorth, original.getParamAvgPedestrianPerMinFromSouthToNorth()))
				apiRequest.addVars("paramAvgPedestrianPerMinFromSouthToNorth");
			if(!Objects.equals(paramPedestrianDemandScalingFactor, original.getParamPedestrianDemandScalingFactor()))
				apiRequest.addVars("paramPedestrianDemandScalingFactor");
			if(!Objects.equals(paramDemandScale, original.getParamDemandScale()))
				apiRequest.addVars("paramDemandScale");
			if(!Objects.equals(paramMinGreenTimeSecWestEast, original.getParamMinGreenTimeSecWestEast()))
				apiRequest.addVars("paramMinGreenTimeSecWestEast");
			if(!Objects.equals(paramMaxGreenTimeSecWestEast, original.getParamMaxGreenTimeSecWestEast()))
				apiRequest.addVars("paramMaxGreenTimeSecWestEast");
			if(!Objects.equals(paramMinGreenTimeSecSouthNorth, original.getParamMinGreenTimeSecSouthNorth()))
				apiRequest.addVars("paramMinGreenTimeSecSouthNorth");
			if(!Objects.equals(paramMaxGreenTimeSecSouthNorth, original.getParamMaxGreenTimeSecSouthNorth()))
				apiRequest.addVars("paramMaxGreenTimeSecSouthNorth");
			if(!Objects.equals(paramPedestrianWaitThresholdSecNorthSouth, original.getParamPedestrianWaitThresholdSecNorthSouth()))
				apiRequest.addVars("paramPedestrianWaitThresholdSecNorthSouth");
			if(!Objects.equals(paramPedestrianWaitThresholdSecWestEast, original.getParamPedestrianWaitThresholdSecWestEast()))
				apiRequest.addVars("paramPedestrianWaitThresholdSecWestEast");
			if(!Objects.equals(paramVehicleQueueThresholdWestEast, original.getParamVehicleQueueThresholdWestEast()))
				apiRequest.addVars("paramVehicleQueueThresholdWestEast");
			if(!Objects.equals(paramVehicleQueueThresholdSouthNorth, original.getParamVehicleQueueThresholdSouthNorth()))
				apiRequest.addVars("paramVehicleQueueThresholdSouthNorth");
			if(!Objects.equals(paramPedestrianQueueThresholdNorthSouth, original.getParamPedestrianQueueThresholdNorthSouth()))
				apiRequest.addVars("paramPedestrianQueueThresholdNorthSouth");
			if(!Objects.equals(paramPedestrianQueueThresholdWestEast, original.getParamPedestrianQueueThresholdWestEast()))
				apiRequest.addVars("paramPedestrianQueueThresholdWestEast");
			if(!Objects.equals(paramStepSize, original.getParamStepSize()))
				apiRequest.addVars("paramStepSize");
			if(!Objects.equals(paramRunTime, original.getParamRunTime()))
				apiRequest.addVars("paramRunTime");
			if(!Objects.equals(paramItersPerPar, original.getParamItersPerPar()))
				apiRequest.addVars("paramItersPerPar");
			if(!Objects.equals(paramTotalIterNum, original.getParamTotalIterNum()))
				apiRequest.addVars("paramTotalIterNum");
			if(!Objects.equals(reportKeys, original.getReportKeys()))
				apiRequest.addVars("reportKeys");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(startDateTime).map(v -> "startDateTime: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(simulationName).map(v -> "simulationName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(sumocfgPath).map(v -> "sumocfgPath: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(fcdFilePath).map(v -> "fcdFilePath: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(netFilePath).map(v -> "netFilePath: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(startSeconds).map(v -> "startSeconds: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(endSeconds).map(v -> "endSeconds: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(stepSeconds).map(v -> "stepSeconds: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgVehiclePerMinFromWestToEast).map(v -> "paramAvgVehiclePerMinFromWestToEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgVehiclePerMinFromSouthToNorth).map(v -> "paramAvgVehiclePerMinFromSouthToNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramVehicleDemandScalingFactor).map(v -> "paramVehicleDemandScalingFactor: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgPedestrianPerMinFromWestToEast).map(v -> "paramAvgPedestrianPerMinFromWestToEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramAvgPedestrianPerMinFromSouthToNorth).map(v -> "paramAvgPedestrianPerMinFromSouthToNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianDemandScalingFactor).map(v -> "paramPedestrianDemandScalingFactor: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramDemandScale).map(v -> "paramDemandScale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramMinGreenTimeSecWestEast).map(v -> "paramMinGreenTimeSecWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramMaxGreenTimeSecWestEast).map(v -> "paramMaxGreenTimeSecWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramMinGreenTimeSecSouthNorth).map(v -> "paramMinGreenTimeSecSouthNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramMaxGreenTimeSecSouthNorth).map(v -> "paramMaxGreenTimeSecSouthNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianWaitThresholdSecNorthSouth).map(v -> "paramPedestrianWaitThresholdSecNorthSouth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianWaitThresholdSecWestEast).map(v -> "paramPedestrianWaitThresholdSecWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramVehicleQueueThresholdWestEast).map(v -> "paramVehicleQueueThresholdWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramVehicleQueueThresholdSouthNorth).map(v -> "paramVehicleQueueThresholdSouthNorth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianQueueThresholdNorthSouth).map(v -> "paramPedestrianQueueThresholdNorthSouth: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramPedestrianQueueThresholdWestEast).map(v -> "paramPedestrianQueueThresholdWestEast: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramStepSize).map(v -> "paramStepSize: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramRunTime).map(v -> "paramRunTime: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramItersPerPar).map(v -> "paramItersPerPar: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paramTotalIterNum).map(v -> "paramTotalIterNum: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(reportKeys).map(v -> "reportKeys: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "TrafficSimulation";
	public static final String VAR_startDateTime = "startDateTime";
	public static final String VAR_simulationName = "simulationName";
	public static final String VAR_sumocfgPath = "sumocfgPath";
	public static final String VAR_fcdFilePath = "fcdFilePath";
	public static final String VAR_netFilePath = "netFilePath";
	public static final String VAR_startSeconds = "startSeconds";
	public static final String VAR_endSeconds = "endSeconds";
	public static final String VAR_stepSeconds = "stepSeconds";
	public static final String VAR_paramAvgVehiclePerMinFromWestToEast = "paramAvgVehiclePerMinFromWestToEast";
	public static final String VAR_paramAvgVehiclePerMinFromSouthToNorth = "paramAvgVehiclePerMinFromSouthToNorth";
	public static final String VAR_paramVehicleDemandScalingFactor = "paramVehicleDemandScalingFactor";
	public static final String VAR_paramAvgPedestrianPerMinFromWestToEast = "paramAvgPedestrianPerMinFromWestToEast";
	public static final String VAR_paramAvgPedestrianPerMinFromSouthToNorth = "paramAvgPedestrianPerMinFromSouthToNorth";
	public static final String VAR_paramPedestrianDemandScalingFactor = "paramPedestrianDemandScalingFactor";
	public static final String VAR_paramDemandScale = "paramDemandScale";
	public static final String VAR_paramMinGreenTimeSecWestEast = "paramMinGreenTimeSecWestEast";
	public static final String VAR_paramMaxGreenTimeSecWestEast = "paramMaxGreenTimeSecWestEast";
	public static final String VAR_paramMinGreenTimeSecSouthNorth = "paramMinGreenTimeSecSouthNorth";
	public static final String VAR_paramMaxGreenTimeSecSouthNorth = "paramMaxGreenTimeSecSouthNorth";
	public static final String VAR_paramPedestrianWaitThresholdSecNorthSouth = "paramPedestrianWaitThresholdSecNorthSouth";
	public static final String VAR_paramPedestrianWaitThresholdSecWestEast = "paramPedestrianWaitThresholdSecWestEast";
	public static final String VAR_paramVehicleQueueThresholdWestEast = "paramVehicleQueueThresholdWestEast";
	public static final String VAR_paramVehicleQueueThresholdSouthNorth = "paramVehicleQueueThresholdSouthNorth";
	public static final String VAR_paramPedestrianQueueThresholdNorthSouth = "paramPedestrianQueueThresholdNorthSouth";
	public static final String VAR_paramPedestrianQueueThresholdWestEast = "paramPedestrianQueueThresholdWestEast";
	public static final String VAR_paramStepSize = "paramStepSize";
	public static final String VAR_paramRunTime = "paramRunTime";
	public static final String VAR_paramItersPerPar = "paramItersPerPar";
	public static final String VAR_paramTotalIterNum = "paramTotalIterNum";
	public static final String VAR_reportKeys = "reportKeys";
	public static final String VAR_tlsStatesPaths = "tlsStatesPaths";
	public static final String VAR_additionalFilePaths = "additionalFilePaths";

	public static List<String> varsQForClass() {
		return TrafficSimulation.varsQTrafficSimulation(new ArrayList<String>());
	}
	public static List<String> varsQTrafficSimulation(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return TrafficSimulation.varsFqTrafficSimulation(new ArrayList<String>());
	}
	public static List<String> varsFqTrafficSimulation(List<String> vars) {
		vars.add(VAR_startDateTime);
		vars.add(VAR_simulationName);
		vars.add(VAR_sumocfgPath);
		vars.add(VAR_fcdFilePath);
		vars.add(VAR_netFilePath);
		vars.add(VAR_startSeconds);
		vars.add(VAR_endSeconds);
		vars.add(VAR_stepSeconds);
		vars.add(VAR_paramAvgVehiclePerMinFromWestToEast);
		vars.add(VAR_paramAvgVehiclePerMinFromSouthToNorth);
		vars.add(VAR_paramVehicleDemandScalingFactor);
		vars.add(VAR_paramAvgPedestrianPerMinFromWestToEast);
		vars.add(VAR_paramAvgPedestrianPerMinFromSouthToNorth);
		vars.add(VAR_paramPedestrianDemandScalingFactor);
		vars.add(VAR_paramDemandScale);
		vars.add(VAR_paramMinGreenTimeSecWestEast);
		vars.add(VAR_paramMaxGreenTimeSecWestEast);
		vars.add(VAR_paramMinGreenTimeSecSouthNorth);
		vars.add(VAR_paramMaxGreenTimeSecSouthNorth);
		vars.add(VAR_paramPedestrianWaitThresholdSecNorthSouth);
		vars.add(VAR_paramPedestrianWaitThresholdSecWestEast);
		vars.add(VAR_paramVehicleQueueThresholdWestEast);
		vars.add(VAR_paramVehicleQueueThresholdSouthNorth);
		vars.add(VAR_paramPedestrianQueueThresholdNorthSouth);
		vars.add(VAR_paramPedestrianQueueThresholdWestEast);
		vars.add(VAR_paramStepSize);
		vars.add(VAR_paramRunTime);
		vars.add(VAR_paramItersPerPar);
		vars.add(VAR_paramTotalIterNum);
		vars.add(VAR_reportKeys);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return TrafficSimulation.varsRangeTrafficSimulation(new ArrayList<String>());
	}
	public static List<String> varsRangeTrafficSimulation(List<String> vars) {
		vars.add(VAR_startDateTime);
		vars.add(VAR_startSeconds);
		vars.add(VAR_endSeconds);
		vars.add(VAR_stepSeconds);
		vars.add(VAR_paramAvgVehiclePerMinFromWestToEast);
		vars.add(VAR_paramAvgVehiclePerMinFromSouthToNorth);
		vars.add(VAR_paramVehicleDemandScalingFactor);
		vars.add(VAR_paramAvgPedestrianPerMinFromWestToEast);
		vars.add(VAR_paramAvgPedestrianPerMinFromSouthToNorth);
		vars.add(VAR_paramPedestrianDemandScalingFactor);
		vars.add(VAR_paramMinGreenTimeSecWestEast);
		vars.add(VAR_paramMaxGreenTimeSecWestEast);
		vars.add(VAR_paramMinGreenTimeSecSouthNorth);
		vars.add(VAR_paramMaxGreenTimeSecSouthNorth);
		vars.add(VAR_paramPedestrianWaitThresholdSecNorthSouth);
		vars.add(VAR_paramPedestrianWaitThresholdSecWestEast);
		vars.add(VAR_paramVehicleQueueThresholdWestEast);
		vars.add(VAR_paramVehicleQueueThresholdSouthNorth);
		vars.add(VAR_paramPedestrianQueueThresholdNorthSouth);
		vars.add(VAR_paramPedestrianQueueThresholdWestEast);
		vars.add(VAR_paramStepSize);
		vars.add(VAR_paramRunTime);
		vars.add(VAR_paramItersPerPar);
		vars.add(VAR_paramTotalIterNum);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_startDateTime = "Start date and Time";
	public static final String DISPLAY_NAME_simulationName = "simulation name";
	public static final String DISPLAY_NAME_sumocfgPath = "sumocfg path";
	public static final String DISPLAY_NAME_fcdFilePath = "Floating Car Data file path";
	public static final String DISPLAY_NAME_netFilePath = "net file path";
	public static final String DISPLAY_NAME_startSeconds = "start seconds";
	public static final String DISPLAY_NAME_endSeconds = "end seconds";
	public static final String DISPLAY_NAME_stepSeconds = "step seconds";
	public static final String DISPLAY_NAME_paramAvgVehiclePerMinFromWestToEast = "Average vehicle/min from WEST to EAST";
	public static final String DISPLAY_NAME_paramAvgVehiclePerMinFromSouthToNorth = "Average vehicle/min from SOUTH to NORTH";
	public static final String DISPLAY_NAME_paramVehicleDemandScalingFactor = "Demand scaling factor (multiplies all vehicle demands)";
	public static final String DISPLAY_NAME_paramAvgPedestrianPerMinFromWestToEast = "Average pedestrian/min from WEST to EAST";
	public static final String DISPLAY_NAME_paramAvgPedestrianPerMinFromSouthToNorth = "Average pedestrian/min from WEST to EAST";
	public static final String DISPLAY_NAME_paramPedestrianDemandScalingFactor = "Demand scaling factor (multiplies all pedestrian demands)";
	public static final String DISPLAY_NAME_paramDemandScale = "demand scale";
	public static final String DISPLAY_NAME_paramMinGreenTimeSecWestEast = "Min GREEN time for WEST-EAST traffic (sec)";
	public static final String DISPLAY_NAME_paramMaxGreenTimeSecWestEast = "Max GREEN time for WEST-EAST traffic (sec)";
	public static final String DISPLAY_NAME_paramMinGreenTimeSecSouthNorth = "Min GREEN time for SOUTH-NORTH traffic (sec)";
	public static final String DISPLAY_NAME_paramMaxGreenTimeSecSouthNorth = "Max GREEN time for SOUTH-NORTH traffic (sec)";
	public static final String DISPLAY_NAME_paramPedestrianWaitThresholdSecNorthSouth = "Pedestrian waiting time tolerance threshold for NORTH-SOUTH (sec)";
	public static final String DISPLAY_NAME_paramPedestrianWaitThresholdSecWestEast = "Pedestrian waiting time tolerance threshold for WEST-EAST (sec)";
	public static final String DISPLAY_NAME_paramVehicleQueueThresholdWestEast = "Vehicle queue length threshold between low-high content for WEST-EAST";
	public static final String DISPLAY_NAME_paramVehicleQueueThresholdSouthNorth = "Vehicle queue length threshold between low-high content for SOUTH-NORTH";
	public static final String DISPLAY_NAME_paramPedestrianQueueThresholdNorthSouth = "Pedestrian queue length threshold between low-high content for NORTH-SOUTH";
	public static final String DISPLAY_NAME_paramPedestrianQueueThresholdWestEast = "Pedestrian queue length threshold between low-high content for WEST-EAST";
	public static final String DISPLAY_NAME_paramStepSize = "Simulation time step (sec)";
	public static final String DISPLAY_NAME_paramRunTime = "time for each round of traffic simulation (sec)";
	public static final String DISPLAY_NAME_paramItersPerPar = "Number of simulation repetitions with same input (for statistical accuracy)";
	public static final String DISPLAY_NAME_paramTotalIterNum = "Number of parameter update iterations before output";
	public static final String DISPLAY_NAME_reportKeys = "simulation reports";
	public static final String DISPLAY_NAME_tlsStatesPaths = "TLS States paths";
	public static final String DISPLAY_NAME_additionalFilePaths = "additional file paths";

	public static String displayNameForClass(String var) {
		return TrafficSimulation.displayNameTrafficSimulation(var);
	}
	public static String displayNameTrafficSimulation(String var) {
		switch(var) {
		case VAR_startDateTime:
			return DISPLAY_NAME_startDateTime;
		case VAR_simulationName:
			return DISPLAY_NAME_simulationName;
		case VAR_sumocfgPath:
			return DISPLAY_NAME_sumocfgPath;
		case VAR_fcdFilePath:
			return DISPLAY_NAME_fcdFilePath;
		case VAR_netFilePath:
			return DISPLAY_NAME_netFilePath;
		case VAR_startSeconds:
			return DISPLAY_NAME_startSeconds;
		case VAR_endSeconds:
			return DISPLAY_NAME_endSeconds;
		case VAR_stepSeconds:
			return DISPLAY_NAME_stepSeconds;
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return DISPLAY_NAME_paramAvgVehiclePerMinFromWestToEast;
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return DISPLAY_NAME_paramAvgVehiclePerMinFromSouthToNorth;
		case VAR_paramVehicleDemandScalingFactor:
			return DISPLAY_NAME_paramVehicleDemandScalingFactor;
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return DISPLAY_NAME_paramAvgPedestrianPerMinFromWestToEast;
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return DISPLAY_NAME_paramAvgPedestrianPerMinFromSouthToNorth;
		case VAR_paramPedestrianDemandScalingFactor:
			return DISPLAY_NAME_paramPedestrianDemandScalingFactor;
		case VAR_paramDemandScale:
			return DISPLAY_NAME_paramDemandScale;
		case VAR_paramMinGreenTimeSecWestEast:
			return DISPLAY_NAME_paramMinGreenTimeSecWestEast;
		case VAR_paramMaxGreenTimeSecWestEast:
			return DISPLAY_NAME_paramMaxGreenTimeSecWestEast;
		case VAR_paramMinGreenTimeSecSouthNorth:
			return DISPLAY_NAME_paramMinGreenTimeSecSouthNorth;
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return DISPLAY_NAME_paramMaxGreenTimeSecSouthNorth;
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return DISPLAY_NAME_paramPedestrianWaitThresholdSecNorthSouth;
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return DISPLAY_NAME_paramPedestrianWaitThresholdSecWestEast;
		case VAR_paramVehicleQueueThresholdWestEast:
			return DISPLAY_NAME_paramVehicleQueueThresholdWestEast;
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return DISPLAY_NAME_paramVehicleQueueThresholdSouthNorth;
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return DISPLAY_NAME_paramPedestrianQueueThresholdNorthSouth;
		case VAR_paramPedestrianQueueThresholdWestEast:
			return DISPLAY_NAME_paramPedestrianQueueThresholdWestEast;
		case VAR_paramStepSize:
			return DISPLAY_NAME_paramStepSize;
		case VAR_paramRunTime:
			return DISPLAY_NAME_paramRunTime;
		case VAR_paramItersPerPar:
			return DISPLAY_NAME_paramItersPerPar;
		case VAR_paramTotalIterNum:
			return DISPLAY_NAME_paramTotalIterNum;
		case VAR_reportKeys:
			return DISPLAY_NAME_reportKeys;
		case VAR_tlsStatesPaths:
			return DISPLAY_NAME_tlsStatesPaths;
		case VAR_additionalFilePaths:
			return DISPLAY_NAME_additionalFilePaths;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionTrafficSimulation(String var) {
		switch(var) {
		case VAR_startDateTime:
			return "The start date and time. ";
		case VAR_startSeconds:
			return "-b, --begin TIME Defines the begin time in seconds; The simulation starts at this time";
		case VAR_endSeconds:
			return "-e, --end TIME Defines the end time in seconds; The simulation ends at this time";
		case VAR_stepSeconds:
			return "--step-length TIME Defines the step duration in seconds";
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return "Min: 1";
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return "Min: 1";
		case VAR_paramVehicleDemandScalingFactor:
			return "Min: 1";
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return "Min: 1";
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return "Min: 1";
		case VAR_paramPedestrianDemandScalingFactor:
			return "Min: 1";
		case VAR_paramMinGreenTimeSecWestEast:
			return "Min: 1";
		case VAR_paramMaxGreenTimeSecWestEast:
			return "Min: 1";
		case VAR_paramMinGreenTimeSecSouthNorth:
			return "Min: 1";
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return "Min: 1";
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return "Min: 1";
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return "Min: 1";
		case VAR_paramVehicleQueueThresholdWestEast:
			return "Min: 1";
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return "Min: 1";
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return "Min: 1";
		case VAR_paramPedestrianQueueThresholdWestEast:
			return "Min: 1";
		case VAR_paramStepSize:
			return "Min: 0.5";
		case VAR_paramRunTime:
			return "Time duration of each simulated sample path. ";
		case VAR_paramItersPerPar:
			return "Number of repeats per round. ";
		case VAR_paramTotalIterNum:
			return "Total iterations to update performance. ";
		case VAR_reportKeys:
			return "The generated reports for this simulation";
		case VAR_tlsStatesPaths:
			return "The paths to all TLS States files";
		case VAR_additionalFilePaths:
			return "The paths to all the additional SUMO config files";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameTrafficSimulation(String var) {
		switch(var) {
		case VAR_startDateTime:
			return "ZonedDateTime";
		case VAR_simulationName:
			return "String";
		case VAR_sumocfgPath:
			return "String";
		case VAR_fcdFilePath:
			return "String";
		case VAR_netFilePath:
			return "String";
		case VAR_startSeconds:
			return "BigDecimal";
		case VAR_endSeconds:
			return "BigDecimal";
		case VAR_stepSeconds:
			return "BigDecimal";
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return "BigDecimal";
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return "BigDecimal";
		case VAR_paramVehicleDemandScalingFactor:
			return "BigDecimal";
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return "BigDecimal";
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return "BigDecimal";
		case VAR_paramPedestrianDemandScalingFactor:
			return "BigDecimal";
		case VAR_paramDemandScale:
			return "List";
		case VAR_paramMinGreenTimeSecWestEast:
			return "BigDecimal";
		case VAR_paramMaxGreenTimeSecWestEast:
			return "BigDecimal";
		case VAR_paramMinGreenTimeSecSouthNorth:
			return "BigDecimal";
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return "BigDecimal";
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return "BigDecimal";
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return "BigDecimal";
		case VAR_paramVehicleQueueThresholdWestEast:
			return "BigDecimal";
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return "BigDecimal";
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return "BigDecimal";
		case VAR_paramPedestrianQueueThresholdWestEast:
			return "BigDecimal";
		case VAR_paramStepSize:
			return "BigDecimal";
		case VAR_paramRunTime:
			return "Integer";
		case VAR_paramItersPerPar:
			return "Integer";
		case VAR_paramTotalIterNum:
			return "Integer";
		case VAR_reportKeys:
			return "List";
		case VAR_tlsStatesPaths:
			return "List";
		case VAR_additionalFilePaths:
			return "List";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmColumnTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.htmColumnBaseModel(var);
		}
	}

	public static Integer htmRowTrafficSimulation(String var) {
		switch(var) {
		case VAR_startDateTime:
			return 6;
		case VAR_simulationName:
			return 3;
		case VAR_sumocfgPath:
			return 4;
		case VAR_fcdFilePath:
			return 5;
		case VAR_startSeconds:
			return 6;
		case VAR_endSeconds:
			return 6;
		case VAR_stepSeconds:
			return 6;
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return 7;
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return 7;
		case VAR_paramVehicleDemandScalingFactor:
			return 7;
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return 8;
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return 8;
		case VAR_paramPedestrianDemandScalingFactor:
			return 8;
		case VAR_paramMinGreenTimeSecWestEast:
			return 9;
		case VAR_paramMaxGreenTimeSecWestEast:
			return 9;
		case VAR_paramMinGreenTimeSecSouthNorth:
			return 10;
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return 10;
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return 11;
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return 11;
		case VAR_paramVehicleQueueThresholdWestEast:
			return 12;
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return 12;
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return 13;
		case VAR_paramPedestrianQueueThresholdWestEast:
			return 13;
		case VAR_paramStepSize:
			return 14;
		case VAR_paramRunTime:
			return 14;
		case VAR_paramItersPerPar:
			return 15;
		case VAR_paramTotalIterNum:
			return 15;
		case VAR_reportKeys:
			return 16;
			default:
				return BaseModel.htmRowBaseModel(var);
		}
	}

	public static Integer htmCellTrafficSimulation(String var) {
		switch(var) {
		case VAR_startDateTime:
			return 1;
		case VAR_simulationName:
			return 1;
		case VAR_sumocfgPath:
			return 1;
		case VAR_fcdFilePath:
			return 1;
		case VAR_startSeconds:
			return 1;
		case VAR_endSeconds:
			return 2;
		case VAR_stepSeconds:
			return 3;
		case VAR_paramAvgVehiclePerMinFromWestToEast:
			return 1;
		case VAR_paramAvgVehiclePerMinFromSouthToNorth:
			return 2;
		case VAR_paramVehicleDemandScalingFactor:
			return 3;
		case VAR_paramAvgPedestrianPerMinFromWestToEast:
			return 1;
		case VAR_paramAvgPedestrianPerMinFromSouthToNorth:
			return 2;
		case VAR_paramPedestrianDemandScalingFactor:
			return 3;
		case VAR_paramMinGreenTimeSecWestEast:
			return 1;
		case VAR_paramMaxGreenTimeSecWestEast:
			return 2;
		case VAR_paramMinGreenTimeSecSouthNorth:
			return 1;
		case VAR_paramMaxGreenTimeSecSouthNorth:
			return 2;
		case VAR_paramPedestrianWaitThresholdSecNorthSouth:
			return 1;
		case VAR_paramPedestrianWaitThresholdSecWestEast:
			return 2;
		case VAR_paramVehicleQueueThresholdWestEast:
			return 1;
		case VAR_paramVehicleQueueThresholdSouthNorth:
			return 2;
		case VAR_paramPedestrianQueueThresholdNorthSouth:
			return 1;
		case VAR_paramPedestrianQueueThresholdWestEast:
			return 2;
		case VAR_paramStepSize:
			return 2;
		case VAR_paramRunTime:
			return 1;
		case VAR_paramItersPerPar:
			return 1;
		case VAR_paramTotalIterNum:
			return 2;
		case VAR_reportKeys:
			return 1;
			default:
				return BaseModel.htmCellBaseModel(var);
		}
	}

	public static Integer lengthMinTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minTrafficSimulation(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
