package com.rajesh.staticExample;

public class Main {
    public static void main(String[] args) {
        Human rajesh = new Human(33, "Rajesh Kumar", 10000, true);
        Human rahul = new Human(34, "Rahul Kumar", 15000, true);


        System.out.println(rajesh.name);
        System.out.println(rahul.name);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
