package com.lingd.service;

import com.lingd.entity.Person;

import java.util.List;

public interface Criteria {

    List<Person> meetCriterial(List<Person> personList);
}
