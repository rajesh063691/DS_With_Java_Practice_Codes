package com.rajesh.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;

    static long population;

    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;
    }
}
