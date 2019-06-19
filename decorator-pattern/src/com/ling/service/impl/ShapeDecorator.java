package com.ling.service.impl;

import com.ling.service.Shape;

/**
 * @description: shape decorator
 * @author: linguande
 * @create: 2018-05-16 17:33
 **/
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator() {

    }

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
