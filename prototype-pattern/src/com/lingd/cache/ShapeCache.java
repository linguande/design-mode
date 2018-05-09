package com.lingd.cache;

import com.lingd.entity.Circle;
import com.lingd.entity.Rectangle;
import com.lingd.entity.Shape;
import com.lingd.entity.Square;

import java.util.Hashtable;

/**
 * @description: shapecache
 * @author: linguande
 * @create: 2018-05-09 17:47
 **/
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
