package org.computate.smartvillageview.enus.model.traffic.light;

import org.computate.smartvillageview.enus.request.SiteRequestEnUS;
import org.computate.smartvillageview.enus.model.base.BaseModel;
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
import org.computate.smartvillageview.enus.result.map.MapResult;
import java.lang.String;
import java.math.BigDecimal;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TrafficLightGen into the class TrafficLight. 
 * </li>
 * <li>You can add a class comment "Model: true" if you wish to persist these TrafficLight objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the TrafficLightGen data in the database will then be automatically generated. 
 * </li>
 * </ol>
 * <h1>About the TrafficLight class and it's generated class TrafficLightGen&lt;MapResult&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLight">Find the class TrafficLight in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.light.TrafficLightPage. 
 * </p>
 * <p>This class contains a comment <b>"SuperPage.enUS: MapResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "MapResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.light.TrafficLightPage extends org.computate.smartvillageview.enus.result.map.MapResultPage. 
 * </p>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>This class contains a comment <b>"ApiTag: Traffic Light"</b>, which groups all of the OpenAPIs for TrafficLight objects under the tag "Traffic Light". 
 * </p>
 * <p>This class contains a comment <b>"ApiUri: /api/traffic-light"</b>, which defines the base API URI for TrafficLight objects as "/api/traffic-light" in the OpenAPI spec. 
 * </p>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the TrafficLight API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <p>This class contains a comment <b>"AName.enUS: a traffic light"</b>, which identifies the language context to describe a TrafficLight as "a traffic light". 
 * </p>
 * <p>This class contains a comment <b>"Color: blue"</b>, which styles the TrafficLight page "blue". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-blue" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the TrafficLight page with a group of "duotone". 
 * This will reference a Font Awesome icon group defined by the stylesheets in the project that starts with "fa" followed by the first letter of the icon group, which is "fad". 
 * A Font Awesome icon group of "blue" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, thin, duotone. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>
 * Delete the class TrafficLight in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLight&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.light in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class TrafficLightGen<DEV> extends MapResult {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficLight.class);

	public static final String TrafficLight_AName_enUS = "a traffic light";
	public static final String TrafficLight_This_enUS = "this ";
	public static final String TrafficLight_ThisName_enUS = "this traffic light";
	public static final String TrafficLight_A_enUS = "a ";
	public static final String TrafficLight_TheName_enUS = "the traffic light";
	public static final String TrafficLight_NameSingular_enUS = "traffic light";
	public static final String TrafficLight_NamePlural_enUS = "traffic lights";
	public static final String TrafficLight_NameActual_enUS = "current traffic light";
	public static final String TrafficLight_AllName_enUS = "all the traffic lights";
	public static final String TrafficLight_SearchAllNameBy_enUS = "search traffic lights by ";
	public static final String TrafficLight_Title_enUS = "traffic lights";
	public static final String TrafficLight_ThePluralName_enUS = "the traffic lights";
	public static final String TrafficLight_NoNameFound_enUS = "no traffic light found";
	public static final String TrafficLight_ApiUri_enUS = "/api/traffic-light";
	public static final String TrafficLight_ApiUriSearchPage_enUS = "/traffic-light";
	public static final String TrafficLight_OfName_enUS = "of traffic light";
	public static final String TrafficLight_ANameAdjective_enUS = "a traffic light";
	public static final String TrafficLight_NameAdjectiveSingular_enUS = "traffic light";
	public static final String TrafficLight_NameAdjectivePlural_enUS = "traffic lights";
	public static final String Search_enUS_Uri = "/api/traffic-light";
	public static final String Search_enUS_ImageUri = "/png/api/traffic-light-999.png";
	public static final String GET_enUS_Uri = "/api/traffic-light/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/traffic-light/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/traffic-light";
	public static final String PATCH_enUS_ImageUri = "/png/api/traffic-light-999.png";
	public static final String POST_enUS_Uri = "/api/traffic-light";
	public static final String POST_enUS_ImageUri = "/png/api/traffic-light-999.png";
	public static final String PUTImport_enUS_Uri = "/api/traffic-light-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/traffic-light-import-999.png";
	public static final String SearchPage_enUS_Uri = "/traffic-light";
	public static final String SearchPage_enUS_ImageUri = "/png/traffic-light-999.png";

	public static final String TrafficLight_Color = "blue";
	public static final String TrafficLight_IconGroup = "duotone";
	public static final String TrafficLight_IconName = "map-location-dot";
	public static final Integer TrafficLight_Rows = 100;

	////////////////////
	// trafficLightId //
	////////////////////

	/**	 The entity trafficLightId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String trafficLightId;

	/**	<br> The entity trafficLightId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLight&fq=entiteVar_enUS_indexed_string:trafficLightId">Find the entity trafficLightId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficLightId(Wrap<String> w);

	public String getTrafficLightId() {
		return trafficLightId;
	}
	public void setTrafficLightId(String o) {
		this.trafficLightId = TrafficLight.staticSetTrafficLightId(siteRequest_, o);
	}
	public static String staticSetTrafficLightId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLight trafficLightIdInit() {
		Wrap<String> trafficLightIdWrap = new Wrap<String>().var("trafficLightId");
		if(trafficLightId == null) {
			_trafficLightId(trafficLightIdWrap);
			setTrafficLightId(trafficLightIdWrap.o);
		}
		return (TrafficLight)this;
	}

	public static String staticSearchTrafficLightId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTrafficLightId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTrafficLightId(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLight.staticSearchStrTrafficLightId(siteRequest_, TrafficLight.staticSearchTrafficLightId(siteRequest_, TrafficLight.staticSetTrafficLightId(siteRequest_, o)));
	}

	public String sqlTrafficLightId() {
		return trafficLightId;
	}

	//////////////////////
	// trafficLightType //
	//////////////////////

	/**	 The entity trafficLightType
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String trafficLightType;

	/**	<br> The entity trafficLightType
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLight&fq=entiteVar_enUS_indexed_string:trafficLightType">Find the entity trafficLightType in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficLightType(Wrap<String> w);

	public String getTrafficLightType() {
		return trafficLightType;
	}
	public void setTrafficLightType(String o) {
		this.trafficLightType = TrafficLight.staticSetTrafficLightType(siteRequest_, o);
	}
	public static String staticSetTrafficLightType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLight trafficLightTypeInit() {
		Wrap<String> trafficLightTypeWrap = new Wrap<String>().var("trafficLightType");
		if(trafficLightType == null) {
			_trafficLightType(trafficLightTypeWrap);
			setTrafficLightType(trafficLightTypeWrap.o);
		}
		return (TrafficLight)this;
	}

	public static String staticSearchTrafficLightType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTrafficLightType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTrafficLightType(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLight.staticSearchStrTrafficLightType(siteRequest_, TrafficLight.staticSearchTrafficLightType(siteRequest_, TrafficLight.staticSetTrafficLightType(siteRequest_, o)));
	}

	public String sqlTrafficLightType() {
		return trafficLightType;
	}

	///////////
	// angle //
	///////////

	/**	 The entity angle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal angle;

	/**	<br> The entity angle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLight&fq=entiteVar_enUS_indexed_string:angle">Find the entity angle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _angle(Wrap<BigDecimal> w);

	public BigDecimal getAngle() {
		return angle;
	}

	public void setAngle(BigDecimal angle) {
		this.angle = angle;
	}
	@JsonIgnore
	public void setAngle(String o) {
		this.angle = TrafficLight.staticSetAngle(siteRequest_, o);
	}
	public static BigDecimal staticSetAngle(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setAngle(Double o) {
			this.angle = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setAngle(Integer o) {
			this.angle = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficLight angleInit() {
		Wrap<BigDecimal> angleWrap = new Wrap<BigDecimal>().var("angle");
		if(angle == null) {
			_angle(angleWrap);
			setAngle(angleWrap.o);
		}
		return (TrafficLight)this;
	}

	public static Double staticSearchAngle(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAngle(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAngle(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLight.staticSearchStrAngle(siteRequest_, TrafficLight.staticSearchAngle(siteRequest_, TrafficLight.staticSetAngle(siteRequest_, o)));
	}

	public BigDecimal sqlAngle() {
		return angle;
	}

	///////////
	// color //
	///////////

	/**	 The entity color
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String color;

	/**	<br> The entity color
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLight&fq=entiteVar_enUS_indexed_string:color">Find the entity color in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _color(Wrap<String> w);

	public String getColor() {
		return color;
	}
	public void setColor(String o) {
		this.color = TrafficLight.staticSetColor(siteRequest_, o);
	}
	public static String staticSetColor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLight colorInit() {
		Wrap<String> colorWrap = new Wrap<String>().var("color");
		if(color == null) {
			_color(colorWrap);
			setColor(colorWrap.o);
		}
		return (TrafficLight)this;
	}

	public static String staticSearchColor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrColor(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqColor(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLight.staticSearchStrColor(siteRequest_, TrafficLight.staticSearchColor(siteRequest_, TrafficLight.staticSetColor(siteRequest_, o)));
	}

	public String sqlColor() {
		return color;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTrafficLight(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTrafficLight();
	}

	public Future<Void> promiseDeepTrafficLight() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTrafficLight(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepMapResult(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseTrafficLight(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				trafficLightIdInit();
				trafficLightTypeInit();
				angleInit();
				colorInit();
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
		return promiseDeepTrafficLight(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficLight(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficLight(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficLight(v);
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
	public Object obtainTrafficLight(String var) {
		TrafficLight oTrafficLight = (TrafficLight)this;
		switch(var) {
			case "trafficLightId":
				return oTrafficLight.trafficLightId;
			case "trafficLightType":
				return oTrafficLight.trafficLightType;
			case "angle":
				return oTrafficLight.angle;
			case "color":
				return oTrafficLight.color;
			default:
				return super.obtainMapResult(var);
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
				o = relateTrafficLight(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficLight(String var, Object val) {
		TrafficLight oTrafficLight = (TrafficLight)this;
		switch(var) {
			default:
				return super.relateMapResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficLight(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficLight(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "trafficLightId":
			return TrafficLight.staticSetTrafficLightId(siteRequest_, o);
		case "trafficLightType":
			return TrafficLight.staticSetTrafficLightType(siteRequest_, o);
		case "angle":
			return TrafficLight.staticSetAngle(siteRequest_, o);
		case "color":
			return TrafficLight.staticSetColor(siteRequest_, o);
			default:
				return MapResult.staticSetMapResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficLight(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficLight(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "trafficLightId":
			return TrafficLight.staticSearchTrafficLightId(siteRequest_, (String)o);
		case "trafficLightType":
			return TrafficLight.staticSearchTrafficLightType(siteRequest_, (String)o);
		case "angle":
			return TrafficLight.staticSearchAngle(siteRequest_, (BigDecimal)o);
		case "color":
			return TrafficLight.staticSearchColor(siteRequest_, (String)o);
			default:
				return MapResult.staticSearchMapResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficLight(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficLight(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "trafficLightId":
			return TrafficLight.staticSearchStrTrafficLightId(siteRequest_, (String)o);
		case "trafficLightType":
			return TrafficLight.staticSearchStrTrafficLightType(siteRequest_, (String)o);
		case "angle":
			return TrafficLight.staticSearchStrAngle(siteRequest_, (Double)o);
		case "color":
			return TrafficLight.staticSearchStrColor(siteRequest_, (String)o);
			default:
				return MapResult.staticSearchStrMapResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficLight(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficLight(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "trafficLightId":
			return TrafficLight.staticSearchFqTrafficLightId(siteRequest_, o);
		case "trafficLightType":
			return TrafficLight.staticSearchFqTrafficLightType(siteRequest_, o);
		case "angle":
			return TrafficLight.staticSearchFqAngle(siteRequest_, o);
		case "color":
			return TrafficLight.staticSearchFqColor(siteRequest_, o);
			default:
				return MapResult.staticSearchFqMapResult(entityVar,  siteRequest_, o);
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
					o = persistTrafficLight(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistTrafficLight(String var, Object val) {
		switch(var.toLowerCase()) {
			case "trafficlightid":
				if(val instanceof String)
					setTrafficLightId((String)val);
				saves.add("trafficLightId");
				return val;
			case "trafficlighttype":
				if(val instanceof String)
					setTrafficLightType((String)val);
				saves.add("trafficLightType");
				return val;
			case "angle":
				if(val instanceof String)
					setAngle((String)val);
				else if(val instanceof Number)
					setAngle(new BigDecimal(((Number)val).doubleValue()));
				saves.add("angle");
				return val;
			case "color":
				if(val instanceof String)
					setColor((String)val);
				saves.add("color");
				return val;
			default:
				return super.persistMapResult(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateTrafficLight(doc);
	}
	public void populateTrafficLight(SolrResponse.Doc doc) {
		TrafficLight oTrafficLight = (TrafficLight)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateMapResult(doc);
	}

	public void indexTrafficLight(JsonObject doc) {
		if(trafficLightId != null) {
			doc.put("trafficLightId_docvalues_string", trafficLightId);
		}
		if(trafficLightType != null) {
			doc.put("trafficLightType_docvalues_string", trafficLightType);
		}
		if(angle != null) {
			doc.put("angle_docvalues_double", angle.doubleValue());
		}
		if(color != null) {
			doc.put("color_docvalues_string", color);
		}
		super.indexMapResult(doc);

	}

	public static String varStoredTrafficLight(String entityVar) {
		switch(entityVar) {
			case "trafficLightId":
				return "trafficLightId_docvalues_string";
			case "trafficLightType":
				return "trafficLightType_docvalues_string";
			case "angle":
				return "angle_docvalues_double";
			case "color":
				return "color_docvalues_string";
			default:
				return MapResult.varStoredMapResult(entityVar);
		}
	}

	public static String varIndexedTrafficLight(String entityVar) {
		switch(entityVar) {
			case "trafficLightId":
				return "trafficLightId_docvalues_string";
			case "trafficLightType":
				return "trafficLightType_docvalues_string";
			case "angle":
				return "angle_docvalues_double";
			case "color":
				return "color_docvalues_string";
			default:
				return MapResult.varIndexedMapResult(entityVar);
		}
	}

	public static String searchVarTrafficLight(String searchVar) {
		switch(searchVar) {
			case "trafficLightId_docvalues_string":
				return "trafficLightId";
			case "trafficLightType_docvalues_string":
				return "trafficLightType";
			case "angle_docvalues_double":
				return "angle";
			case "color_docvalues_string":
				return "color";
			default:
				return MapResult.searchVarMapResult(searchVar);
		}
	}

	public static String varSearchTrafficLight(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSearchMapResult(entityVar);
		}
	}

	public static String varSuggestedTrafficLight(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSuggestedMapResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeTrafficLight(doc);
	}
	public void storeTrafficLight(SolrResponse.Doc doc) {
		TrafficLight oTrafficLight = (TrafficLight)this;

		oTrafficLight.setTrafficLightId(Optional.ofNullable(doc.get("trafficLightId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficLight.setTrafficLightType(Optional.ofNullable(doc.get("trafficLightType_docvalues_string")).map(v -> v.toString()).orElse(null));
		oTrafficLight.setAngle(Optional.ofNullable(doc.get("angle_docvalues_double")).map(v -> v.toString()).orElse(null));
		oTrafficLight.setColor(Optional.ofNullable(doc.get("color_docvalues_string")).map(v -> v.toString()).orElse(null));

		super.storeMapResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestTrafficLight() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof TrafficLight) {
			TrafficLight original = (TrafficLight)o;
			if(!Objects.equals(trafficLightId, original.getTrafficLightId()))
				apiRequest.addVars("trafficLightId");
			if(!Objects.equals(trafficLightType, original.getTrafficLightType()))
				apiRequest.addVars("trafficLightType");
			if(!Objects.equals(angle, original.getAngle()))
				apiRequest.addVars("angle");
			if(!Objects.equals(color, original.getColor()))
				apiRequest.addVars("color");
			super.apiRequestMapResult();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(trafficLightId).map(v -> "trafficLightId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(trafficLightType).map(v -> "trafficLightType: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(angle).map(v -> "angle: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(color).map(v -> "color: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "TrafficLight";
	public static final String VAR_trafficLightId = "trafficLightId";
	public static final String VAR_trafficLightType = "trafficLightType";
	public static final String VAR_angle = "angle";
	public static final String VAR_color = "color";

	public static List<String> varsQForClass() {
		return TrafficLight.varsQTrafficLight(new ArrayList<String>());
	}
	public static List<String> varsQTrafficLight(List<String> vars) {
		MapResult.varsQMapResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return TrafficLight.varsFqTrafficLight(new ArrayList<String>());
	}
	public static List<String> varsFqTrafficLight(List<String> vars) {
		vars.add(VAR_trafficLightId);
		vars.add(VAR_trafficLightType);
		vars.add(VAR_angle);
		vars.add(VAR_color);
		MapResult.varsFqMapResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return TrafficLight.varsRangeTrafficLight(new ArrayList<String>());
	}
	public static List<String> varsRangeTrafficLight(List<String> vars) {
		vars.add(VAR_angle);
		MapResult.varsRangeMapResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_trafficLightId = "traffic light ID";
	public static final String DISPLAY_NAME_trafficLightType = "traffic light type";
	public static final String DISPLAY_NAME_angle = "Angle in degrees";
	public static final String DISPLAY_NAME_color = "Color";

	public static String displayNameForClass(String var) {
		return TrafficLight.displayNameTrafficLight(var);
	}
	public static String displayNameTrafficLight(String var) {
		switch(var) {
		case VAR_trafficLightId:
			return DISPLAY_NAME_trafficLightId;
		case VAR_trafficLightType:
			return DISPLAY_NAME_trafficLightType;
		case VAR_angle:
			return DISPLAY_NAME_angle;
		case VAR_color:
			return DISPLAY_NAME_color;
		default:
			return MapResult.displayNameMapResult(var);
		}
	}

	public static String descriptionTrafficLight(String var) {
		switch(var) {
			default:
				return MapResult.descriptionMapResult(var);
		}
	}

	public static String classSimpleNameTrafficLight(String var) {
		switch(var) {
		case VAR_trafficLightId:
			return "String";
		case VAR_trafficLightType:
			return "String";
		case VAR_angle:
			return "BigDecimal";
		case VAR_color:
			return "String";
			default:
				return MapResult.classSimpleNameMapResult(var);
		}
	}

	public static Integer htmlColumnTrafficLight(String var) {
		switch(var) {
			default:
				return MapResult.htmlColumnMapResult(var);
		}
	}

	public static Integer htmlRowTrafficLight(String var) {
		switch(var) {
		case VAR_trafficLightId:
			return 4;
		case VAR_trafficLightType:
			return 4;
		case VAR_angle:
			return 5;
		case VAR_color:
			return 6;
			default:
				return MapResult.htmlRowMapResult(var);
		}
	}

	public static Integer htmlCellTrafficLight(String var) {
		switch(var) {
		case VAR_trafficLightId:
			return 3;
		case VAR_trafficLightType:
			return 4;
		case VAR_angle:
			return 1;
		case VAR_color:
			return 1;
			default:
				return MapResult.htmlCellMapResult(var);
		}
	}

	public static Integer lengthMinTrafficLight(String var) {
		switch(var) {
			default:
				return MapResult.lengthMinMapResult(var);
		}
	}

	public static Integer lengthMaxTrafficLight(String var) {
		switch(var) {
			default:
				return MapResult.lengthMaxMapResult(var);
		}
	}

	public static Integer maxTrafficLight(String var) {
		switch(var) {
			default:
				return MapResult.maxMapResult(var);
		}
	}

	public static Integer minTrafficLight(String var) {
		switch(var) {
			default:
				return MapResult.minMapResult(var);
		}
	}
}