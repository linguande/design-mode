package com.ling.command;

/**
 * @description: stock
 * @author: linguande
 * @create: 2018-05-18 11:49
 **/
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name :" + name
                + ", Quantity : " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stcok [ Name : " + name
                + ", Quantity : " + quantity + " ] sold");
    }
}
