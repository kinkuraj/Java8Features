package com.quarkxwave.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CallableByLambda {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int [] array = IntStream.rangeClosed(0,100).toArray();
        int total = IntStream.rangeClosed(0,100).sum();

        Callable callable = () -> {
            System.out.println("Called");
            int sum = 0;
            for(int i=0; i< array.length/2; i++){
                sum += array[i];
            }
            System.out.println("returning");
            return sum;
        };

        Callable callable1 = () -> {
            int sum = 0;

            for(int i = array.length/2; i<array.length; i++){
                sum += array[i];
            }
            System.out.println("Before Sleeping");
            Thread.sleep(5000);
            System.out.println("After Sleeping");
            return sum;
        };

        ExecutorService executorService =  Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable,callable1);

        List<Future<Integer>> results = executorService.invokeAll(taskList);
        executorService.shutdown();
        int k =0;
        int sum = 0;

        for(Future<Integer> result: results) {
            sum += result.get();
            System.out.println("Callable sum result of " + ++k + " " + result.get());
        }

        System.out.println("Sum of all callable "+ sum);
        System.out.println("Total sum is "+ total);

    }
}
