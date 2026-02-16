package com.example.oops.inheritence;

public class Manager extends Employee {

    String department;

    public Manager(String name, int age, int empId, double salary, String department) {
        super(name, age, empId, salary);   // Call Employee constructor
        this.department = department;
    }

    public void showManager() {
        showEmployee();   // Parent method
        System.out.println("Department: " + department);
    }
}