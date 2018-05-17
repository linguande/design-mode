package com.ling.factory;

import com.ling.service.Shape;
import com.ling.service.impl.Circle;

import java.util.HashMap;

/**
 * @description: shape factory
 * @author: linguande
 * @create: 2018-05-17 14:04
 **/
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
