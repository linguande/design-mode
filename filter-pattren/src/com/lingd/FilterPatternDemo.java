package com.lingd;

import com.lingd.entity.Person;
import com.lingd.service.Criteria;
import com.lingd.service.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: filter pattern demo
 * @author: linguande
 * @create: 2018-05-14 11:39
 **/
public class FilterPatternDemo {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Robert", "Male", "Single"));
        personList.add(new Person("John", "Male", "Married"));
        personList.add(new Person("Laura", "Female", "Married"));
        personList.add(new Person("Diana", "Female", "Single"));
        personList.add(new Person("Mike", "Male", "Single"));
        personList.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriterial(personList));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriterial(personList));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriterial(personList));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriterial(personList));


    }

    public static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
