package com.lingd.servcie.impl;

import com.lingd.servcie.Item;
import com.lingd.servcie.Packing;

/**
 * @description: burger
 * @author: linguande
 * @create: 2018-05-08 15:49
 **/
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
