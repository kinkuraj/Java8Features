package com.quarkxwave.funcprogramming;

import java.util.function.Consumer;

public class MyConsumerExample {

    public static void main(String[] args) {

        Consumer<String> c1 = (x) -> System.out.println("Length of "+ x + " is "+ x.length());
        c1.accept("HelloWorld");

        Consumer<Integer> multiply = (x) -> System.out.println("X*X = "+ x*x);
        multiply.accept(8);

    }
}
