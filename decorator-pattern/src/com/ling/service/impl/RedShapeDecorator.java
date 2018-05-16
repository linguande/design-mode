package com.ling.service.impl;

import com.ling.service.Shape;

/**
 * @description: red shape decorator
 * @author: linguande
 * @create: 2018-05-16 17:39
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(){

    }

    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("Border Color : Red");
    }
}
