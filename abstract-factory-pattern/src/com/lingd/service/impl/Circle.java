package com.lingd.service.impl;

import com.lingd.service.Shape;

/**
 * @description: circle
 * @author: linguande
 * @create: 2018-05-07 09:45
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Cricle : method draw()");
    }
}
