package com.lingd.entity;

import com.lingd.service.DrawAPI;

/**
 * @description: circle
 * @author: linguande
 * @create: 2018-05-10 14:17
 **/
public class Circle extends Shape {

    private int x;

    private int y;

    private int radius;

    public Circle() {
        super();
    }

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
