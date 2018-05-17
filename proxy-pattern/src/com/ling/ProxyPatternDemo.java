package com.ling;

import com.ling.service.Image;
import com.ling.service.impl.ProxyImage;

/**
 * @description: proxy pattern demo
 * @author: linguande
 * @create: 2018-05-17 17:39
 **/
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();

        System.out.println("-------------------------------------------");

        image.display();

    }
}
