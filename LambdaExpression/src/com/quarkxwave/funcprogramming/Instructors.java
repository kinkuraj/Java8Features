package com.quarkxwave.funcprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll(){

        Instructor instructor = new Instructor("Jayalakshmi",26, "F", "Quality Engineer", true, Arrays.asList("Software Testing", "Selenium", "Python Programming"));

        Instructor instructor1 = new Instructor("Kinkuraj",29, "M", "Software Engineer", true, Arrays.asList("Java Programming", "Spring", "Python Programming"));

        Instructor instructor2 = new Instructor("Ram",35, "M", "Cloud Engineer", false, Arrays.asList("DevOps Tools", "Azure", "C++ Programming"));

        Instructor instructor3 = new Instructor("Shyamoli",46, "F", "Manager", false, Arrays.asList("GCP", "Selenium", "Python Programming"));

        Instructor instructor4 = new Instructor("Krishna",23, "M", "Software Developer", false, Arrays.asList("Dot Net", "VB", "C# Programming"));

        return Arrays.asList(instructor, instructor1, instructor2, instructor3, instructor4);
    }
}
