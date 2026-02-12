package com.example.core.lambdaExpression;

public class Test {
    public static void main(String[] args) {
        Greeting g=new Greeting() {
            @Override
            public void greet() {
                System.out.println("HELLO");
            }
        };
        Greeting g1=()->{
            System.out.println("hello");
        };
        g1.greet();
        Notable n=(String x)->{
            System.out.println(x);
        };
        n.note("Physics");

    }
}
