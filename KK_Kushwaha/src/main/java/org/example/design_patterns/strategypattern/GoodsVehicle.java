package org.example.design_patterns.strategypattern;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDrive());
    }
}
