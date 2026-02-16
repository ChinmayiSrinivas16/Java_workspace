package com.example.optionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] str=new String[5];
        Optional<String> check=Optional.ofNullable(str[4]);
        if(check.isEmpty()){
            System.out.println("String is empty");
        }else{
            String lowecasee=str[4].toLowerCase();
            System.out.println(lowecasee);
        }
    }
}
