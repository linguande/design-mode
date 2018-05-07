package com.lingd.factory;

/**
 * @description: factory producer
 * @author: linguande
 * @create: 2018-05-07 11:38
 **/
public class FactoryProduer {

    public static AbstractFactory getFactory(String type){
        if("SHAPE".equalsIgnoreCase(type)){
            return new ShapeFactory();
        }
        if ("COLOR".equalsIgnoreCase(type)){
            return new ColorFactory();
        }
        return null;
    }
}
