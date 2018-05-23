package com.ling.entity;

/**
 * @description: null customer
 * @author: linguande
 * @create: 2018-05-23 16:43
 **/
public class NullCustomer extends AbstractCustomer {

    public NullCustomer() {

    }

    public NullCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
