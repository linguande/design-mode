package com.lingd.servcie.impl;

import com.lingd.servcie.Packing;

/**
 * @description: bottle
 * @author: linguande
 * @create: 2018-05-08 15:47
 **/
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
