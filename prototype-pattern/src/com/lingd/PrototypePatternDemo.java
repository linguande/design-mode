package com.lingd;

import com.lingd.cache.ShapeCache;
import com.lingd.entity.Shape;

/**
 * @description: prototype pattern demo
 * @author: linguande
 * @create: 2018-05-09 16:37
 **/
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + cloneShape.getType());

        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + cloneShape2.getType());

        Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + cloneShape3.getType());
    }
}
