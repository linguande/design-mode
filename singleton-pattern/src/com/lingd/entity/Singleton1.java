package com.lingd.entity;

/**
 * @description: 懒汉，线性不安全
 * @author: linguande
 * @create: 2018-05-07 15:04
 **/
public class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    public void showMsg(){
        System.out.println("hello");
    }
}
