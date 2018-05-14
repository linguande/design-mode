package com.lingd.service.impl;

import com.lingd.entity.Person;
import com.lingd.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: criteria single
 * @author: linguande
 * @create: 2018-05-14 11:57
 **/
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriterial(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
