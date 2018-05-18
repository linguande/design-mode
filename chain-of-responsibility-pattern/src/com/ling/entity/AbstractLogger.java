package com.ling.entity;

/**
 * @description: abstract logger
 * @author: linguande
 * @create: 2018-05-18 10:37
 **/
public abstract class AbstractLogger {

    public static int INFO = 1;

    public static int DEBUG = 2;

    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
