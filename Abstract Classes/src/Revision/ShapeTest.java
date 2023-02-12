package Revision;

abstract class Shape{
    abstract double area();
}
abstract class TwoDShape extends Shape{
    abstract double area();
}

class Rectangle extends TwoDShape{
    transient String myname;
//    enum String mySchool;

    double area(){
        return 10;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        TwoDShape ds = new Rectangle();
        Rectangle r = new Rectangle();
        ds.area();


    }

}
