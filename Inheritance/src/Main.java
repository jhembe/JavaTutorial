class Circle{
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }

}

class Cylinder extends Circle{
    public double height;

    public double volume(){
        return area()*height;
    }
}


public class Main {
    // Inheritance is the process of taking the features of an existing class into a new class
    public static void main(String[] args) {
        Cylinder cyl1 = new Cylinder();
        cyl1.radius = 12;
        cyl1.height = 28;

        System.out.print("The volume is : "+cyl1.volume()+"\nThe Area is : "+cyl1.area());
    }
}