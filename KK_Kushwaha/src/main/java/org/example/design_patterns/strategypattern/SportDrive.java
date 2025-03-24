package org.example.design_patterns.strategypattern;

public class SportDrive implements DriverInterface {
    @Override
    public void drive() {
        System.out.println("sport drive called!!!");
    }
}
