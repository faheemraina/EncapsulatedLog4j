package com.log4jwrapper.lib.commons.logger;

import org.apache.logging.log4j.core.config.Configurator;

/**
 * The anchor point for the logging system. The most common usage of this class
 * is to initialize the actual LoggerContextFactory and LogEventFactory based on
 * the external configuration vis xml or proprerty files
 * 
 * @author FaheemRaina@gmail.com
 *
 */
public class CommonLogManager {

	private static boolean initialized = false;

	/**
	 * Takes the path of external property file or xml file.
	 * 
	 * @param configURL
	 */
	public static void initialize(String configURL) {
		Configurator.initialize(null, configURL);
		if(configURL !=null)
			initialize();
	}

	/**
	 * If no config path is specified, it will look for Log4j2.xml or
	 * Log4j2.properties files in class path if still either didnt exist it will
	 * take its default configuration
	 */
	public static void initialize() {
		System.setProperty("log4j2.loggerContextFactory",
				"com.log4jwrapper.lib.commons.logger.factory.CommonLogContextFactory");
		System.setProperty("Log4jLogEventFactory", "com.log4jwrapper.lib.commons.logger.factory.CommonLogEventFactory");
		CommonLogManager.initialized = true;
	}

	/**
	 * Sets flag if initialized in order to prevent reinitialisation
	 * 
	 * @return
	 */
	public static boolean isLoggerInitialized() {
		return initialized;
	}
}