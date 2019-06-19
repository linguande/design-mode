package com.lingd.entity;

/**
 * @description: square
 * @author: linguande
 * @create: 2018-05-09 17:43
 **/
public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Squre : method draw()");
    }

    public Square() {
        type = "Square";
    }
}
