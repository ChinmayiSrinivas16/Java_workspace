package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Movie1
        Movie m1 = context.getBean("Movie1", Movie.class);
        m1.setTitle("Troy");
        System.out.println(m1.getTitle());

        // Movie2
        Movie m2 = context.getBean("Movie2", Movie.class);
        m2.setTitle("Meet Joe Black");
        System.out.println(m2.getTitle());

        // Fruits1
        Fruits f1 = context.getBean("Fruits1", Fruits.class);
        f1.setFamily("Anacardiaceae");
        System.out.println(f1.getFamily());

        Book b1=context.getBean(Book.class);
    }
}
