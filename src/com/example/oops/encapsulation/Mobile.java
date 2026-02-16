package com.example.oops.encapsulation;

public class Mobile {

    private int id;
    private String brand;
    private int ram;

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }
}
