package com.example.oops.inheritence;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println("Name: " + name + " Age: " + age);
}}
