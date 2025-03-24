package org.example.design_patterns.factorydesign;

public class ShapeFactory {
    public Shape getShape(String input) {
        return switch (input) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
