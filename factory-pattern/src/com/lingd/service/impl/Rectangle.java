package com.lingd.service.impl;

import com.lingd.service.Shape;

/**
 * @description: 矩形
 * @author: linguande
 * @create: 2018-05-04 16:17
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle : method draw()");
    }
}
