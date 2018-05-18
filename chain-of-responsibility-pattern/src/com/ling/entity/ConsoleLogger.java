package com.ling.entity;

/**
 * @description: console logger
 * @author: linguande
 * @create: 2018-05-18 11:11
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console : Logger : " + message);
    }
}
