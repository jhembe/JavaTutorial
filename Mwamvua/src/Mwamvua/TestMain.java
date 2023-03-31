//package Mwamvua;
//
//abstract class Shape {
//}
//
//abstract class TwoDimensionalShape extends Shape {
//    public abstract double getArea();
//}
//
//abstract class ThreeDimensionalShape extends Shape {
//    public abstract double getArea();
//    public abstract double getVolume();
//}
//
//class Circle extends TwoDimensionalShape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class Triangle extends TwoDimensionalShape {
//    private double base;
//    private double height;
//
//    public Triangle(double base, double height) {
//        this.base = base;
//        this.height = height;
//    }
//
//    public double getArea() {
//        return 0.5 * base * height;
//    }
//}
//
//class Square extends TwoDimensionalShape {
//    private double side;
//
//    public Square(double side) {
//        this.side = side;
//    }
//
//    public double getArea() {
//        return side * side;
//    }
//}
//
//class Sphere extends ThreeDimensionalShape {
//    private double radius;
//
//    public Sphere(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea() {
//        return 4 * Math.PI * radius * radius;
//    }
//
//    public double getVolume() {
//        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
//    }
//}
//
//class Cube extends ThreeDimensionalShape {
//    private double side;
//
//    public Cube(double side) {
//        this.side = side;
//    }
//
//    public double getArea() {
//        return 6 * side * side;
//    }
//
//    public double getVolume() {
//        return side * side * side;
//    }
//}
//
//public class TestMain {
//    public static void main(String[] args) {
//        Shape[] shapes = new Shape[5];
//        shapes[0] = new Circle(8);
//        shapes[1] = new Triangle(7, 9);
//        shapes[2] = new Square(6);
//        shapes[3] = new Sphere(5);
//        shapes[4] = new Cube(7);
//
//        for (Shape shape : shapes) {
//            System.out.println("Shape: " + shape.getClass().getSimpleName());
//            if (shape instanceof TwoDimensionalShape) {
//                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
//                System.out.println("Area: " + twoDShape.getArea());
//            } else if (shape instanceof ThreeDimensionalShape) {
//                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
//                System.out.println("Area: " + threeDShape.getArea());
//                System.out.println("Volume: " + threeDShape.getVolume());
//            }
//            System.out.println();
//        }
//    }
//}
