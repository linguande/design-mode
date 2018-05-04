package com.lingd.service.impl;

import com.lingd.service.Shape;

/**
 * @description: 正方形
 * @author: linguande
 * @create: 2018-05-04 16:07
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("square : method draw()");
    }
}
