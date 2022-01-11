package com.log4jwrapper.lib.commons.logger.context;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.selector.ContextSelector;

/**
 * This class is used to locate a LoggerContext.
 * 
 * @author fraina
 */
public class CommonContextSelector implements ContextSelector {

	private final LoggerContext CONTEXT = new CommonLoggerContext("<some name>");

	public LoggerContext getContext(String fqcn, ClassLoader loader, boolean currentContext) {
		return CONTEXT;
	}

	public LoggerContext getContext(String fqcn, ClassLoader loader, boolean currentContext, URI configLocation) {
		return CONTEXT;
	}

	public List<LoggerContext> getLoggerContexts() {
		return Arrays.asList(CONTEXT);
	}

	public void removeContext(LoggerContext context) { // TODO Auto-generated method stub

	}

}