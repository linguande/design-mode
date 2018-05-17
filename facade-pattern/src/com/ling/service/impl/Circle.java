package com.ling.service.impl;

import com.ling.service.Shape;

/**
 * @description: circle
 * @author: linguande
 * @create: 2018-05-17 10:42
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle : draw()");
    }
}
