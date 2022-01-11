package com.log4jwrapper.lib.commons.logger.context;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.message.MessageFactory;

import com.log4jwrapper.lib.commons.logger.CommonLogger;

/**
 * /** The LoggerContext is the anchor for the logging system. It maintains a
 * list of all the loggers requested by applications and a reference to the
 * Configuration. The Configuration will contain the configured loggers,
 * appenders, filters, etc and will be atomically updated whenever a reconfigure
 * occurs.
 *
 * @author FaheemRaina@gmail.com
 *
 */
public class CommonLoggerContext extends LoggerContext {

	public CommonLoggerContext(String name) {
		super(name);
	}

	@Override
	protected Logger newInstance(final LoggerContext ctx, final String name, final MessageFactory messageFactory) {
		return new CommonLogger(ctx, name, messageFactory);
	}

}
