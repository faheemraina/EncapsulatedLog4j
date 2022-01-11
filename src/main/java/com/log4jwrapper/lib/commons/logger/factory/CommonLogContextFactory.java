package com.log4jwrapper.lib.commons.logger.factory;

import org.apache.logging.log4j.core.impl.Log4jContextFactory;
import org.apache.logging.log4j.core.util.DefaultShutdownCallbackRegistry;

import com.log4jwrapper.lib.commons.logger.context.CommonContextSelector;

public class CommonLogContextFactory extends Log4jContextFactory {
    public CommonLogContextFactory() {
        super(new CommonContextSelector(), new DefaultShutdownCallbackRegistry());
    }
}