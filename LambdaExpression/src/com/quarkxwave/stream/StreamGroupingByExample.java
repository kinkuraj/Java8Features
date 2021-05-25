package com.quarkxwave.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamGroupingByExample {
    public static void main(String[] args) {

        List<String> names = List.of("Kinku","Raj","Shaveta","Jaya","Roshan");
        LinkedHashMap<Integer, List<String>> result = names.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length, LinkedHashMap::new,
                                Collectors.filtering(s->s.contains("a"), Collectors.toList())
                        )
                );
        System.out.println(result);


    }
}
