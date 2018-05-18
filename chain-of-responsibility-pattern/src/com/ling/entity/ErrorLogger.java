package com.ling.entity;

/**
 * @description: error logger
 * @author: linguande
 * @create: 2018-05-18 11:12
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console : Logger : " + message);
    }
}
