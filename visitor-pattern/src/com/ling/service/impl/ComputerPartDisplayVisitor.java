package com.ling.service.impl;

import com.ling.service.ComputerPartVisitor;

/**
 * @description: computer part display visitor
 * @author: linguande
 * @create: 2018-05-23 18:18
 **/
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Displaying KeyBoard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
