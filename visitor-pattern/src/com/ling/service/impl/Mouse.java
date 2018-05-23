package com.ling.service.impl;

import com.ling.service.ComputerPart;
import com.ling.service.ComputerPartVisitor;

/**
 * @description: mouse
 * @author: linguande
 * @create: 2018-05-23 18:13
 **/
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
