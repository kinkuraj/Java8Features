package com.quarkxwave.funcprogramming;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);

        System.out.println("-------------------");
        //iterate generate a stream of 10 even numbers
        Stream<Integer> stream1 = Stream.iterate(0, i-> i+2).limit(10);
        stream1.forEach(System.out::println);

        System.out.println("-------------------");
        //Generate stream of 10 random numbers
        Stream randomNumbers = Stream.generate(new Random()::nextInt).limit(10);
        randomNumbers.forEach(System.out::println);
    }
}
