package org.example.design_patterns.strategypattern;

public class Vehicle {
    DriverInterface driver;

    public Vehicle(DriverInterface driver) {
        this.driver = driver;
    }

    public void drive() {
        driver.drive();
    }
}
