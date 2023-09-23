package org.myapp.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape("Circle");
        circle.draw(); // Output: Drawing a Circle

        Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.draw(); // Output: Drawing a Rectangle

        Shape triangle = shapeFactory.createShape("Triangle");
        triangle.draw(); // Output: Drawing a Triangle
    }
}
