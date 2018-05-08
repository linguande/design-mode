package com.lingd.servcie.impl;

/**
 * @description: pepsi
 * @author: linguande
 * @create: 2018-05-08 16:02
 **/
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
