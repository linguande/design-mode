package com.lingd.factory;

import com.lingd.service.Color;
import com.lingd.service.Shape;

/**
 * @description: abstractfactory
 * @author: linguande
 * @create: 2018-05-07 09:54
 **/
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
