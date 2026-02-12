package com.example.exception.usecase;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(){

    }
    public InvalidAgeException(String msg){
        super(msg);
    }
}
