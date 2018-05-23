package com.ling.service.impl;

import com.ling.service.ComputerPart;
import com.ling.service.ComputerPartVisitor;

/**
 * @description: computer
 * @author: linguande
 * @create: 2018-05-23 18:13
 **/
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new KeyBoard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
