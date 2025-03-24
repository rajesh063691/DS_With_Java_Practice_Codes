package org.example.factory.pattern;

import java.util.regex.Pattern;

public class FactoryPatternMainClass {
    public static void main(String[] args) {
        ProfessionFactory factory = new ProfessionFactory();
        Profession profession = factory.getProfession("Doctor");
        profession.print();
    }
}
