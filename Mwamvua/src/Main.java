abstract class Shape{
}

abstract class TwoDimentionalShape extends Shape{
    abstract float getArea();
}

abstract class ThreeDimentionalShape extends Shape{
    abstract float getArea();
    abstract float getVolume();
}

class Circle extends TwoDimentionalShape{
    float radius;
    public Circle(float radius){
        this.radius = radius;
    }
    @Override
    float getArea(){
        return (float) (Math.PI*radius*radius);
    }

}

class Triangle extends TwoDimentionalShape{
    float base,height;
    public Triangle(float base,float height){
        this.base = base;
        this.height = height;
    }
    @Override
    float getArea(){
        return (0.5f*base*height);
    }
}

class Square extends TwoDimentionalShape{
    float length;
    public Square(float length){
        this.length = length;
    }
    @Override
    float getArea(){
        return length*length;
    }
}

class Sphere extends ThreeDimentionalShape{
    float radius;
    public Sphere(float radius){
        this.radius = radius;
    }
    @Override
    float getArea(){
        return (float)(4*Math.PI*radius*radius);
    }
    float getVolume(){
        return (float)((4/3)*Math.PI*radius*radius*radius);
    }
}

class Cube extends ThreeDimentionalShape{
    float length;
    public Cube(float length){
        this.length = length;
    }
    @Override
    float getArea(){
        return 6f*length*length;
    }
    float getVolume(){
        return length*length*length;
    }
}
class Tetrahedron extends ThreeDimentionalShape{
    float length;
    public Tetrahedron(float length){
        this.length = length;
    }
    @Override
    float getArea(){
        return (float)(Math.sqrt(3)*length*length);
    }
    float getVolume(){
        return (float) ((length*length*length)/(6*Math.sqrt(2)));
    }
}
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(7);
        shapes[2] = new Triangle(6,4);
        shapes[3] = new Sphere(9);
        shapes[4] = new Cube(7);
        shapes[5] = new Tetrahedron(8);

        // printing
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            if (shape instanceof TwoDimentionalShape) {
                TwoDimentionalShape twoDShape = (TwoDimentionalShape) shape;
                System.out.println("Area: " + twoDShape.getArea());
            }
            else if (shape instanceof ThreeDimentionalShape) {
                ThreeDimentionalShape threeDShape = (ThreeDimentionalShape) shape;
                System.out.println("Area: " + threeDShape.getArea());
                System.out.println("Volume: " + threeDShape.getVolume());
            }
            System.out.println();
        }


    }
}