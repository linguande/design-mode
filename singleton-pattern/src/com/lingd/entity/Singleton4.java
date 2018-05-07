package com.lingd.entity;

/**
 * @description: 双重锁校验
 * @author: linguande
 * @create: 2018-05-07 15:19
 **/
public class Singleton4 {

    private static volatile Singleton4 singleton4;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }

}
