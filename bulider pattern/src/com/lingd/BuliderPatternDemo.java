package com.lingd;

import com.lingd.utils.Meal;
import com.lingd.utils.MealBulider;

/**
 * @description: demo
 * @author: linguande
 * @create: 2018-05-08 15:42
 **/
public class BuliderPatternDemo {

    public static void main(String[] args) {
        MealBulider mealBulider = new MealBulider();

        Meal vegMeal = mealBulider.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : " + vegMeal.getCost());

        Meal nonVegMeal = mealBulider.prepareNonVegMeal();
        System.out.println("\n\nNon-veg Meal");
        nonVegMeal.showItems();
        System.out.println("TOtal Cost : " + nonVegMeal.getCost());
    }
}
