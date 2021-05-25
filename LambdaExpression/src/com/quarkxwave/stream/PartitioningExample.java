package com.quarkxwave.stream;

import com.quarkxwave.funcprogramming.Instructor;
import com.quarkxwave.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningExample {

    public static void main(String[] args) {
        Predicate<Instructor> instructorPredicate = i -> i.isOnlineCourse();

        Map<Boolean, Set<Instructor>> onlineInstructors = Instructors.getAll().stream()
                .collect(Collectors.partitioningBy(instructorPredicate, Collectors.toSet()));

        onlineInstructors.forEach((k,v) -> {
            System.out.println("key " + k + " value = "+ v);
        });

        Map<String, Set<Instructor>> byTitle = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(p->p.getTitle(), Collectors.toSet()));

        byTitle.forEach((k,v) -> {
            System.out.println("key " + k + " value = "+ v);
        });
    }

}
