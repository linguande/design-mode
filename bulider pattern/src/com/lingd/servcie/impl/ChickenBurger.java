package com.lingd.servcie.impl;

/**
 * @description: chickenburger
 * @author: linguande
 * @create: 2018-05-08 16:00
 **/
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
