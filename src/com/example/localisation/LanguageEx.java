package com.example.localisation;

import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LanguageEx {

    ResourceBundle bundle;

    public void show(Locale loc) {

        bundle = ResourceBundle.getBundle("message", loc);

        System.out.println("\nDate: " + LocalDate.now());
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("welcome"));
        System.out.println(bundle.getString("message1"));
        System.out.println(bundle.getString("message2"));
        System.out.println(bundle.getString("regards"));
    }


    public static void main(String[] args) {

        LanguageEx t = new LanguageEx();

        Locale inLocale = new Locale("hi", "IN");
        Locale usLocale = new Locale("en", "US");
        Locale zhLocale = new Locale("zh", "CN");
        Locale frLocale = Locale.FRANCE;
        Locale knLocale = new Locale("kn", "IN"); // ✅ Kannada

        System.out.println("Select your language ");
        System.out.println("1: English");
        System.out.println("2: French");
        System.out.println("3: Chinese");
        System.out.println("4: Hindi");
        System.out.println("5: Kannada");
        System.out.println("6: Exit");

        Scanner scn = new Scanner(System.in);

        int choice = scn.nextInt();

        switch (choice) {

            case 1:
                t.show(usLocale);
                break;

            case 2:
                t.show(frLocale);
                break;

            case 3:
                t.show(zhLocale);
                break;

            case 4:
                t.show(inLocale);
                break;

            case 5:
                t.show(knLocale); // ✅ Kannada
                break;

            default:
                System.out.println("Thank you!");
        }

        scn.close();
    }}
