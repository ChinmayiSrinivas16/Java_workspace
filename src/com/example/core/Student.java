package com.example.core;

public class Student {

    int id;
    String name;
    String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void show() {
        System.out.println("Id: " + id + " Name: " + name + " Course: " + course);
    }
}
