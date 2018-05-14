package com.lingd.service.impl;

import com.lingd.entity.Person;
import com.lingd.service.Criteria;

import java.util.List;

/**
 * @description: orcriteria
 * @author: linguande
 * @create: 2018-05-14 16:55
 **/
public class OrCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public OrCriteria() {

    }

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriterial(List<Person> personList) {
        List<Person> firstCriteriaItems = criteria.meetCriterial(personList);
        List<Person> otherCriteriaItems = otherCriteria.meetCriterial(personList);
        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
