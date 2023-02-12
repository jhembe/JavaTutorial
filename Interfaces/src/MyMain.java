import java.util.Scanner;

interface Iarea{
    float area();
}
class Polygon{
    private float height;
    private float width;

    // for setter methods
    public void setHeight(float height){
        this.height = height;
    }
    public void setWidth(float width){
        this.width = width;
    }

    float getHeight(){
        return height;
    }
    float getWidth(){
        return width;
    }
}

class Rectangle extends Polygon implements Iarea{
    public float area(){
        return getHeight()*getWidth();
    }

}

class Triangle extends Polygon implements Iarea{
    public float area(){
        return 0.5f * getHeight()*getWidth();
    }
}



public class MyMain {

    public static void main(String[] args) {
        // for rectangle
        Scanner input = new Scanner(System.in);

        Rectangle rec = new Rectangle();
        Triangle tr = new Triangle();

        //user inputs rec
        System.out.print("Input height : ");
        float height = input.nextFloat();
        rec.setHeight(height);

        System.out.print("Input Width : ");
        float width = input.nextFloat();
        rec.setWidth(width);

        // for triangle
        Scanner in = new Scanner(System.in);

        System.out.print("Input height : ");
        float hheight = in.nextFloat();
        tr.setHeight(hheight);

        System.out.print("Input Width : ");
        float wwidth = in.nextFloat();
        tr.setWidth(wwidth);

        System.out.println("The area of Triangle is : " + tr.area());
        System.out.println("The area of Rectangle is : "+ rec.area());


    }

}
