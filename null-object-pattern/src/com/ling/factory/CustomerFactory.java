package com.ling.factory;

import com.ling.entity.AbstractCustomer;
import com.ling.entity.NullCustomer;
import com.ling.entity.RealCustomer;

/**
 * @description: customer factory
 * @author: linguande
 * @create: 2018-05-23 16:45
 **/
public class CustomerFactory {

    public static final String[] names = {"Rob","Joe","Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i =0;i<names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
