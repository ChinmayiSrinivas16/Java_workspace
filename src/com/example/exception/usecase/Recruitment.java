package com.example.exception.usecase;

public class Recruitment {
    public void checkEligibility(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid age");
        }
        else{
            System.out.println("u r hired");
        }
    }
}
