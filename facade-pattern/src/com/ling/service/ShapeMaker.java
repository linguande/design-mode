package com.ling.service;

import com.ling.service.impl.Circle;
import com.ling.service.impl.Rectangle;
import com.ling.service.impl.Square;

/**
 * @description: shape maker
 * @author: linguande
 * @create: 2018-05-17 10:44
 **/
public class ShapeMaker {

    private Shape circle;

    private Shape rectangle;

    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
