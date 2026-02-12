package com.example.staticfinal;

public class Test {
    public static void main(String[] args) {

        Sample obj = new Sample();
        obj.x = 10;
        obj.x++;
        System.out.println(obj.x);   // 11

        Sample obj1 = new Sample();
        obj1.x = 20;
        obj1.x++;
        System.out.println(obj1.x);  // 21

        Sample obj2 = new Sample();
        obj2.x = 30;
        obj2.x++;
        System.out.println(obj2.x);  // 31

        // Access static final variable
        System.out.println(Sample.num); // 100

        // Sample.num++;
    }
}
