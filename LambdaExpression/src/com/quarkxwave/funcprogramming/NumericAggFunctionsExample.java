package com.quarkxwave.funcprogramming;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericAggFunctionsExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(0,50).sum();
        System.out.println("Sum of 50 numbers : "+ sum);

        OptionalInt min = IntStream.range(1,50).min();
        System.out.println("Minimum of 50 numbers : "+ min.getAsInt());

        OptionalDouble max = LongStream.rangeClosed(0,50).asDoubleStream().max();
        System.out.println("Max of 50 numbers :"+ max.getAsDouble());

        OptionalDouble average = LongStream.rangeClosed(0,1000).average();
        System.out.println("Average of 1000 numbers :" + (average.isPresent()?average.getAsDouble(): 0.0));
    }
}
