package com.lingd.entity;

/**
 * @description: 懒汉，线性安全
 * @author: linguande
 * @create: 2018-05-07 15:12
 **/
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}
