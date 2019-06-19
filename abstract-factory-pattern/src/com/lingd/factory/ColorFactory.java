package com.lingd.factory;

import com.lingd.service.Color;
import com.lingd.service.Shape;

/**
 * @description: color factory
 * @author: linguande
 * @create: 2018-05-07 11:26
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null || "".equals(color)) {
            return null;
        }
        Color co = null;
        try {
            co = (Color) Class.forName("com.lingd.service.impl." + color).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return co;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
