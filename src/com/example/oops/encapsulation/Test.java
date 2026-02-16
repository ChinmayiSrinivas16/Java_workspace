package com.example.oops.encapsulation;

public class Test {

    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.setId(1);
        m.setBrand("Samsung");
        m.setRam(8);

        System.out.println("Id: " + m.getId());
        System.out.println("Brand: " + m.getBrand());
        System.out.println("RAM: " + m.getRam() + " GB");
    }
}

