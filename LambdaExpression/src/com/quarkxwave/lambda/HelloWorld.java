package com.quarkxwave.lambda;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World";
        };

        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
