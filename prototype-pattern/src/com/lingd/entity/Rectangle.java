package com.lingd.entity;

/**
 * @description: rectangle
 * @author: linguande
 * @create: 2018-05-09 17:41
 **/
public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Rectangle : method draw()");
    }

    public Rectangle(){
        type = "Rectangle";
    }
}
