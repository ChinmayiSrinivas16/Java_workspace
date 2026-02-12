package com.example.exception;

public class Sample {
    public static void main(String[] args) {
        int x=0;
        int y=10;
        int z=y/x;
        try{
            System.out.println(z);
        }catch(ArithmeticException e){
            System.out.println("can't divide by zero");
        }
    }
}
