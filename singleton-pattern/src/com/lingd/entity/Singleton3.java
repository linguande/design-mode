package com.lingd.entity;

/**
 * @description: 饿汉
 * @author: linguande
 * @create: 2018-05-07 15:16
 **/
public class Singleton3 {

    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return singleton3;
    }

}
