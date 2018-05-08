package com.lingd.servcie.impl;

/**
 * @description: coke
 * @author: linguande
 * @create: 2018-05-08 16:01
 **/
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
