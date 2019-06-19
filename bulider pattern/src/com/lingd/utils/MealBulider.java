package com.lingd.utils;

import com.lingd.servcie.impl.ChickenBurger;
import com.lingd.servcie.impl.Coke;
import com.lingd.servcie.impl.Pepsi;
import com.lingd.servcie.impl.VegBurger;

/**
 * @description: mealbulider
 * @author: linguande
 * @create: 2018-05-08 16:14
 **/
public class MealBulider {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
