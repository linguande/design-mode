package com.lingd.service.impl;

import com.lingd.service.Shape;

/**
 * @description: 圆
 * @author: linguande
 * @create: 2018-05-04 16:05
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle : method draw()");
    }
}
