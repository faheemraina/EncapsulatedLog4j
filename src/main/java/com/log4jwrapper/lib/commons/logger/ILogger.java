package com.log4jwrapper.lib.commons.logger;

public interface ILogger {
	public void debug(Object logMessage, Throwable arg1);

    public void debug(Object logMessage);

    public void error(Object logMessage, Throwable arg1);

    public void error(Object logMessage);

    public void fatal(Object logMessage, Throwable arg1);

    public void fatal(Object logMessage);

    public void info(Object logMessage, Throwable arg1);

    public void info(Object logMessage);

    public void warn(Object logMessage, Throwable arg1);

    public void warn(Object logMessage);
}
