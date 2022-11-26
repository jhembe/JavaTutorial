public class OverloadedArea {
    // Here we have to create area functions for rectangle and circle having the same function name
    // For the rectangle
    static float area(float length, float breadth){
        return length*breadth;
    }
    // For the circle
    static float area(float radius){
        return (float)(Math.PI * radius*radius);
    }

    public static void main(String[] args){
        System.out.println(area(40,34)); // for area of a rectangle
        System.out.println(area(20)); // for area of the circle
    }
}
