package com.ling.entity;

/**
 * @description: observer
 * @author: linguande
 * @create: 2018-05-22 17:36
 **/
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
