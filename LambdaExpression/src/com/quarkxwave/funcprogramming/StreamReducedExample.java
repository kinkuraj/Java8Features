package com.quarkxwave.funcprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReducedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer sum = numbers.stream().reduce(10, (a,b) -> a+b);
        System.out.println(sum);

        Integer multiplication = numbers.stream().reduce(1, (a,b) -> a*b);
        System.out.println(multiplication);

        //Binary reduced
        Optional<Integer> multiplications = numbers.stream().reduce((a, b) -> a*b);
        if(multiplications.isPresent())
            System.out.println(multiplications.get());

        //Find the oldest instructor
        Optional<Instructor> instructor = Instructors.getAll().stream().reduce((s1,s2)-> {
            if(s1.getAge() > s2.getAge())
                return s1;
            else
                return s2;
        });

        if(instructor.isPresent())
            System.out.println(instructor.get());

        //max
        System.out.println("-------------------------");
        Optional result = numbers.stream().max(Integer::compareTo);
        System.out.println(result);

        int result3 = numbers.stream().reduce(0, (a,b) -> a>b?a:b);
        System.out.println(result3);

        Optional result4 = numbers.stream().reduce((a,b) -> a>b?a:b);
        System.out.println(result4);

        Optional result5 = numbers.stream().reduce(Integer::max);
        System.out.println(result5);

        //min
        System.out.println("-------------------------");
        Optional result1 = numbers.stream().min(Integer::compareTo);
        System.out.println(result1);

        Optional result6 = numbers.stream().reduce((a,b) -> a<b?a:b);
        System.out.println(result6);

        Optional result7 = numbers.stream().reduce(Integer::min);
        System.out.println(result7);

        //Potential bug - if we provide identity lower than lower value in array then result will be identity value
        int result8 = numbers.stream().reduce(0, (a,b) -> a<b?a:b);
        System.out.println(result8);
    }
}
