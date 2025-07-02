package ABSTRACTIONS.ABS_CLASSES;

abstract class Shape { // abstract class
    String color;

    // abstract method (must be implemented by subclasses)
    abstract double calculateArea();

    // concrete method
    public void displayColor() {
        System.out.println("Shape color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
this.color = color;
this.length = length;
this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
