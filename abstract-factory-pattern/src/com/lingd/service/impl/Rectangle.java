package com.lingd.service.impl;

import com.lingd.service.Shape;

/**
 * @description: rectangle
 * @author: linguande
 * @create: 2018-05-07 09:42
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle : method draw()");
    }
}
