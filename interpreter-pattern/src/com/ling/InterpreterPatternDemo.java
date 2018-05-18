package com.ling;

import com.ling.service.Expression;
import com.ling.service.impl.AndExpression;
import com.ling.service.impl.OrExpression;
import com.ling.service.impl.TerminalExpression;

/**
 * @description: interpreter pattern demo
 * @author: linguande
 * @create: 2018-05-18 16:48
 **/
public class InterpreterPatternDemo {

    public static Expression getMaleExperssion() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExperssion();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Jhon is male ? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman ? " + isMarriedWoman.interpret("Married Julie"));
    }

}
