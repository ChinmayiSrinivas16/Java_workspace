package com.example.exception.usecase2;

public class Creditcard {

    public void checkCardNumber(String cardNo) throws InvalidcreditException {

        if (cardNo.length() != 16) {
            throw new InvalidcreditException("Invalid Card Number. Must be 16 digits");
        }
        else {
            System.out.println("Card Accepted. Payment Successful");
        }
    }
}
