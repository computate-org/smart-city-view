package org.computate.smartvillageview.enus.config;

import org.computate.vertx.config.ComputateConfigKeys;

/**
 * Keyword: classSimpleNameConfigKeys
 */
public class ConfigKeys extends ComputateConfigKeys {

	/**
	 * 
	 **/
	public static final String SUMO_EXECUTABLE_PATH = "SUMO_EXECUTABLE_PATH";

	/**
	 * 
	 **/
	public static final String PYTHON_EXECUTABLE_PATH = "PYTHON_EXECUTABLE_PATH";

	/**
	 * 
	 **/
	public static final String DYNAMIC_PAGE_PATH = "DYNAMIC_PAGE_PATH";

	/**
	 * 
	 **/
	public static final String YGGIO_HOST_NAME = "YGGIO_HOST_NAME";

	/**
	 * 
	 **/
	public static final String YGGIO_PORT = "YGGIO_PORT";

	/**
	 * 
	 **/
	public static final String YGGIO_SSL = "YGGIO_SSL";

	/**
	 * 
	 **/
	public static final String YGGIO_API_RELATIVE_URI_IotNode = "YGGIO_API_RELATIVE_URI_IotNode";

	/**
	 * 
	 **/
	public static final String YGGIO_AUTH_LOCAL_URI = "YGGIO_AUTH_LOCAL_URI";

	/**
	 * 
	 **/
	public static final String YGGIO_USERNAME = "YGGIO_USERNAME";

	/**
	 * 
	 **/
	public static final String YGGIO_PASSWORD = "YGGIO_PASSWORD";

	/**
	 * The name Github organization for the site. 
	 **/
	public static final String GITHUB_ORG = "GITHUB_ORG";

	/**
	 * The project powered by URL. 
	 **/
	public static final String SITE_POWERED_BY_URL = "SITE_POWERED_BY_URL";

	/**
	 * The project powered by organization name. 
	 **/
	public static final String SITE_POWERED_BY_NAME = "SITE_POWERED_BY_NAME";

	/**
	 * The project powered by image relative URI. 
	 **/
	public static final String SITE_POWERED_BY_IMAGE_URI = "SITE_POWERED_BY_IMAGE_URI";

	/**
	 * The Floating Car Data directory. 
	 **/
	public static final String FCD_SYNC_PATH = "FCD_SYNC_PATH";

	/**
	 * The max number of Floating Car Data records to load in a batch. 
	 **/
	public static final String FCD_MAX_RECORD_SIZE = "FCD_MAX_RECORD_SIZE";

	/**
	 * The max read buffer size to load in a batch. 
	 **/
	public static final String READ_BUFFER_SIZE = "READ_BUFFER_SIZE";

	/**
	 * Periodically check the sync operations to check that they are still progressing. 
	 * If not, fetch more data. 
	 **/
	public static final String API_CHECK_TIMER_MILLIS = "API_CHECK_TIMER_MILLIS";

	/**
	 * Map default location. 
	 **/
	public static final String DEFAULT_MAP_LOCATION = "DEFAULT_MAP_LOCATION";

	/**
	 * Map default zoom. 
	 **/
	public static final String DEFAULT_MAP_ZOOM = "DEFAULT_MAP_ZOOM";

	/**
	 * max number of times to retry
	 */
	public static final String ZOOKEEPER_MAX_RETRIES = "ZOOKEEPER_MAX_RETRIES";

	/**
	 * initial amount of time to wait between retries
	 */
	public static final String ZOOKEEPER_BASE_SLEEP_TIME_MILLIS = "ZOOKEEPER_BASE_SLEEP_TIME_MILLIS";

	/**
	 * max time in ms to sleep on each retry
	 */
	public static final String ZOOKEEPER_MAX_SLEEP_MILLIS = "ZOOKEEPER_MAX_SLEEP_MILLIS";

	/**
	 * Zookeeper connection timeout
	 */
	public static final String ZOOKEEPER_CONNECTION_TIMEOUT_MILLIS = "ZOOKEEPER_CONNECTION_TIMEOUT_MILLIS";

	/**
	 * Zookeeper session timeout
	 */
	public static final String ZOOKEEPER_SESSION_TIMEOUT_MILLIS = "ZOOKEEPER_SESSION_TIMEOUT_MILLIS";

	/**
	 * API counter resume TimeStep
	 */
	public static final String API_COUNTER_RESUME_TimeStep = "API_COUNTER_RESUME_TimeStep";

	/**
	 * API counter fetch TimeStep
	 */
	public static final String API_COUNTER_FETCH_TimeStep = "API_COUNTER_FETCH_TimeStep";

	/**
	 * API counter resume VehicleStep
	 */
	public static final String API_COUNTER_RESUME_VehicleStep = "API_COUNTER_RESUME_VehicleStep";

	/**
	 * API counter fetch VehicleStep
	 */
	public static final String API_COUNTER_FETCH_VehicleStep = "API_COUNTER_FETCH_VehicleStep";
}
