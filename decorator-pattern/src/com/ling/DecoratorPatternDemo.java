package com.ling;

import com.ling.service.Shape;
import com.ling.service.impl.Circle;
import com.ling.service.impl.Rectangle;
import com.ling.service.impl.RedShapeDecorator;

/**
 * @description: decorator pattern demo
 * @author: linguande
 * @create: 2018-05-16 17:28
 **/
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
