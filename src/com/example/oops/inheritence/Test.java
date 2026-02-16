package com.example.oops.inheritence;

public class Test {

    public static void main(String[] args) {

        Person p = new Person("Ravi", 30);

        Employee e = new Employee("Anita", 28, 101, 50000);

        Manager m = new Manager("Chinmayi", 25, 201, 80000, "IT");

        p.showPerson();

        System.out.println();

        e.showEmployee();

        System.out.println();

        m.showManager();
    }
}
