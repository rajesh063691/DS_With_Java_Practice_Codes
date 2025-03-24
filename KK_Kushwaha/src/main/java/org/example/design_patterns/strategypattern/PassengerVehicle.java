package org.example.design_patterns.strategypattern;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
