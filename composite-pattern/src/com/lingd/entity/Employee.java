package com.lingd.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: employee
 * @author: linguande
 * @create: 2018-05-15 17:58
 **/
public class Employee {

    private String name;

    private String dept;

    private int salary;

    private List<Employee> subordinates;

    public Employee() {

    }

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return "Employee : [ Name : " + name
                + ", dept : " + dept
                + ", salary : " + salary + " ]";
    }
}
