package com.quarkxwave.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class InstructorConsumer {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
        instructors.forEach(c1);

        System.out.println("-------------------------------");
        Consumer<Instructor> c2 = (s2) -> System.out.println(s2.getName());
        instructors.forEach(c2);

        System.out.println("-------------------------------");
        Consumer<Instructor> c3 = (s3) -> System.out.println(s3.getCourses());

        instructors.forEach(s -> {
            if(s.isOnlineCourse()){
                c2.andThen(c3).accept(s);
            }
        });

    }
}
