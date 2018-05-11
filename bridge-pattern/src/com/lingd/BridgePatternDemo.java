package com.lingd;

import com.lingd.entity.Circle;
import com.lingd.entity.Shape;
import com.lingd.service.impl.GreenCircle;
import com.lingd.service.impl.RedCircle;

/**
 * @description: bridge pattern demo
 * @author: linguande
 * @create: 2018-05-10 14:06
 **/
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,1000,10,new RedCircle());
        Shape greenCircle = new Circle(100,1000,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
