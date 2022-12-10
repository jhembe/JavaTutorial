public class Question8 {
    // for the instance variables
    public int radius;
    public int height;

    // for class variables
    static int width;
    static float breadth;

    // instance method
    void setRadius(int r){
        this.radius = r;
    }
    int getRadius(){
        return radius;
    }

    // for static method
    public static void display(){
        // local variables
        int a=3;
        float m = 5.56f;
        System.out.println("Hello there, this is a static method implementation");
        System.out.println(a+m);
    }
}
