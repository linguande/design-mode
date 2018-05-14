package com.lingd.service.impl;

import com.lingd.entity.Person;
import com.lingd.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: criteria male
 * @author: linguande
 * @create: 2018-05-14 11:51
 **/
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriterial(List<Person> personList) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
