package com.ling.entity;

/**
 * @description: real customer
 * @author: linguande
 * @create: 2018-05-23 16:41
 **/
public class RealCustomer extends AbstractCustomer {

    public RealCustomer() {

    }

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
