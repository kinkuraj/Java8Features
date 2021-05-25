package com.quarkxwave.funcprogramming;

import java.util.List;

public class Instructor {
    private String name;

    private int age;

    private String gender;

    private String title;

    private boolean onlineCourse;

    private List<String> courses;

    public Instructor(String name, int age, String gender, String title, boolean onlineCourse, List<String> courses) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.title = title;
        this.onlineCourse = onlineCourse;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", title='" + title + '\'' +
                ", onlineCourse=" + onlineCourse +
                ", courses=" + courses +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isOnlineCourse() {
        return onlineCourse;
    }

    public void setOnlineCourse(boolean onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
