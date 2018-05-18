package com.ling;

import com.ling.entity.AbstractLogger;
import com.ling.entity.ConsoleLogger;
import com.ling.entity.ErrorLogger;
import com.ling.entity.FileLogger;

/**
 * @description: chain of responsitiilty pattern demo
 * @author: linguande
 * @create: 2018-05-18 10:34
 **/
public class ChainOfResponsibilityPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger erroeLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        erroeLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return erroeLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an infomation");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
    }
}
