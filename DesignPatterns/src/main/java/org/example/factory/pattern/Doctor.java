package org.example.factory.pattern;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("I am a doctor!");
    }
}
