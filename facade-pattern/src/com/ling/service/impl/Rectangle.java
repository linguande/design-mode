package com.ling.service.impl;

import com.ling.service.Shape;

/**
 * @description: rectangle
 * @author: linguande
 * @create: 2018-05-17 10:36
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle : draw()");
    }
}
