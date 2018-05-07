package com.lingd.service.impl;

import com.lingd.service.Shape;

/**
 * @description: square
 * @author: linguande
 * @create: 2018-05-07 09:44
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square : method draw()");
    }
}
