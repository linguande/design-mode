package com.ling.service.impl;

import com.ling.service.Expression;

/**
 * @description: terminal expression
 * @author: linguande
 * @create: 2018-05-18 16:52
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression() {

    }

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
