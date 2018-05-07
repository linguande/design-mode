package com.lingd.factory;

import com.lingd.service.Color;
import com.lingd.service.Shape;

/**
 * @description: shape factory
 * @author: linguande
 * @create: 2018-05-07 11:26
 **/
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null || "".equals(shape)) {
            return null;
        }
        Shape sh = null;
        try {
            sh = (Shape) Class.forName("com.lingd.service.impl." + shape).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return sh;
    }
}
