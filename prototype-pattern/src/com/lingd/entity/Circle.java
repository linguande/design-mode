package com.lingd.entity;

/**
 * @description: circle
 * @author: linguande
 * @create: 2018-05-09 17:45
 **/
public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Circle : method draw()");
    }

    public Circle() {
        type = "Circle";
    }
}
