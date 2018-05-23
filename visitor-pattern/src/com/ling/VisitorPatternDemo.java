package com.ling;

import com.ling.service.ComputerPart;
import com.ling.service.impl.Computer;
import com.ling.service.impl.ComputerPartDisplayVisitor;

/**
 * @description: visitor pattern demo
 * @author: linguande
 * @create: 2018-05-23 18:05
 **/
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
