package com.example.oops.inheritence;

public class Employee extends Person {

    int empId;
    double salary;

    public Employee(String name, int age, int empId, double salary) {
        super(name, age);   // Call parent constructor
        this.empId = empId;
        this.salary = salary;
    }

    public void showEmployee() {
        showPerson();   // Parent method
        System.out.println("EmpId: " + empId + " Salary: " + salary);
    }
}











