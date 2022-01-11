package com.log4jwrapper.lib.commons.logger;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.tools.Generate.CustomLogger;
import org.apache.logging.log4j.message.MessageFactory;

/**
 * Besides Wrapping the Log4j2 Logger, The core implementation of the
 * com.log4jwrapper.lib.commons.logger.ILogger interface. This Class provides an
 * implementation of the basic Logger methods, this class also provides some
 * convenience methods for Log4j wrapping compatibility
 * 
 * @author FaheemFayaz.Raina@gartner.com
 *
 */
public class CommonLogger extends Logger implements ILogger {
	
	/**
	 * FullyQualifiedClassName FQCN
	 */
    private static final String FQCN = CustomLogger.class.getName();
    
    /**
     * The Constructor
     * @param context
     * @param name
     * @param messageFactory
     */
    public CommonLogger(LoggerContext context, String name, MessageFactory messageFactory) {
        super(context, name, messageFactory);
    }
   
    public static ILogger getLogger(Class<?> aClass) {
        return getLogger(aClass.getName());
    }

    /**
     * Returns a Logger with the specified name.
     * Parameters: name The logger name. If null the name of the calling class will be used.
     * Returns: The Logger. Throws:	UnsupportedOperationException - if name is null and the calling class cannot be determined.
     * @param name
     * @return
     */
    public static ILogger getLogger(String name) {
    	if(!CommonLogManager.isLoggerInitialized())
    		CommonLogManager.initialize();
         return (CommonLogger)org.apache.logging.log4j.LogManager.getLogger(name);                
    }
   
    public void debug(Object logMessage, Throwable arg1) {
     logIfEnabled(FQCN, Level.DEBUG, null, logMessage, arg1);
    }

    public void debug(Object logMessage) {
     logIfEnabled(FQCN, Level.DEBUG, null, logMessage, null);
    }

    public void error(Object logMessage, Throwable arg1) {
        logIfEnabled(FQCN, Level.ERROR, null, logMessage, arg1);
    }

    public void error(Object logMessage) {
     logIfEnabled(FQCN, Level.ERROR, null, logMessage, null);
    }
    
    public void fatal(Object logMessage, Throwable arg1) {
        logIfEnabled(FQCN, Level.FATAL, null, logMessage, arg1);
    }

    public void fatal(Object logMessage) {
     logIfEnabled(FQCN, Level.FATAL, null, logMessage, null);
    }

    public void info(Object logMessage, Throwable arg1) {
     logIfEnabled(FQCN, Level.INFO, null, logMessage, null);
    }

    public void info(Object logMessage) {
     logIfEnabled(FQCN, Level.INFO, null, logMessage, null);
    }

    public void warn(Object logMessage, Throwable arg1) {
     logIfEnabled(FQCN, Level.WARN, null, logMessage, arg1);
    }

    public void warn(Object logMessage) {
     logIfEnabled(FQCN, Level.WARN, null, logMessage, null);
    }
}