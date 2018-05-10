package com.lingd.service.impl;

import com.lingd.service.DrawAPI;

/**
 * @description: red circle
 * @author: linguande
 * @create: 2018-05-10 14:11
 **/
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ color: red, radius: " + radius + ", x: " + x + ", y:" + y + "]");
    }
}
