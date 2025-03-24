package org.example.design_patterns.strategypattern;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportDrive());
    }
}
