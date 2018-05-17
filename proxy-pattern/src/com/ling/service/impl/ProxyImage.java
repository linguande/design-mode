package com.ling.service.impl;

import com.ling.service.Image;

/**
 * @description: proxy image
 * @author: linguande
 * @create: 2018-05-17 17:45
 **/
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
