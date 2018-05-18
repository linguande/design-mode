package com.ling.service.impl;

import com.ling.service.Expression;

/**
 * @description: or expression
 * @author: linguande
 * @create: 2018-05-18 17:00
 **/
public class OrExpression implements Expression {

    private Expression expression1 = null;

    private Expression expression2 = null;

    public OrExpression() {

    }

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression1.interpret(context);
    }
}
