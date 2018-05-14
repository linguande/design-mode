package com.lingd.service.impl;

import com.lingd.entity.Person;
import com.lingd.service.Criteria;

import java.util.List;

/**
 * @description: and criteria
 * @author: linguande
 * @create: 2018-05-14 14:03
 **/
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria() {

    }

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriterial(List<Person> personList) {
        List<Person> firstCriteriaPersons = criteria.meetCriterial(personList);
        return otherCriteria.meetCriterial(firstCriteriaPersons);
    }
}
