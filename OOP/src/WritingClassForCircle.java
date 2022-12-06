class circle{
    public float radius;
    // now for the methods within the class
    public float area(){
       return (float) (Math.PI*radius*radius);
    }
    public float perimeter(){
        return (float)(2*Math.PI*radius);
    }
    public float circumference(){
        return perimeter();
    }
}

public class WritingClassForCircle {
    public static void main(String ...args){
        // creating a method based on circle class
        circle circle1 = new circle();
        circle1.radius = 14;

        System.out.println("The area is : "+circle1.area()+ " Square Meters");
        System.out.println("The perimeter is " + circle1.circumference()+" Meters");

        String str = new String("hello");
        System.out.println(str);

    }
}
