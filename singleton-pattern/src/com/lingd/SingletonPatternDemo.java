package com.lingd;

import com.lingd.entity.Singleton3;
import com.lingd.entity.Singleton5;

/**
 * @description: singleton pattern demo
 * @author: linguande
 * @create: 2018-05-07 15:00
 **/
public class SingletonPatternDemo {

    public static void main(String[] args) {
        Singleton3 singleton30 = Singleton3.getInstance();
        Singleton3 singleton31 = Singleton3.getInstance();

        System.out.println(singleton30 == singleton31);

        Singleton5 singleton50 = Singleton5.INSTANCE;
        Singleton5 singleton51 = Singleton5.INSTANCE;

        System.out.println(singleton50 == singleton51);
    }
}
