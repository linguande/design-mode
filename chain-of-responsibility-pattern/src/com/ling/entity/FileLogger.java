package com.ling.entity;

/**
 * @description: file logger
 * @author: linguande
 * @create: 2018-05-18 11:14
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File : Logger : " + message);
    }
}
