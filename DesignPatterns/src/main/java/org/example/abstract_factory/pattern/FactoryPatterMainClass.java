package org.example.abstract_factory.pattern;

public class FactoryPatterMainClass {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getFactory(false);
        Profession profession = abstractFactory.getProfession("Teacher");
        profession.print();

    }
}
