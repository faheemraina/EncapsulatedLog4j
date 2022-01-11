package com.log4jwrapper.lib.commons.logger;

import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.impl.Log4jLogEvent;
import org.apache.logging.log4j.message.Message;

/**
 * Provides contextual information about a logged message. Besides containing a
 * Message, a LogEvent has a corresponding Level that the message was logged at.
 * If a Marker was used, then it is included here.
 * 
 * @see <a href=
 *      "https://logging.apache.org/log4j/2.x/log4j-core/apidocs/org/apache/logging/log4j/core/impl/Log4jLogEvent.html">Log4jLogEvent</a>
 * 
 * @author FaheemRaina@gmail.com
 *
 */
public class CommonLoggerLogEvent extends Log4jLogEvent {

	private static final long serialVersionUID = 1L;
	// Add the other parameters you want to log as part of log event here here
	private String customMessage;

	/**
	 * The Constructor
	 * 
	 * @param loggerName
	 * @param marker
	 * @param fqcn
	 * @param level
	 * @param data
	 * @param properties
	 * @param t
	 */
	public CommonLoggerLogEvent(String loggerName, Marker marker, String fqcn, Level level, Message data,
			List<Property> properties, Throwable t) {
		super(loggerName, marker, fqcn, level, data, properties, t);
		initializeInfo(data);
	}

	/**
	 * Cast any message type to String format
	 * 
	 * @param data
	 */
	private void initializeInfo(Object data) {
		try {
			this.customMessage = data.toString();
		} catch (ClassCastException ex) {
			ex.printStackTrace();
		}

	}

}
