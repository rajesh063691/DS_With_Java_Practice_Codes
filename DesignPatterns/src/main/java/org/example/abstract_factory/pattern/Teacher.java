package org.example.abstract_factory.pattern;


public class Teacher implements Profession {
    @Override
    public void print() {
        System.out.println("Inside Teacher profession!");
    }
}
