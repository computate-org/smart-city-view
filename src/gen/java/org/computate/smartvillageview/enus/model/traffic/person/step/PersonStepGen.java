package org.computate.smartvillageview.enus.model.traffic.person.step;

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
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class PersonStepGen into the class PersonStep. 
 * </li>
 * <li>You can add a class comment "Model: true" if you wish to persist these PersonStep objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the PersonStepGen data in the database will then be automatically generated. 
 * </li>
 * </ol>
 * <h1>About the PersonStep class and it's generated class PersonStepGen&lt;MapResult&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep">Find the class PersonStep in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepPage. 
 * </p>
 * <p>This class contains a comment <b>"SuperPage.enUS: MapResultPage"</b>, which identifies the Java super class of the page code by it's class simple name "MapResultPage". 
 * This means that the newly created class org.computate.smartvillageview.enus.model.traffic.person.step.PersonStepPage extends org.computate.smartvillageview.enus.result.map.MapResultPage. 
 * </p>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>This class contains a comment <b>"ApiTag: Person Step"</b>, which groups all of the OpenAPIs for PersonStep objects under the tag "Person Step". 
 * </p>
 * <p>This class contains a comment <b>"ApiUri: /api/person-step"</b>, which defines the base API URI for PersonStep objects as "/api/person-step" in the OpenAPI spec. 
 * </p>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the PersonStep API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <p>This class contains a comment <b>"AName.enUS: a person step"</b>, which identifies the language context to describe a PersonStep as "a person step". 
 * </p>
 * <p>This class contains a comment <b>"Color: blue"</b>, which styles the PersonStep page "blue". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-blue" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>This class contains a comment <b>"IconGroup: duotone"</b>, which adds icons on the PersonStep page with a group of "duotone". 
 * This will reference a Font Awesome icon group defined by the stylesheets in the project that starts with "fa" followed by the first letter of the icon group, which is "fad". 
 * A Font Awesome icon group of "blue" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, thin, duotone. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * <p>
 * Delete the class PersonStep in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.smartvillageview.enus.model.traffic.person.step in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project smart-village-view in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:smart\-village\-view&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class PersonStepGen<DEV> extends MapResult {
	protected static final Logger LOG = LoggerFactory.getLogger(PersonStep.class);

	public static final String PersonStep_AName_enUS = "a person step";
	public static final String PersonStep_This_enUS = "this ";
	public static final String PersonStep_ThisName_enUS = "this person step";
	public static final String PersonStep_A_enUS = "a ";
	public static final String PersonStep_TheName_enUS = "the person step";
	public static final String PersonStep_NameSingular_enUS = "person step";
	public static final String PersonStep_NamePlural_enUS = "person steps";
	public static final String PersonStep_NameActual_enUS = "current person step";
	public static final String PersonStep_AllName_enUS = "all the person steps";
	public static final String PersonStep_SearchAllNameBy_enUS = "search person steps by ";
	public static final String PersonStep_Title_enUS = "person steps";
	public static final String PersonStep_ThePluralName_enUS = "the person steps";
	public static final String PersonStep_NoNameFound_enUS = "no person step found";
	public static final String PersonStep_ApiUri_enUS = "/api/person-step";
	public static final String PersonStep_ApiUriSearchPage_enUS = "/person-step";
	public static final String PersonStep_OfName_enUS = "of person step";
	public static final String PersonStep_ANameAdjective_enUS = "a person step";
	public static final String PersonStep_NameAdjectiveSingular_enUS = "person step";
	public static final String PersonStep_NameAdjectivePlural_enUS = "person steps";
	public static final String Search_enUS_Uri = "/api/person-step";
	public static final String Search_enUS_ImageUri = "/png/api/person-step-999.png";
	public static final String GET_enUS_Uri = "/api/person-step/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/person-step/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/person-step";
	public static final String PATCH_enUS_ImageUri = "/png/api/person-step-999.png";
	public static final String POST_enUS_Uri = "/api/person-step";
	public static final String POST_enUS_ImageUri = "/png/api/person-step-999.png";
	public static final String PUTImport_enUS_Uri = "/api/person-step-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/person-step-import-999.png";
	public static final String SearchPage_enUS_Uri = "/person-step";
	public static final String SearchPage_enUS_ImageUri = "/png/person-step-999.png";

	public static final String PersonStep_Color = "blue";
	public static final String PersonStep_IconGroup = "duotone";
	public static final String PersonStep_IconName = "map-location-dot";
	public static final Integer PersonStep_Rows = 100;

	//////////////
	// personId //
	//////////////

	/**	 The entity personId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String personId;

	/**	<br> The entity personId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:personId">Find the entity personId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _personId(Wrap<String> w);

	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String o) {
		this.personId = PersonStep.staticSetPersonId(siteRequest_, o);
	}
	public static String staticSetPersonId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep personIdInit() {
		Wrap<String> personIdWrap = new Wrap<String>().var("personId");
		if(personId == null) {
			_personId(personIdWrap);
			setPersonId(personIdWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchPersonId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPersonId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPersonId(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPersonId(siteRequest_, PersonStep.staticSearchPersonId(siteRequest_, PersonStep.staticSetPersonId(siteRequest_, o)));
	}

	public String sqlPersonId() {
		return personId;
	}

	////////////////
	// personType //
	////////////////

	/**	 The entity personType
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String personType;

	/**	<br> The entity personType
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:personType">Find the entity personType in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _personType(Wrap<String> w);

	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String o) {
		this.personType = PersonStep.staticSetPersonType(siteRequest_, o);
	}
	public static String staticSetPersonType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep personTypeInit() {
		Wrap<String> personTypeWrap = new Wrap<String>().var("personType");
		if(personType == null) {
			_personType(personTypeWrap);
			setPersonType(personTypeWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchPersonType(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPersonType(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPersonType(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPersonType(siteRequest_, PersonStep.staticSearchPersonType(siteRequest_, PersonStep.staticSetPersonType(siteRequest_, o)));
	}

	public String sqlPersonType() {
		return personType;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:angle">Find the entity angle in Solr</a>
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
		this.angle = PersonStep.staticSetAngle(siteRequest_, o);
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
	protected PersonStep angleInit() {
		Wrap<BigDecimal> angleWrap = new Wrap<BigDecimal>().var("angle");
		if(angle == null) {
			_angle(angleWrap);
			setAngle(angleWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchAngle(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrAngle(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAngle(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrAngle(siteRequest_, PersonStep.staticSearchAngle(siteRequest_, PersonStep.staticSetAngle(siteRequest_, o)));
	}

	public BigDecimal sqlAngle() {
		return angle;
	}

	///////////
	// speed //
	///////////

	/**	 The entity speed
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal speed;

	/**	<br> The entity speed
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:speed">Find the entity speed in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _speed(Wrap<BigDecimal> w);

	public BigDecimal getSpeed() {
		return speed;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}
	@JsonIgnore
	public void setSpeed(String o) {
		this.speed = PersonStep.staticSetSpeed(siteRequest_, o);
	}
	public static BigDecimal staticSetSpeed(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setSpeed(Double o) {
			this.speed = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setSpeed(Integer o) {
			this.speed = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected PersonStep speedInit() {
		Wrap<BigDecimal> speedWrap = new Wrap<BigDecimal>().var("speed");
		if(speed == null) {
			_speed(speedWrap);
			setSpeed(speedWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchSpeed(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrSpeed(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSpeed(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSpeed(siteRequest_, PersonStep.staticSearchSpeed(siteRequest_, PersonStep.staticSetSpeed(siteRequest_, o)));
	}

	public BigDecimal sqlSpeed() {
		return speed;
	}

	/////////
	// pos //
	/////////

	/**	 The entity pos
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pos;

	/**	<br> The entity pos
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:pos">Find the entity pos in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pos(Wrap<BigDecimal> w);

	public BigDecimal getPos() {
		return pos;
	}

	public void setPos(BigDecimal pos) {
		this.pos = pos;
	}
	@JsonIgnore
	public void setPos(String o) {
		this.pos = PersonStep.staticSetPos(siteRequest_, o);
	}
	public static BigDecimal staticSetPos(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPos(Double o) {
			this.pos = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPos(Integer o) {
			this.pos = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected PersonStep posInit() {
		Wrap<BigDecimal> posWrap = new Wrap<BigDecimal>().var("pos");
		if(pos == null) {
			_pos(posWrap);
			setPos(posWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchPos(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPos(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPos(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrPos(siteRequest_, PersonStep.staticSearchPos(siteRequest_, PersonStep.staticSetPos(siteRequest_, o)));
	}

	public BigDecimal sqlPos() {
		return pos;
	}

	///////////
	// slope //
	///////////

	/**	 The entity slope
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal slope;

	/**	<br> The entity slope
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:slope">Find the entity slope in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _slope(Wrap<BigDecimal> w);

	public BigDecimal getSlope() {
		return slope;
	}

	public void setSlope(BigDecimal slope) {
		this.slope = slope;
	}
	@JsonIgnore
	public void setSlope(String o) {
		this.slope = PersonStep.staticSetSlope(siteRequest_, o);
	}
	public static BigDecimal staticSetSlope(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setSlope(Double o) {
			this.slope = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setSlope(Integer o) {
			this.slope = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected PersonStep slopeInit() {
		Wrap<BigDecimal> slopeWrap = new Wrap<BigDecimal>().var("slope");
		if(slope == null) {
			_slope(slopeWrap);
			setSlope(slopeWrap.o);
		}
		return (PersonStep)this;
	}

	public static Double staticSearchSlope(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrSlope(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSlope(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrSlope(siteRequest_, PersonStep.staticSearchSlope(siteRequest_, PersonStep.staticSetSlope(siteRequest_, o)));
	}

	public BigDecimal sqlSlope() {
		return slope;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.person.step.PersonStep&fq=entiteVar_enUS_indexed_string:color">Find the entity color in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _color(Wrap<String> w);

	public String getColor() {
		return color;
	}
	public void setColor(String o) {
		this.color = PersonStep.staticSetColor(siteRequest_, o);
	}
	public static String staticSetColor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PersonStep colorInit() {
		Wrap<String> colorWrap = new Wrap<String>().var("color");
		if(color == null) {
			_color(colorWrap);
			setColor(colorWrap.o);
		}
		return (PersonStep)this;
	}

	public static String staticSearchColor(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrColor(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqColor(SiteRequestEnUS siteRequest_, String o) {
		return PersonStep.staticSearchStrColor(siteRequest_, PersonStep.staticSearchColor(siteRequest_, PersonStep.staticSetColor(siteRequest_, o)));
	}

	public String sqlColor() {
		return color;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepPersonStep(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepPersonStep();
	}

	public Future<Void> promiseDeepPersonStep() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promisePersonStep(promise2);
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

	public Future<Void> promisePersonStep(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				personIdInit();
				personTypeInit();
				angleInit();
				speedInit();
				posInit();
				slopeInit();
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
		return promiseDeepPersonStep(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestPersonStep(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestPersonStep(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainPersonStep(v);
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
	public Object obtainPersonStep(String var) {
		PersonStep oPersonStep = (PersonStep)this;
		switch(var) {
			case "personId":
				return oPersonStep.personId;
			case "personType":
				return oPersonStep.personType;
			case "angle":
				return oPersonStep.angle;
			case "speed":
				return oPersonStep.speed;
			case "pos":
				return oPersonStep.pos;
			case "slope":
				return oPersonStep.slope;
			case "color":
				return oPersonStep.color;
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
				o = relatePersonStep(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relatePersonStep(String var, Object val) {
		PersonStep oPersonStep = (PersonStep)this;
		switch(var) {
			default:
				return super.relateMapResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetPersonStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSetPersonStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "personId":
			return PersonStep.staticSetPersonId(siteRequest_, o);
		case "personType":
			return PersonStep.staticSetPersonType(siteRequest_, o);
		case "angle":
			return PersonStep.staticSetAngle(siteRequest_, o);
		case "speed":
			return PersonStep.staticSetSpeed(siteRequest_, o);
		case "pos":
			return PersonStep.staticSetPos(siteRequest_, o);
		case "slope":
			return PersonStep.staticSetSlope(siteRequest_, o);
		case "color":
			return PersonStep.staticSetColor(siteRequest_, o);
			default:
				return MapResult.staticSetMapResult(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchPersonStep(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchPersonStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "personId":
			return PersonStep.staticSearchPersonId(siteRequest_, (String)o);
		case "personType":
			return PersonStep.staticSearchPersonType(siteRequest_, (String)o);
		case "angle":
			return PersonStep.staticSearchAngle(siteRequest_, (BigDecimal)o);
		case "speed":
			return PersonStep.staticSearchSpeed(siteRequest_, (BigDecimal)o);
		case "pos":
			return PersonStep.staticSearchPos(siteRequest_, (BigDecimal)o);
		case "slope":
			return PersonStep.staticSearchSlope(siteRequest_, (BigDecimal)o);
		case "color":
			return PersonStep.staticSearchColor(siteRequest_, (String)o);
			default:
				return MapResult.staticSearchMapResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrPersonStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrPersonStep(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "personId":
			return PersonStep.staticSearchStrPersonId(siteRequest_, (String)o);
		case "personType":
			return PersonStep.staticSearchStrPersonType(siteRequest_, (String)o);
		case "angle":
			return PersonStep.staticSearchStrAngle(siteRequest_, (Double)o);
		case "speed":
			return PersonStep.staticSearchStrSpeed(siteRequest_, (Double)o);
		case "pos":
			return PersonStep.staticSearchStrPos(siteRequest_, (Double)o);
		case "slope":
			return PersonStep.staticSearchStrSlope(siteRequest_, (Double)o);
		case "color":
			return PersonStep.staticSearchStrColor(siteRequest_, (String)o);
			default:
				return MapResult.staticSearchStrMapResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqPersonStep(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqPersonStep(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "personId":
			return PersonStep.staticSearchFqPersonId(siteRequest_, o);
		case "personType":
			return PersonStep.staticSearchFqPersonType(siteRequest_, o);
		case "angle":
			return PersonStep.staticSearchFqAngle(siteRequest_, o);
		case "speed":
			return PersonStep.staticSearchFqSpeed(siteRequest_, o);
		case "pos":
			return PersonStep.staticSearchFqPos(siteRequest_, o);
		case "slope":
			return PersonStep.staticSearchFqSlope(siteRequest_, o);
		case "color":
			return PersonStep.staticSearchFqColor(siteRequest_, o);
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
					o = persistPersonStep(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistPersonStep(String var, Object val) {
		switch(var.toLowerCase()) {
			case "personid":
				if(val instanceof String)
					setPersonId((String)val);
				saves.add("personId");
				return val;
			case "persontype":
				if(val instanceof String)
					setPersonType((String)val);
				saves.add("personType");
				return val;
			case "angle":
				if(val instanceof String)
					setAngle((String)val);
				else if(val instanceof Number)
					setAngle(new BigDecimal(((Number)val).doubleValue()));
				saves.add("angle");
				return val;
			case "speed":
				if(val instanceof String)
					setSpeed((String)val);
				else if(val instanceof Number)
					setSpeed(new BigDecimal(((Number)val).doubleValue()));
				saves.add("speed");
				return val;
			case "pos":
				if(val instanceof String)
					setPos((String)val);
				else if(val instanceof Number)
					setPos(new BigDecimal(((Number)val).doubleValue()));
				saves.add("pos");
				return val;
			case "slope":
				if(val instanceof String)
					setSlope((String)val);
				else if(val instanceof Number)
					setSlope(new BigDecimal(((Number)val).doubleValue()));
				saves.add("slope");
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
		populatePersonStep(doc);
	}
	public void populatePersonStep(SolrResponse.Doc doc) {
		PersonStep oPersonStep = (PersonStep)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateMapResult(doc);
	}

	public void indexPersonStep(JsonObject doc) {
		if(personId != null) {
			doc.put("personId_docvalues_string", personId);
		}
		if(personType != null) {
			doc.put("personType_docvalues_string", personType);
		}
		if(angle != null) {
			doc.put("angle_docvalues_double", angle.doubleValue());
		}
		if(speed != null) {
			doc.put("speed_docvalues_double", speed.doubleValue());
		}
		if(pos != null) {
			doc.put("pos_docvalues_double", pos.doubleValue());
		}
		if(slope != null) {
			doc.put("slope_docvalues_double", slope.doubleValue());
		}
		if(color != null) {
			doc.put("color_docvalues_string", color);
		}
		super.indexMapResult(doc);

	}

	public static String varStoredPersonStep(String entityVar) {
		switch(entityVar) {
			case "personId":
				return "personId_docvalues_string";
			case "personType":
				return "personType_docvalues_string";
			case "angle":
				return "angle_docvalues_double";
			case "speed":
				return "speed_docvalues_double";
			case "pos":
				return "pos_docvalues_double";
			case "slope":
				return "slope_docvalues_double";
			case "color":
				return "color_docvalues_string";
			default:
				return MapResult.varStoredMapResult(entityVar);
		}
	}

	public static String varIndexedPersonStep(String entityVar) {
		switch(entityVar) {
			case "personId":
				return "personId_docvalues_string";
			case "personType":
				return "personType_docvalues_string";
			case "angle":
				return "angle_docvalues_double";
			case "speed":
				return "speed_docvalues_double";
			case "pos":
				return "pos_docvalues_double";
			case "slope":
				return "slope_docvalues_double";
			case "color":
				return "color_docvalues_string";
			default:
				return MapResult.varIndexedMapResult(entityVar);
		}
	}

	public static String searchVarPersonStep(String searchVar) {
		switch(searchVar) {
			case "personId_docvalues_string":
				return "personId";
			case "personType_docvalues_string":
				return "personType";
			case "angle_docvalues_double":
				return "angle";
			case "speed_docvalues_double":
				return "speed";
			case "pos_docvalues_double":
				return "pos";
			case "slope_docvalues_double":
				return "slope";
			case "color_docvalues_string":
				return "color";
			default:
				return MapResult.searchVarMapResult(searchVar);
		}
	}

	public static String varSearchPersonStep(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSearchMapResult(entityVar);
		}
	}

	public static String varSuggestedPersonStep(String entityVar) {
		switch(entityVar) {
			default:
				return MapResult.varSuggestedMapResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storePersonStep(doc);
	}
	public void storePersonStep(SolrResponse.Doc doc) {
		PersonStep oPersonStep = (PersonStep)this;

		oPersonStep.setPersonId(Optional.ofNullable(doc.get("personId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPersonType(Optional.ofNullable(doc.get("personType_docvalues_string")).map(v -> v.toString()).orElse(null));
		oPersonStep.setAngle(Optional.ofNullable(doc.get("angle_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setSpeed(Optional.ofNullable(doc.get("speed_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setPos(Optional.ofNullable(doc.get("pos_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setSlope(Optional.ofNullable(doc.get("slope_docvalues_double")).map(v -> v.toString()).orElse(null));
		oPersonStep.setColor(Optional.ofNullable(doc.get("color_docvalues_string")).map(v -> v.toString()).orElse(null));

		super.storeMapResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestPersonStep() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof PersonStep) {
			PersonStep original = (PersonStep)o;
			if(!Objects.equals(personId, original.getPersonId()))
				apiRequest.addVars("personId");
			if(!Objects.equals(personType, original.getPersonType()))
				apiRequest.addVars("personType");
			if(!Objects.equals(angle, original.getAngle()))
				apiRequest.addVars("angle");
			if(!Objects.equals(speed, original.getSpeed()))
				apiRequest.addVars("speed");
			if(!Objects.equals(pos, original.getPos()))
				apiRequest.addVars("pos");
			if(!Objects.equals(slope, original.getSlope()))
				apiRequest.addVars("slope");
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
		sb.append(Optional.ofNullable(personId).map(v -> "personId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(personType).map(v -> "personType: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(angle).map(v -> "angle: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(speed).map(v -> "speed: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pos).map(v -> "pos: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(slope).map(v -> "slope: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(color).map(v -> "color: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "PersonStep";
	public static final String VAR_personId = "personId";
	public static final String VAR_personType = "personType";
	public static final String VAR_angle = "angle";
	public static final String VAR_speed = "speed";
	public static final String VAR_pos = "pos";
	public static final String VAR_slope = "slope";
	public static final String VAR_color = "color";

	public static List<String> varsQForClass() {
		return PersonStep.varsQPersonStep(new ArrayList<String>());
	}
	public static List<String> varsQPersonStep(List<String> vars) {
		MapResult.varsQMapResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return PersonStep.varsFqPersonStep(new ArrayList<String>());
	}
	public static List<String> varsFqPersonStep(List<String> vars) {
		vars.add(VAR_personId);
		vars.add(VAR_personType);
		vars.add(VAR_angle);
		vars.add(VAR_speed);
		vars.add(VAR_pos);
		vars.add(VAR_slope);
		vars.add(VAR_color);
		MapResult.varsFqMapResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return PersonStep.varsRangePersonStep(new ArrayList<String>());
	}
	public static List<String> varsRangePersonStep(List<String> vars) {
		vars.add(VAR_angle);
		vars.add(VAR_speed);
		vars.add(VAR_pos);
		vars.add(VAR_slope);
		MapResult.varsRangeMapResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_personId = "person ID";
	public static final String DISPLAY_NAME_personType = "person type";
	public static final String DISPLAY_NAME_angle = "Angle in degrees";
	public static final String DISPLAY_NAME_speed = "Speed";
	public static final String DISPLAY_NAME_pos = "Position";
	public static final String DISPLAY_NAME_slope = "Slope";
	public static final String DISPLAY_NAME_color = "Color";

	public static String displayNameForClass(String var) {
		return PersonStep.displayNamePersonStep(var);
	}
	public static String displayNamePersonStep(String var) {
		switch(var) {
		case VAR_personId:
			return DISPLAY_NAME_personId;
		case VAR_personType:
			return DISPLAY_NAME_personType;
		case VAR_angle:
			return DISPLAY_NAME_angle;
		case VAR_speed:
			return DISPLAY_NAME_speed;
		case VAR_pos:
			return DISPLAY_NAME_pos;
		case VAR_slope:
			return DISPLAY_NAME_slope;
		case VAR_color:
			return DISPLAY_NAME_color;
		default:
			return MapResult.displayNameMapResult(var);
		}
	}

	public static String descriptionPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.descriptionMapResult(var);
		}
	}

	public static String classSimpleNamePersonStep(String var) {
		switch(var) {
		case VAR_personId:
			return "String";
		case VAR_personType:
			return "String";
		case VAR_angle:
			return "BigDecimal";
		case VAR_speed:
			return "BigDecimal";
		case VAR_pos:
			return "BigDecimal";
		case VAR_slope:
			return "BigDecimal";
		case VAR_color:
			return "String";
			default:
				return MapResult.classSimpleNameMapResult(var);
		}
	}

	public static Integer htmlColumnPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.htmlColumnMapResult(var);
		}
	}

	public static Integer htmlRowPersonStep(String var) {
		switch(var) {
		case VAR_personId:
			return 4;
		case VAR_personType:
			return 4;
		case VAR_angle:
			return 5;
		case VAR_speed:
			return 5;
		case VAR_pos:
			return 5;
		case VAR_slope:
			return 5;
		case VAR_color:
			return 6;
			default:
				return MapResult.htmlRowMapResult(var);
		}
	}

	public static Integer htmlCellPersonStep(String var) {
		switch(var) {
		case VAR_personId:
			return 3;
		case VAR_personType:
			return 4;
		case VAR_angle:
			return 1;
		case VAR_speed:
			return 2;
		case VAR_pos:
			return 3;
		case VAR_slope:
			return 4;
		case VAR_color:
			return 1;
			default:
				return MapResult.htmlCellMapResult(var);
		}
	}

	public static Integer lengthMinPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.lengthMinMapResult(var);
		}
	}

	public static Integer lengthMaxPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.lengthMaxMapResult(var);
		}
	}

	public static Integer maxPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.maxMapResult(var);
		}
	}

	public static Integer minPersonStep(String var) {
		switch(var) {
			default:
				return MapResult.minMapResult(var);
		}
	}
}