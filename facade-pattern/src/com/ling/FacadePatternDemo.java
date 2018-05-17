package com.ling;

import com.ling.service.ShapeMaker;

/**
 * @description: facade pattern demo
 * @author: linguande
 * @create: 2018-05-17 10:34
 **/
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
