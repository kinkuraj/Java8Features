package com.quarkxwave.lambda;

public class RunnableByLambda {

    public static void main(String[] args) {

        //Traditional way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i=0; i < 10; i++){
                    sum += i;
                }
                System.out.println(sum);
            }
        };

        new Thread(runnable).start();

        //By Lambda

        Runnable runnable1 = () ->{
            int sum =0;
            for(int i =0; i < 10; i++)
                sum += i;
            System.out.println(sum);
                };
        new Thread(runnable1).start();

        //Create runnable thread using lambda
        new Thread( () -> {
            int sum = 0;
            for (int i =0; i < 10; i++)
                sum += i;
            System.out.println(sum);
        }).start();
    }
}
