package com.lingd.service.impl;

import com.lingd.entity.Person;
import com.lingd.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: criteria female
 * @author: linguande
 * @create: 2018-05-14 11:56
 **/
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriterial(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
