package com.quarkxwave.funcprogramming;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToObjExample {
    public static void main(String[] args) {

        List<RandomIds> randomIds = IntStream.rangeClosed(0,10)
                .mapToObj((i)->{
                    return new RandomIds(i, ThreadLocalRandom.current().nextInt());
                }).collect(Collectors.toList());
        randomIds.forEach(System.out::println);
    }
}

class RandomIds{
    int id;
    int randomNumbers;

    public RandomIds(int id, int randomNumbers) {
        this.id = id;
        this.randomNumbers = randomNumbers;
    }

    @Override
    public String toString() {
        return "RandomIds{" +
                "id=" + id +
                ", randomNumbers=" + randomNumbers +
                '}';
    }
}
