package com.quarkxwave.funcprogramming;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        // List of instructor who teaches online

        List<String> instructors = Instructors.getAll().stream()
                .filter(s -> s.isOnlineCourse()).map(Instructor::getName).collect(Collectors.toList());
        System.out.println(instructors);

        System.out.println("--------------------");

        //Count of total unique courses offered

        Long count = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).distinct().count();
        System.out.println(count);

        //Stream customized comparator
        List<String> instructorNames = Instructors.getAll().stream().map(Instructor::getName).sorted().collect(Collectors.toList());
        System.out.println(instructorNames);
        List<Instructor> instructorsList = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName).reversed()).collect(Collectors.toList());
        System.out.println(instructorsList);

    }
}
