package com.lingd.servcie.impl;

/**
 * @description: vegburger
 * @author: linguande
 * @create: 2018-05-08 15:59
 **/
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
