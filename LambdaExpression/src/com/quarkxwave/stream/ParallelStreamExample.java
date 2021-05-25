package com.quarkxwave.stream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,5000000).parallel().sum());
        System.out.println(IntStream.rangeClosed(1,5000000).sum());
    }
}


