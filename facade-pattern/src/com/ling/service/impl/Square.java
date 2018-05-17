package com.ling.service.impl;

import com.ling.service.Shape;

/**
 * @description: square
 * @author: linguande
 * @create: 2018-05-17 10:41
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square : draw()");
    }
}
