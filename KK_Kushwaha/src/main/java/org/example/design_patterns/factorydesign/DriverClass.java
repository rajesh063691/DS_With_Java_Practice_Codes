package org.example.design_patterns.factorydesign;

public class DriverClass {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("rectangle");
        shape.draw();
    }
}
