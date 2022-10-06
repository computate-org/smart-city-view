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
import org.computate.smartvillageview.enus.result.map.MapResultPage;
import org.computate.vertx.search.list.SearchList;
import org.computate.smartvillageview.enus.model.traffic.light.TrafficLight;
import java.lang.String;
import java.time.ZoneId;
import java.util.Locale;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.lang.Integer;
import io.vertx.core.json.JsonObject;
import java.math.BigDecimal;
import io.vertx.core.json.JsonArray;
import org.computate.search.response.solr.SolrResponse.Stats;
import org.computate.search.response.solr.SolrResponse.FacetCounts;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TrafficLightGenPageGen into the class TrafficLightGenPage. 
 * </li>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these TrafficLightGenPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the TrafficLightGenPage class and it's generated class TrafficLightGenPageGen&lt;MapResultPage&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage">Find the class TrafficLightGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class TrafficLightGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
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
public abstract class TrafficLightGenPageGen<DEV> extends MapResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(TrafficLightGenPage.class);

	/////////////////////////////
	// searchListTrafficLight_ //
	/////////////////////////////

	/**	 The entity searchListTrafficLight_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<TrafficLight> searchListTrafficLight_;

	/**	<br> The entity searchListTrafficLight_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:searchListTrafficLight_">Find the entity searchListTrafficLight_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListTrafficLight_(Wrap<SearchList<TrafficLight>> w);

	public SearchList<TrafficLight> getSearchListTrafficLight_() {
		return searchListTrafficLight_;
	}

	public void setSearchListTrafficLight_(SearchList<TrafficLight> searchListTrafficLight_) {
		this.searchListTrafficLight_ = searchListTrafficLight_;
	}
	public static SearchList<TrafficLight> staticSetSearchListTrafficLight_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightGenPage searchListTrafficLight_Init() {
		Wrap<SearchList<TrafficLight>> searchListTrafficLight_Wrap = new Wrap<SearchList<TrafficLight>>().var("searchListTrafficLight_");
		if(searchListTrafficLight_ == null) {
			_searchListTrafficLight_(searchListTrafficLight_Wrap);
			setSearchListTrafficLight_(searchListTrafficLight_Wrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	//////////////////
	// pageResponse //
	//////////////////

	/**	 The entity pageResponse
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageResponse;

	/**	<br> The entity pageResponse
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:pageResponse">Find the entity pageResponse in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageResponse(Wrap<String> w);

	public String getPageResponse() {
		return pageResponse;
	}
	public void setPageResponse(String o) {
		this.pageResponse = TrafficLightGenPage.staticSetPageResponse(siteRequest_, o);
	}
	public static String staticSetPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage pageResponseInit() {
		Wrap<String> pageResponseWrap = new Wrap<String>().var("pageResponse");
		if(pageResponse == null) {
			_pageResponse(pageResponseWrap);
			setPageResponse(pageResponseWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageResponse(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrPageResponse(siteRequest_, TrafficLightGenPage.staticSearchPageResponse(siteRequest_, TrafficLightGenPage.staticSetPageResponse(siteRequest_, o)));
	}

	///////////////////
	// defaultZoneId //
	///////////////////

	/**	 The entity defaultZoneId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultZoneId;

	/**	<br> The entity defaultZoneId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultZoneId">Find the entity defaultZoneId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultZoneId(Wrap<String> w);

	public String getDefaultZoneId() {
		return defaultZoneId;
	}
	public void setDefaultZoneId(String o) {
		this.defaultZoneId = TrafficLightGenPage.staticSetDefaultZoneId(siteRequest_, o);
	}
	public static String staticSetDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage defaultZoneIdInit() {
		Wrap<String> defaultZoneIdWrap = new Wrap<String>().var("defaultZoneId");
		if(defaultZoneId == null) {
			_defaultZoneId(defaultZoneIdWrap);
			setDefaultZoneId(defaultZoneIdWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultZoneId(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultZoneId(siteRequest_, TrafficLightGenPage.staticSearchDefaultZoneId(siteRequest_, TrafficLightGenPage.staticSetDefaultZoneId(siteRequest_, o)));
	}

	/////////////////////
	// defaultTimeZone //
	/////////////////////

	/**	 The entity defaultTimeZone
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected ZoneId defaultTimeZone;

	/**	<br> The entity defaultTimeZone
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultTimeZone">Find the entity defaultTimeZone in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultTimeZone(Wrap<ZoneId> w);

	public ZoneId getDefaultTimeZone() {
		return defaultTimeZone;
	}

	public void setDefaultTimeZone(ZoneId defaultTimeZone) {
		this.defaultTimeZone = defaultTimeZone;
	}
	public static ZoneId staticSetDefaultTimeZone(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightGenPage defaultTimeZoneInit() {
		Wrap<ZoneId> defaultTimeZoneWrap = new Wrap<ZoneId>().var("defaultTimeZone");
		if(defaultTimeZone == null) {
			_defaultTimeZone(defaultTimeZoneWrap);
			setDefaultTimeZone(defaultTimeZoneWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	/////////////////////
	// defaultLocaleId //
	/////////////////////

	/**	 The entity defaultLocaleId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultLocaleId;

	/**	<br> The entity defaultLocaleId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultLocaleId">Find the entity defaultLocaleId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultLocaleId(Wrap<String> w);

	public String getDefaultLocaleId() {
		return defaultLocaleId;
	}
	public void setDefaultLocaleId(String o) {
		this.defaultLocaleId = TrafficLightGenPage.staticSetDefaultLocaleId(siteRequest_, o);
	}
	public static String staticSetDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage defaultLocaleIdInit() {
		Wrap<String> defaultLocaleIdWrap = new Wrap<String>().var("defaultLocaleId");
		if(defaultLocaleId == null) {
			_defaultLocaleId(defaultLocaleIdWrap);
			setDefaultLocaleId(defaultLocaleIdWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultLocaleId(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultLocaleId(siteRequest_, TrafficLightGenPage.staticSearchDefaultLocaleId(siteRequest_, TrafficLightGenPage.staticSetDefaultLocaleId(siteRequest_, o)));
	}

	///////////////////
	// defaultLocale //
	///////////////////

	/**	 The entity defaultLocale
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Locale defaultLocale;

	/**	<br> The entity defaultLocale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultLocale">Find the entity defaultLocale in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultLocale(Wrap<Locale> w);

	public Locale getDefaultLocale() {
		return defaultLocale;
	}

	public void setDefaultLocale(Locale defaultLocale) {
		this.defaultLocale = defaultLocale;
	}
	public static Locale staticSetDefaultLocale(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightGenPage defaultLocaleInit() {
		Wrap<Locale> defaultLocaleWrap = new Wrap<Locale>().var("defaultLocale");
		if(defaultLocale == null) {
			_defaultLocale(defaultLocaleWrap);
			setDefaultLocale(defaultLocaleWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	/////////////////////
	// defaultRangeGap //
	/////////////////////

	/**	 The entity defaultRangeGap
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultRangeGap;

	/**	<br> The entity defaultRangeGap
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeGap">Find the entity defaultRangeGap in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeGap(Wrap<String> w);

	public String getDefaultRangeGap() {
		return defaultRangeGap;
	}
	public void setDefaultRangeGap(String o) {
		this.defaultRangeGap = TrafficLightGenPage.staticSetDefaultRangeGap(siteRequest_, o);
	}
	public static String staticSetDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage defaultRangeGapInit() {
		Wrap<String> defaultRangeGapWrap = new Wrap<String>().var("defaultRangeGap");
		if(defaultRangeGap == null) {
			_defaultRangeGap(defaultRangeGapWrap);
			setDefaultRangeGap(defaultRangeGapWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultRangeGap(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultRangeGap(siteRequest_, TrafficLightGenPage.staticSearchDefaultRangeGap(siteRequest_, TrafficLightGenPage.staticSetDefaultRangeGap(siteRequest_, o)));
	}

	/////////////////////
	// defaultRangeEnd //
	/////////////////////

	/**	 The entity defaultRangeEnd
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime defaultRangeEnd;

	/**	<br> The entity defaultRangeEnd
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeEnd">Find the entity defaultRangeEnd in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeEnd(Wrap<ZonedDateTime> w);

	public ZonedDateTime getDefaultRangeEnd() {
		return defaultRangeEnd;
	}

	public void setDefaultRangeEnd(ZonedDateTime defaultRangeEnd) {
		this.defaultRangeEnd = defaultRangeEnd;
	}
	@JsonIgnore
	public void setDefaultRangeEnd(Instant o) {
		this.defaultRangeEnd = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setDefaultRangeEnd(String o) {
		this.defaultRangeEnd = TrafficLightGenPage.staticSetDefaultRangeEnd(siteRequest_, o);
	}
	public static ZonedDateTime staticSetDefaultRangeEnd(SiteRequestEnUS siteRequest_, String o) {
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
	public void setDefaultRangeEnd(Date o) {
		this.defaultRangeEnd = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected TrafficLightGenPage defaultRangeEndInit() {
		Wrap<ZonedDateTime> defaultRangeEndWrap = new Wrap<ZonedDateTime>().var("defaultRangeEnd");
		if(defaultRangeEnd == null) {
			_defaultRangeEnd(defaultRangeEndWrap);
			setDefaultRangeEnd(defaultRangeEndWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static Date staticSearchDefaultRangeEnd(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDefaultRangeEnd(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDefaultRangeEnd(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultRangeEnd(siteRequest_, TrafficLightGenPage.staticSearchDefaultRangeEnd(siteRequest_, TrafficLightGenPage.staticSetDefaultRangeEnd(siteRequest_, o)));
	}

	///////////////////////
	// defaultRangeStart //
	///////////////////////

	/**	 The entity defaultRangeStart
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime defaultRangeStart;

	/**	<br> The entity defaultRangeStart
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeStart">Find the entity defaultRangeStart in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeStart(Wrap<ZonedDateTime> w);

	public ZonedDateTime getDefaultRangeStart() {
		return defaultRangeStart;
	}

	public void setDefaultRangeStart(ZonedDateTime defaultRangeStart) {
		this.defaultRangeStart = defaultRangeStart;
	}
	@JsonIgnore
	public void setDefaultRangeStart(Instant o) {
		this.defaultRangeStart = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setDefaultRangeStart(String o) {
		this.defaultRangeStart = TrafficLightGenPage.staticSetDefaultRangeStart(siteRequest_, o);
	}
	public static ZonedDateTime staticSetDefaultRangeStart(SiteRequestEnUS siteRequest_, String o) {
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
	public void setDefaultRangeStart(Date o) {
		this.defaultRangeStart = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected TrafficLightGenPage defaultRangeStartInit() {
		Wrap<ZonedDateTime> defaultRangeStartWrap = new Wrap<ZonedDateTime>().var("defaultRangeStart");
		if(defaultRangeStart == null) {
			_defaultRangeStart(defaultRangeStartWrap);
			setDefaultRangeStart(defaultRangeStartWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static Date staticSearchDefaultRangeStart(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrDefaultRangeStart(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqDefaultRangeStart(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultRangeStart(siteRequest_, TrafficLightGenPage.staticSearchDefaultRangeStart(siteRequest_, TrafficLightGenPage.staticSetDefaultRangeStart(siteRequest_, o)));
	}

	/////////////////////
	// defaultRangeVar //
	/////////////////////

	/**	 The entity defaultRangeVar
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultRangeVar;

	/**	<br> The entity defaultRangeVar
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultRangeVar">Find the entity defaultRangeVar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultRangeVar(Wrap<String> w);

	public String getDefaultRangeVar() {
		return defaultRangeVar;
	}
	public void setDefaultRangeVar(String o) {
		this.defaultRangeVar = TrafficLightGenPage.staticSetDefaultRangeVar(siteRequest_, o);
	}
	public static String staticSetDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage defaultRangeVarInit() {
		Wrap<String> defaultRangeVarWrap = new Wrap<String>().var("defaultRangeVar");
		if(defaultRangeVar == null) {
			_defaultRangeVar(defaultRangeVarWrap);
			setDefaultRangeVar(defaultRangeVarWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultRangeVar(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultRangeVar(siteRequest_, TrafficLightGenPage.staticSearchDefaultRangeVar(siteRequest_, TrafficLightGenPage.staticSetDefaultRangeVar(siteRequest_, o)));
	}

	//////////////////////
	// defaultFacetSort //
	//////////////////////

	/**	 The entity defaultFacetSort
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String defaultFacetSort;

	/**	<br> The entity defaultFacetSort
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetSort">Find the entity defaultFacetSort in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultFacetSort(Wrap<String> w);

	public String getDefaultFacetSort() {
		return defaultFacetSort;
	}
	public void setDefaultFacetSort(String o) {
		this.defaultFacetSort = TrafficLightGenPage.staticSetDefaultFacetSort(siteRequest_, o);
	}
	public static String staticSetDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage defaultFacetSortInit() {
		Wrap<String> defaultFacetSortWrap = new Wrap<String>().var("defaultFacetSort");
		if(defaultFacetSort == null) {
			_defaultFacetSort(defaultFacetSortWrap);
			setDefaultFacetSort(defaultFacetSortWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetSort(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultFacetSort(siteRequest_, TrafficLightGenPage.staticSearchDefaultFacetSort(siteRequest_, TrafficLightGenPage.staticSetDefaultFacetSort(siteRequest_, o)));
	}

	///////////////////////
	// defaultFacetLimit //
	///////////////////////

	/**	 The entity defaultFacetLimit
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer defaultFacetLimit;

	/**	<br> The entity defaultFacetLimit
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetLimit">Find the entity defaultFacetLimit in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultFacetLimit(Wrap<Integer> w);

	public Integer getDefaultFacetLimit() {
		return defaultFacetLimit;
	}

	public void setDefaultFacetLimit(Integer defaultFacetLimit) {
		this.defaultFacetLimit = defaultFacetLimit;
	}
	@JsonIgnore
	public void setDefaultFacetLimit(String o) {
		this.defaultFacetLimit = TrafficLightGenPage.staticSetDefaultFacetLimit(siteRequest_, o);
	}
	public static Integer staticSetDefaultFacetLimit(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficLightGenPage defaultFacetLimitInit() {
		Wrap<Integer> defaultFacetLimitWrap = new Wrap<Integer>().var("defaultFacetLimit");
		if(defaultFacetLimit == null) {
			_defaultFacetLimit(defaultFacetLimitWrap);
			setDefaultFacetLimit(defaultFacetLimitWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static Integer staticSearchDefaultFacetLimit(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetLimit(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetLimit(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultFacetLimit(siteRequest_, TrafficLightGenPage.staticSearchDefaultFacetLimit(siteRequest_, TrafficLightGenPage.staticSetDefaultFacetLimit(siteRequest_, o)));
	}

	//////////////////////////
	// defaultFacetMinCount //
	//////////////////////////

	/**	 The entity defaultFacetMinCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer defaultFacetMinCount;

	/**	<br> The entity defaultFacetMinCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultFacetMinCount">Find the entity defaultFacetMinCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultFacetMinCount(Wrap<Integer> w);

	public Integer getDefaultFacetMinCount() {
		return defaultFacetMinCount;
	}

	public void setDefaultFacetMinCount(Integer defaultFacetMinCount) {
		this.defaultFacetMinCount = defaultFacetMinCount;
	}
	@JsonIgnore
	public void setDefaultFacetMinCount(String o) {
		this.defaultFacetMinCount = TrafficLightGenPage.staticSetDefaultFacetMinCount(siteRequest_, o);
	}
	public static Integer staticSetDefaultFacetMinCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficLightGenPage defaultFacetMinCountInit() {
		Wrap<Integer> defaultFacetMinCountWrap = new Wrap<Integer>().var("defaultFacetMinCount");
		if(defaultFacetMinCount == null) {
			_defaultFacetMinCount(defaultFacetMinCountWrap);
			setDefaultFacetMinCount(defaultFacetMinCountWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static Integer staticSearchDefaultFacetMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultFacetMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultFacetMinCount(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultFacetMinCount(siteRequest_, TrafficLightGenPage.staticSearchDefaultFacetMinCount(siteRequest_, TrafficLightGenPage.staticSetDefaultFacetMinCount(siteRequest_, o)));
	}

	//////////////////////////
	// defaultPivotMinCount //
	//////////////////////////

	/**	 The entity defaultPivotMinCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer defaultPivotMinCount;

	/**	<br> The entity defaultPivotMinCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:defaultPivotMinCount">Find the entity defaultPivotMinCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _defaultPivotMinCount(Wrap<Integer> w);

	public Integer getDefaultPivotMinCount() {
		return defaultPivotMinCount;
	}

	public void setDefaultPivotMinCount(Integer defaultPivotMinCount) {
		this.defaultPivotMinCount = defaultPivotMinCount;
	}
	@JsonIgnore
	public void setDefaultPivotMinCount(String o) {
		this.defaultPivotMinCount = TrafficLightGenPage.staticSetDefaultPivotMinCount(siteRequest_, o);
	}
	public static Integer staticSetDefaultPivotMinCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficLightGenPage defaultPivotMinCountInit() {
		Wrap<Integer> defaultPivotMinCountWrap = new Wrap<Integer>().var("defaultPivotMinCount");
		if(defaultPivotMinCount == null) {
			_defaultPivotMinCount(defaultPivotMinCountWrap);
			setDefaultPivotMinCount(defaultPivotMinCountWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static Integer staticSearchDefaultPivotMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDefaultPivotMinCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDefaultPivotMinCount(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDefaultPivotMinCount(siteRequest_, TrafficLightGenPage.staticSearchDefaultPivotMinCount(siteRequest_, TrafficLightGenPage.staticSetDefaultPivotMinCount(siteRequest_, o)));
	}

	//////////////////////////
	// DEFAULT_MAP_LOCATION //
	//////////////////////////

	/**	 The entity DEFAULT_MAP_LOCATION
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject DEFAULT_MAP_LOCATION;

	/**	<br> The entity DEFAULT_MAP_LOCATION
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:DEFAULT_MAP_LOCATION">Find the entity DEFAULT_MAP_LOCATION in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _DEFAULT_MAP_LOCATION(Wrap<JsonObject> w);

	public JsonObject getDEFAULT_MAP_LOCATION() {
		return DEFAULT_MAP_LOCATION;
	}

	public void setDEFAULT_MAP_LOCATION(JsonObject DEFAULT_MAP_LOCATION) {
		this.DEFAULT_MAP_LOCATION = DEFAULT_MAP_LOCATION;
	}
	@JsonIgnore
	public void setDEFAULT_MAP_LOCATION(String o) {
		this.DEFAULT_MAP_LOCATION = TrafficLightGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o);
	}
	public static JsonObject staticSetDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected TrafficLightGenPage DEFAULT_MAP_LOCATIONInit() {
		Wrap<JsonObject> DEFAULT_MAP_LOCATIONWrap = new Wrap<JsonObject>().var("DEFAULT_MAP_LOCATION");
		if(DEFAULT_MAP_LOCATION == null) {
			_DEFAULT_MAP_LOCATION(DEFAULT_MAP_LOCATIONWrap);
			setDEFAULT_MAP_LOCATION(DEFAULT_MAP_LOCATIONWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static JsonObject staticSearchDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDEFAULT_MAP_LOCATION(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDEFAULT_MAP_LOCATION(siteRequest_, TrafficLightGenPage.staticSearchDEFAULT_MAP_LOCATION(siteRequest_, TrafficLightGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o)));
	}

	//////////////////////
	// DEFAULT_MAP_ZOOM //
	//////////////////////

	/**	 The entity DEFAULT_MAP_ZOOM
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal DEFAULT_MAP_ZOOM;

	/**	<br> The entity DEFAULT_MAP_ZOOM
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:DEFAULT_MAP_ZOOM">Find the entity DEFAULT_MAP_ZOOM in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _DEFAULT_MAP_ZOOM(Wrap<BigDecimal> w);

	public BigDecimal getDEFAULT_MAP_ZOOM() {
		return DEFAULT_MAP_ZOOM;
	}

	public void setDEFAULT_MAP_ZOOM(BigDecimal DEFAULT_MAP_ZOOM) {
		this.DEFAULT_MAP_ZOOM = DEFAULT_MAP_ZOOM;
	}
	@JsonIgnore
	public void setDEFAULT_MAP_ZOOM(String o) {
		this.DEFAULT_MAP_ZOOM = TrafficLightGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o);
	}
	public static BigDecimal staticSetDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDEFAULT_MAP_ZOOM(Double o) {
			this.DEFAULT_MAP_ZOOM = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDEFAULT_MAP_ZOOM(Integer o) {
			this.DEFAULT_MAP_ZOOM = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected TrafficLightGenPage DEFAULT_MAP_ZOOMInit() {
		Wrap<BigDecimal> DEFAULT_MAP_ZOOMWrap = new Wrap<BigDecimal>().var("DEFAULT_MAP_ZOOM");
		if(DEFAULT_MAP_ZOOM == null) {
			_DEFAULT_MAP_ZOOM(DEFAULT_MAP_ZOOMWrap);
			setDEFAULT_MAP_ZOOM(DEFAULT_MAP_ZOOMWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static Double staticSearchDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDEFAULT_MAP_ZOOM(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrDEFAULT_MAP_ZOOM(siteRequest_, TrafficLightGenPage.staticSearchDEFAULT_MAP_ZOOM(siteRequest_, TrafficLightGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o)));
	}

	//////////////////////
	// listTrafficLight //
	//////////////////////

	/**	 The entity listTrafficLight
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listTrafficLight = new JsonArray();

	/**	<br> The entity listTrafficLight
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:listTrafficLight">Find the entity listTrafficLight in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listTrafficLight(JsonArray l);

	public JsonArray getListTrafficLight() {
		return listTrafficLight;
	}

	public void setListTrafficLight(JsonArray listTrafficLight) {
		this.listTrafficLight = listTrafficLight;
	}
	public static JsonArray staticSetListTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightGenPage listTrafficLightInit() {
		_listTrafficLight(listTrafficLight);
		return (TrafficLightGenPage)this;
	}

	///////////
	// stats //
	///////////

	/**	 The entity stats
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Stats stats;

	/**	<br> The entity stats
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:stats">Find the entity stats in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stats(Wrap<Stats> w);

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}
	public static Stats staticSetStats(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightGenPage statsInit() {
		Wrap<Stats> statsWrap = new Wrap<Stats>().var("stats");
		if(stats == null) {
			_stats(statsWrap);
			setStats(statsWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	/////////////////
	// facetCounts //
	/////////////////

	/**	 The entity facetCounts
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected FacetCounts facetCounts;

	/**	<br> The entity facetCounts
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:facetCounts">Find the entity facetCounts in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetCounts(Wrap<FacetCounts> w);

	public FacetCounts getFacetCounts() {
		return facetCounts;
	}

	public void setFacetCounts(FacetCounts facetCounts) {
		this.facetCounts = facetCounts;
	}
	public static FacetCounts staticSetFacetCounts(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightGenPage facetCountsInit() {
		Wrap<FacetCounts> facetCountsWrap = new Wrap<FacetCounts>().var("facetCounts");
		if(facetCounts == null) {
			_facetCounts(facetCountsWrap);
			setFacetCounts(facetCountsWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	///////////////////////
	// trafficLightCount //
	///////////////////////

	/**	 The entity trafficLightCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer trafficLightCount;

	/**	<br> The entity trafficLightCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:trafficLightCount">Find the entity trafficLightCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficLightCount(Wrap<Integer> w);

	public Integer getTrafficLightCount() {
		return trafficLightCount;
	}

	public void setTrafficLightCount(Integer trafficLightCount) {
		this.trafficLightCount = trafficLightCount;
	}
	@JsonIgnore
	public void setTrafficLightCount(String o) {
		this.trafficLightCount = TrafficLightGenPage.staticSetTrafficLightCount(siteRequest_, o);
	}
	public static Integer staticSetTrafficLightCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected TrafficLightGenPage trafficLightCountInit() {
		Wrap<Integer> trafficLightCountWrap = new Wrap<Integer>().var("trafficLightCount");
		if(trafficLightCount == null) {
			_trafficLightCount(trafficLightCountWrap);
			setTrafficLightCount(trafficLightCountWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static Integer staticSearchTrafficLightCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrTrafficLightCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTrafficLightCount(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrTrafficLightCount(siteRequest_, TrafficLightGenPage.staticSearchTrafficLightCount(siteRequest_, TrafficLightGenPage.staticSetTrafficLightCount(siteRequest_, o)));
	}

	///////////////////
	// trafficLight_ //
	///////////////////

	/**	 The entity trafficLight_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected TrafficLight trafficLight_;

	/**	<br> The entity trafficLight_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:trafficLight_">Find the entity trafficLight_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _trafficLight_(Wrap<TrafficLight> w);

	public TrafficLight getTrafficLight_() {
		return trafficLight_;
	}

	public void setTrafficLight_(TrafficLight trafficLight_) {
		this.trafficLight_ = trafficLight_;
	}
	public static TrafficLight staticSetTrafficLight_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected TrafficLightGenPage trafficLight_Init() {
		Wrap<TrafficLight> trafficLight_Wrap = new Wrap<TrafficLight>().var("trafficLight_");
		if(trafficLight_ == null) {
			_trafficLight_(trafficLight_Wrap);
			setTrafficLight_(trafficLight_Wrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	////////
	// id //
	////////

	/**	 The entity id
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String id;

	/**	<br> The entity id
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = TrafficLightGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrId(siteRequest_, TrafficLightGenPage.staticSearchId(siteRequest_, TrafficLightGenPage.staticSetId(siteRequest_, o)));
	}

	/////////////////////////
	// pageUriTrafficLight //
	/////////////////////////

	/**	 The entity pageUriTrafficLight
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriTrafficLight;

	/**	<br> The entity pageUriTrafficLight
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.smartvillageview.enus.model.traffic.light.TrafficLightGenPage&fq=entiteVar_enUS_indexed_string:pageUriTrafficLight">Find the entity pageUriTrafficLight in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriTrafficLight(Wrap<String> c);

	public String getPageUriTrafficLight() {
		return pageUriTrafficLight;
	}
	public void setPageUriTrafficLight(String o) {
		this.pageUriTrafficLight = TrafficLightGenPage.staticSetPageUriTrafficLight(siteRequest_, o);
	}
	public static String staticSetPageUriTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected TrafficLightGenPage pageUriTrafficLightInit() {
		Wrap<String> pageUriTrafficLightWrap = new Wrap<String>().var("pageUriTrafficLight");
		if(pageUriTrafficLight == null) {
			_pageUriTrafficLight(pageUriTrafficLightWrap);
			setPageUriTrafficLight(pageUriTrafficLightWrap.o);
		}
		return (TrafficLightGenPage)this;
	}

	public static String staticSearchPageUriTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriTrafficLight(SiteRequestEnUS siteRequest_, String o) {
		return TrafficLightGenPage.staticSearchStrPageUriTrafficLight(siteRequest_, TrafficLightGenPage.staticSearchPageUriTrafficLight(siteRequest_, TrafficLightGenPage.staticSetPageUriTrafficLight(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepTrafficLightGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepTrafficLightGenPage();
	}

	public Future<Void> promiseDeepTrafficLightGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseTrafficLightGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepMapResultPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseTrafficLightGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListTrafficLight_Init();
				pageResponseInit();
				defaultZoneIdInit();
				defaultTimeZoneInit();
				defaultLocaleIdInit();
				defaultLocaleInit();
				defaultRangeGapInit();
				defaultRangeEndInit();
				defaultRangeStartInit();
				defaultRangeVarInit();
				defaultFacetSortInit();
				defaultFacetLimitInit();
				defaultFacetMinCountInit();
				defaultPivotMinCountInit();
				DEFAULT_MAP_LOCATIONInit();
				DEFAULT_MAP_ZOOMInit();
				listTrafficLightInit();
				statsInit();
				facetCountsInit();
				trafficLightCountInit();
				trafficLight_Init();
				idInit();
				pageUriTrafficLightInit();
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
		return promiseDeepTrafficLightGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestTrafficLightGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestMapResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestTrafficLightGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainTrafficLightGenPage(v);
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
	public Object obtainTrafficLightGenPage(String var) {
		TrafficLightGenPage oTrafficLightGenPage = (TrafficLightGenPage)this;
		switch(var) {
			case "searchListTrafficLight_":
				return oTrafficLightGenPage.searchListTrafficLight_;
			case "pageResponse":
				return oTrafficLightGenPage.pageResponse;
			case "defaultZoneId":
				return oTrafficLightGenPage.defaultZoneId;
			case "defaultTimeZone":
				return oTrafficLightGenPage.defaultTimeZone;
			case "defaultLocaleId":
				return oTrafficLightGenPage.defaultLocaleId;
			case "defaultLocale":
				return oTrafficLightGenPage.defaultLocale;
			case "defaultRangeGap":
				return oTrafficLightGenPage.defaultRangeGap;
			case "defaultRangeEnd":
				return oTrafficLightGenPage.defaultRangeEnd;
			case "defaultRangeStart":
				return oTrafficLightGenPage.defaultRangeStart;
			case "defaultRangeVar":
				return oTrafficLightGenPage.defaultRangeVar;
			case "defaultFacetSort":
				return oTrafficLightGenPage.defaultFacetSort;
			case "defaultFacetLimit":
				return oTrafficLightGenPage.defaultFacetLimit;
			case "defaultFacetMinCount":
				return oTrafficLightGenPage.defaultFacetMinCount;
			case "defaultPivotMinCount":
				return oTrafficLightGenPage.defaultPivotMinCount;
			case "DEFAULT_MAP_LOCATION":
				return oTrafficLightGenPage.DEFAULT_MAP_LOCATION;
			case "DEFAULT_MAP_ZOOM":
				return oTrafficLightGenPage.DEFAULT_MAP_ZOOM;
			case "listTrafficLight":
				return oTrafficLightGenPage.listTrafficLight;
			case "stats":
				return oTrafficLightGenPage.stats;
			case "facetCounts":
				return oTrafficLightGenPage.facetCounts;
			case "trafficLightCount":
				return oTrafficLightGenPage.trafficLightCount;
			case "trafficLight_":
				return oTrafficLightGenPage.trafficLight_;
			case "id":
				return oTrafficLightGenPage.id;
			case "pageUriTrafficLight":
				return oTrafficLightGenPage.pageUriTrafficLight;
			default:
				return super.obtainMapResultPage(var);
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
				o = relateTrafficLightGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateTrafficLightGenPage(String var, Object val) {
		TrafficLightGenPage oTrafficLightGenPage = (TrafficLightGenPage)this;
		switch(var) {
			default:
				return super.relateMapResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return TrafficLightGenPage.staticSetPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return TrafficLightGenPage.staticSetDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return TrafficLightGenPage.staticSetDefaultLocaleId(siteRequest_, o);
		case "defaultRangeGap":
			return TrafficLightGenPage.staticSetDefaultRangeGap(siteRequest_, o);
		case "defaultRangeEnd":
			return TrafficLightGenPage.staticSetDefaultRangeEnd(siteRequest_, o);
		case "defaultRangeStart":
			return TrafficLightGenPage.staticSetDefaultRangeStart(siteRequest_, o);
		case "defaultRangeVar":
			return TrafficLightGenPage.staticSetDefaultRangeVar(siteRequest_, o);
		case "defaultFacetSort":
			return TrafficLightGenPage.staticSetDefaultFacetSort(siteRequest_, o);
		case "defaultFacetLimit":
			return TrafficLightGenPage.staticSetDefaultFacetLimit(siteRequest_, o);
		case "defaultFacetMinCount":
			return TrafficLightGenPage.staticSetDefaultFacetMinCount(siteRequest_, o);
		case "defaultPivotMinCount":
			return TrafficLightGenPage.staticSetDefaultPivotMinCount(siteRequest_, o);
		case "DEFAULT_MAP_LOCATION":
			return TrafficLightGenPage.staticSetDEFAULT_MAP_LOCATION(siteRequest_, o);
		case "DEFAULT_MAP_ZOOM":
			return TrafficLightGenPage.staticSetDEFAULT_MAP_ZOOM(siteRequest_, o);
		case "trafficLightCount":
			return TrafficLightGenPage.staticSetTrafficLightCount(siteRequest_, o);
		case "id":
			return TrafficLightGenPage.staticSetId(siteRequest_, o);
		case "pageUriTrafficLight":
			return TrafficLightGenPage.staticSetPageUriTrafficLight(siteRequest_, o);
			default:
				return MapResultPage.staticSetMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return TrafficLightGenPage.staticSearchPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return TrafficLightGenPage.staticSearchDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return TrafficLightGenPage.staticSearchDefaultLocaleId(siteRequest_, (String)o);
		case "defaultRangeGap":
			return TrafficLightGenPage.staticSearchDefaultRangeGap(siteRequest_, (String)o);
		case "defaultRangeEnd":
			return TrafficLightGenPage.staticSearchDefaultRangeEnd(siteRequest_, (ZonedDateTime)o);
		case "defaultRangeStart":
			return TrafficLightGenPage.staticSearchDefaultRangeStart(siteRequest_, (ZonedDateTime)o);
		case "defaultRangeVar":
			return TrafficLightGenPage.staticSearchDefaultRangeVar(siteRequest_, (String)o);
		case "defaultFacetSort":
			return TrafficLightGenPage.staticSearchDefaultFacetSort(siteRequest_, (String)o);
		case "defaultFacetLimit":
			return TrafficLightGenPage.staticSearchDefaultFacetLimit(siteRequest_, (Integer)o);
		case "defaultFacetMinCount":
			return TrafficLightGenPage.staticSearchDefaultFacetMinCount(siteRequest_, (Integer)o);
		case "defaultPivotMinCount":
			return TrafficLightGenPage.staticSearchDefaultPivotMinCount(siteRequest_, (Integer)o);
		case "DEFAULT_MAP_LOCATION":
			return TrafficLightGenPage.staticSearchDEFAULT_MAP_LOCATION(siteRequest_, (JsonObject)o);
		case "DEFAULT_MAP_ZOOM":
			return TrafficLightGenPage.staticSearchDEFAULT_MAP_ZOOM(siteRequest_, (BigDecimal)o);
		case "trafficLightCount":
			return TrafficLightGenPage.staticSearchTrafficLightCount(siteRequest_, (Integer)o);
		case "id":
			return TrafficLightGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriTrafficLight":
			return TrafficLightGenPage.staticSearchPageUriTrafficLight(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pageResponse":
			return TrafficLightGenPage.staticSearchStrPageResponse(siteRequest_, (String)o);
		case "defaultZoneId":
			return TrafficLightGenPage.staticSearchStrDefaultZoneId(siteRequest_, (String)o);
		case "defaultLocaleId":
			return TrafficLightGenPage.staticSearchStrDefaultLocaleId(siteRequest_, (String)o);
		case "defaultRangeGap":
			return TrafficLightGenPage.staticSearchStrDefaultRangeGap(siteRequest_, (String)o);
		case "defaultRangeEnd":
			return TrafficLightGenPage.staticSearchStrDefaultRangeEnd(siteRequest_, (Date)o);
		case "defaultRangeStart":
			return TrafficLightGenPage.staticSearchStrDefaultRangeStart(siteRequest_, (Date)o);
		case "defaultRangeVar":
			return TrafficLightGenPage.staticSearchStrDefaultRangeVar(siteRequest_, (String)o);
		case "defaultFacetSort":
			return TrafficLightGenPage.staticSearchStrDefaultFacetSort(siteRequest_, (String)o);
		case "defaultFacetLimit":
			return TrafficLightGenPage.staticSearchStrDefaultFacetLimit(siteRequest_, (Integer)o);
		case "defaultFacetMinCount":
			return TrafficLightGenPage.staticSearchStrDefaultFacetMinCount(siteRequest_, (Integer)o);
		case "defaultPivotMinCount":
			return TrafficLightGenPage.staticSearchStrDefaultPivotMinCount(siteRequest_, (Integer)o);
		case "DEFAULT_MAP_LOCATION":
			return TrafficLightGenPage.staticSearchStrDEFAULT_MAP_LOCATION(siteRequest_, (JsonObject)o);
		case "DEFAULT_MAP_ZOOM":
			return TrafficLightGenPage.staticSearchStrDEFAULT_MAP_ZOOM(siteRequest_, (Double)o);
		case "trafficLightCount":
			return TrafficLightGenPage.staticSearchStrTrafficLightCount(siteRequest_, (Integer)o);
		case "id":
			return TrafficLightGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriTrafficLight":
			return TrafficLightGenPage.staticSearchStrPageUriTrafficLight(siteRequest_, (String)o);
			default:
				return MapResultPage.staticSearchStrMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqTrafficLightGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqTrafficLightGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pageResponse":
			return TrafficLightGenPage.staticSearchFqPageResponse(siteRequest_, o);
		case "defaultZoneId":
			return TrafficLightGenPage.staticSearchFqDefaultZoneId(siteRequest_, o);
		case "defaultLocaleId":
			return TrafficLightGenPage.staticSearchFqDefaultLocaleId(siteRequest_, o);
		case "defaultRangeGap":
			return TrafficLightGenPage.staticSearchFqDefaultRangeGap(siteRequest_, o);
		case "defaultRangeEnd":
			return TrafficLightGenPage.staticSearchFqDefaultRangeEnd(siteRequest_, o);
		case "defaultRangeStart":
			return TrafficLightGenPage.staticSearchFqDefaultRangeStart(siteRequest_, o);
		case "defaultRangeVar":
			return TrafficLightGenPage.staticSearchFqDefaultRangeVar(siteRequest_, o);
		case "defaultFacetSort":
			return TrafficLightGenPage.staticSearchFqDefaultFacetSort(siteRequest_, o);
		case "defaultFacetLimit":
			return TrafficLightGenPage.staticSearchFqDefaultFacetLimit(siteRequest_, o);
		case "defaultFacetMinCount":
			return TrafficLightGenPage.staticSearchFqDefaultFacetMinCount(siteRequest_, o);
		case "defaultPivotMinCount":
			return TrafficLightGenPage.staticSearchFqDefaultPivotMinCount(siteRequest_, o);
		case "DEFAULT_MAP_LOCATION":
			return TrafficLightGenPage.staticSearchFqDEFAULT_MAP_LOCATION(siteRequest_, o);
		case "DEFAULT_MAP_ZOOM":
			return TrafficLightGenPage.staticSearchFqDEFAULT_MAP_ZOOM(siteRequest_, o);
		case "trafficLightCount":
			return TrafficLightGenPage.staticSearchFqTrafficLightCount(siteRequest_, o);
		case "id":
			return TrafficLightGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriTrafficLight":
			return TrafficLightGenPage.staticSearchFqPageUriTrafficLight(siteRequest_, o);
			default:
				return MapResultPage.staticSearchFqMapResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "TrafficLightGenPage";
	public static final String VAR_searchListTrafficLight_ = "searchListTrafficLight_";
	public static final String VAR_pageResponse = "pageResponse";
	public static final String VAR_defaultZoneId = "defaultZoneId";
	public static final String VAR_defaultTimeZone = "defaultTimeZone";
	public static final String VAR_defaultLocaleId = "defaultLocaleId";
	public static final String VAR_defaultLocale = "defaultLocale";
	public static final String VAR_defaultRangeGap = "defaultRangeGap";
	public static final String VAR_defaultRangeEnd = "defaultRangeEnd";
	public static final String VAR_defaultRangeStart = "defaultRangeStart";
	public static final String VAR_defaultRangeVar = "defaultRangeVar";
	public static final String VAR_defaultFacetSort = "defaultFacetSort";
	public static final String VAR_defaultFacetLimit = "defaultFacetLimit";
	public static final String VAR_defaultFacetMinCount = "defaultFacetMinCount";
	public static final String VAR_defaultPivotMinCount = "defaultPivotMinCount";
	public static final String VAR_DEFAULT_MAP_LOCATION = "DEFAULT_MAP_LOCATION";
	public static final String VAR_DEFAULT_MAP_ZOOM = "DEFAULT_MAP_ZOOM";
	public static final String VAR_listTrafficLight = "listTrafficLight";
	public static final String VAR_stats = "stats";
	public static final String VAR_facetCounts = "facetCounts";
	public static final String VAR_trafficLightCount = "trafficLightCount";
	public static final String VAR_trafficLight_ = "trafficLight_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriTrafficLight = "pageUriTrafficLight";

	public static final String DISPLAY_NAME_searchListTrafficLight_ = "";
	public static final String DISPLAY_NAME_pageResponse = "";
	public static final String DISPLAY_NAME_defaultZoneId = "";
	public static final String DISPLAY_NAME_defaultTimeZone = "";
	public static final String DISPLAY_NAME_defaultLocaleId = "";
	public static final String DISPLAY_NAME_defaultLocale = "";
	public static final String DISPLAY_NAME_defaultRangeGap = "";
	public static final String DISPLAY_NAME_defaultRangeEnd = "";
	public static final String DISPLAY_NAME_defaultRangeStart = "";
	public static final String DISPLAY_NAME_defaultRangeVar = "";
	public static final String DISPLAY_NAME_defaultFacetSort = "";
	public static final String DISPLAY_NAME_defaultFacetLimit = "";
	public static final String DISPLAY_NAME_defaultFacetMinCount = "";
	public static final String DISPLAY_NAME_defaultPivotMinCount = "";
	public static final String DISPLAY_NAME_DEFAULT_MAP_LOCATION = "";
	public static final String DISPLAY_NAME_DEFAULT_MAP_ZOOM = "";
	public static final String DISPLAY_NAME_listTrafficLight = "";
	public static final String DISPLAY_NAME_stats = "";
	public static final String DISPLAY_NAME_facetCounts = "";
	public static final String DISPLAY_NAME_trafficLightCount = "";
	public static final String DISPLAY_NAME_trafficLight_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriTrafficLight = "";

	public static String displayNameForClass(String var) {
		return TrafficLightGenPage.displayNameTrafficLightGenPage(var);
	}
	public static String displayNameTrafficLightGenPage(String var) {
		switch(var) {
		case VAR_searchListTrafficLight_:
			return DISPLAY_NAME_searchListTrafficLight_;
		case VAR_pageResponse:
			return DISPLAY_NAME_pageResponse;
		case VAR_defaultZoneId:
			return DISPLAY_NAME_defaultZoneId;
		case VAR_defaultTimeZone:
			return DISPLAY_NAME_defaultTimeZone;
		case VAR_defaultLocaleId:
			return DISPLAY_NAME_defaultLocaleId;
		case VAR_defaultLocale:
			return DISPLAY_NAME_defaultLocale;
		case VAR_defaultRangeGap:
			return DISPLAY_NAME_defaultRangeGap;
		case VAR_defaultRangeEnd:
			return DISPLAY_NAME_defaultRangeEnd;
		case VAR_defaultRangeStart:
			return DISPLAY_NAME_defaultRangeStart;
		case VAR_defaultRangeVar:
			return DISPLAY_NAME_defaultRangeVar;
		case VAR_defaultFacetSort:
			return DISPLAY_NAME_defaultFacetSort;
		case VAR_defaultFacetLimit:
			return DISPLAY_NAME_defaultFacetLimit;
		case VAR_defaultFacetMinCount:
			return DISPLAY_NAME_defaultFacetMinCount;
		case VAR_defaultPivotMinCount:
			return DISPLAY_NAME_defaultPivotMinCount;
		case VAR_DEFAULT_MAP_LOCATION:
			return DISPLAY_NAME_DEFAULT_MAP_LOCATION;
		case VAR_DEFAULT_MAP_ZOOM:
			return DISPLAY_NAME_DEFAULT_MAP_ZOOM;
		case VAR_listTrafficLight:
			return DISPLAY_NAME_listTrafficLight;
		case VAR_stats:
			return DISPLAY_NAME_stats;
		case VAR_facetCounts:
			return DISPLAY_NAME_facetCounts;
		case VAR_trafficLightCount:
			return DISPLAY_NAME_trafficLightCount;
		case VAR_trafficLight_:
			return DISPLAY_NAME_trafficLight_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriTrafficLight:
			return DISPLAY_NAME_pageUriTrafficLight;
		default:
			return MapResultPage.displayNameMapResultPage(var);
		}
	}
}
