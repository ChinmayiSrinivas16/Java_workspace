package com.example.exception.usecase2;

public class InvalidcreditException extends Exception {

    public InvalidcreditException() {
    }

    public InvalidcreditException(String msg) {
        super(msg);
    }
}
