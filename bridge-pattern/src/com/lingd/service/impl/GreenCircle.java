package com.lingd.service.impl;

import com.lingd.service.DrawAPI;

/**
 * @description: green circle
 * @author: linguande
 * @create: 2018-05-10 14:14
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ color: green, radius: " + radius + ", x: " + x + ", y:" + y + "]");
    }
}
