package com.lingd.servcie.impl;

import com.lingd.servcie.Item;
import com.lingd.servcie.Packing;

/**
 * @description: colddrink
 * @author: linguande
 * @create: 2018-05-08 15:50
 **/
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
