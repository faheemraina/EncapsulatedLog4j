package com.log4jwrapper.lib.commons.logger;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.log4jwrapper.lib.commons.logger.CommonLogger;
import com.log4jwrapper.lib.commons.logger.ILogger;
import com.log4jwrapper.lib.commons.logger.context.CommonContextSelector;

/**
 * Unit test CommonLoggerTest.
 */
public class CommonLoggerTest {

	static ILogger logger;// = CommonLogger.getLogger(CommonLoggerTest.class);
	static String msg="Custom log message";

	@BeforeAll
	static void setup() {
		logger = CommonLogger.getLogger(CommonLoggerTest.class);
	}

	@DisplayName("Test different Logger levels with  message")
	@Test
	public void loggingMessges() {
		logger.info(msg);
		logger.debug(msg);
		logger.warn(msg);
		logger.error(msg);
		logger.fatal(msg);
	}

	/*@DisplayName("Test different Logger levels with  exceptions")
	@Test	
	public void loggingMessgesWithExceptions() {
		try {
			throw new Throwable("Some thing went wrog ;) ");
		}catch(Throwable t)
		{
			logger.info(msg, t);
			logger.debug(msg, t);
			logger.warn(msg, t);
			logger.error(msg, t);
			logger.fatal(msg, t);
		}
		
		
	}*/

	@Test
	public void testApp2() {
		assertNotNull(logger);

	}
	
	@Test
	public void testNotInitialisedScenario() {
		CommonLogManager.initialize(null);

	}
	
	@Test
	public void testGetContext3VarScenario() {
		 new CommonContextSelector().getContext(null, null, false);

	}

}
