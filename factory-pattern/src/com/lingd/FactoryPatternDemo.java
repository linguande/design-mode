package com.lingd;

import com.lingd.factory.ShapeFactory;
import com.lingd.service.Shape;

/**
 * @description: demo1
 * @author: linguande
 * @create: 2018-05-04 16:26
 **/
public class FactoryPatternDemo {

    public static void main(String[] args) {

        Shape square = ShapeFactory.getInstance("Square");

        square.draw();

        Shape rectangle = ShapeFactory.getInstance("Rectangle");

        rectangle.draw();

        Shape circle = ShapeFactory.getInstance("Circle");

        circle.draw();
    }
}
