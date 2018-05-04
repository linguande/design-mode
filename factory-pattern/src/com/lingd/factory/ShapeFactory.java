package com.lingd.factory;

import com.lingd.service.Shape;
import com.lingd.service.impl.Circle;
import com.lingd.service.impl.Rectangle;
import com.lingd.service.impl.Square;
import sun.security.provider.SHA;

/**
 * @description: 工厂
 * @author: linguande
 * @create: 2018-05-04 16:19
 **/
public class ShapeFactory {

    public static Shape getInstance(String type) {

        if (type == null || "".equals(type)) {
            return null;
        }
        Shape shape = null;
        /*if ("Square".equals(type)) {
            shape = new Square();
        }
        if ("Rectangle".equals(type)) {
            shape = new Rectangle();
        }
        if ("Circle".equals(type)) {
            shape = new Circle();
        }*/
        //上面写法每增加一个分支都需要更改工厂类，可用反射来解决，如下
        try {
            shape = (Shape) Class.forName("com.lingd.service.impl."+type).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shape;
    }
}
