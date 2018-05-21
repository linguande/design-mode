package com.ling;

import com.ling.entity.User;

/**
 * @description: mediator pattern demo
 * @author: linguande
 * @create: 2018-05-21 17:31
 **/
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
