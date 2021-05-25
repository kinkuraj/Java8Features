package com.quarkxwave.lambda;

public class IncrementByFiveLambda {

    public static void main(String[] args) {
        IncrementInterface incrementInterface = (x) -> x + 5;
        System.out.println(incrementInterface.incrementByFive(34));
    }
}
