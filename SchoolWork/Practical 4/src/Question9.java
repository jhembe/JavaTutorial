class Circle{
    // for the instance variable
    int radius;
    // for the programmer defined constructor
    public Circle(int radius){
        this.radius = radius;
    }
    // for the method that accepts integer values
    // here radius is the parameter
    public int diameter(int radius){
        return 2*radius;
    }

}
public class Question9 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        // here 5 is an argument
        c.diameter(5);
    }
}
