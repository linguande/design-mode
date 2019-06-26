package com.lingd;

import com.lingd.factory.AbstractFactory;
import com.lingd.factory.FactoryProduer;
import com.lingd.service.Color;
import com.lingd.service.Shape;

/**
 * @description: demo
 * @author: linguande
 * @create: 2018-05-07 11:43
 **/
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProduer.getFactory("shape");

        Shape shape1 = shapeFactory.getShape("Rectangle");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Square");

        shape2.draw();






        Shape shape3 = shapeFactory.getShape("Circle");

        shape3.draw();

        AbstractFactory colorFactory = FactoryProduer.getFactory("color");

        Color color1 = colorFactory.getColor("Red");

        color1.fill();

        Color color2 = colorFactory.getColor("Green");

        color2.fill();


        Color color3 = colorFactory.getColor("Bule");

        color3.fill();

    }
}
