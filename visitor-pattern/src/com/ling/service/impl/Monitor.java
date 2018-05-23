package com.ling.service.impl;

import com.ling.service.ComputerPart;
import com.ling.service.ComputerPartVisitor;

/**
 * @description: monitor
 * @author: linguande
 * @create: 2018-05-23 18:12
 **/
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
