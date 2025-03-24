package org.example.design_patterns.strategypattern;

public class NormalDrive implements DriverInterface {
    @Override
    public void drive() {
        System.out.println("Normal drive method called!!!");
    }
}
