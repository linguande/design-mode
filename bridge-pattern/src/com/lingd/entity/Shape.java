package com.lingd.entity;

import com.lingd.service.DrawAPI;

/**
 * @description: shape
 * @author: linguande
 * @create: 2018-05-10 14:16
 **/
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(){

    }

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
