package com.quarkxwave.funcprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<Integer> add = (a,b) -> a+b;
        System.out.println("2 + 3 = " + add.apply(2,3));

        Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(3,6));
        BinaryOperator<Integer> minBy =  BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(3,6));
    }
}
