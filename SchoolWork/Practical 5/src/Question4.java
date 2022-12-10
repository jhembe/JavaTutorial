import java.util.Scanner;

class Rectangle{
    private float length=1,width=1;

    // setters and getters
    void setLength(float length){
        if(this.length < 20.0 && this.length > 0.0){
            this.length = length;
        }
        else{
            System.out.println("Value is out of allowed Range");
        }
    }
    void setWidth(float width){
        if(this.width < 20.0 && this.length > 0.0){
            this.width = width;
        }
        else System.out.println("Value is out of allowed Range");
    }

    float getLength(){return length;}
    float getWidth(){return width;}


    float perimeter(){
        return 2*(length+width);
    }
    float area(){
        return length*width;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle rec = new Rectangle();
        System.out.print("Enter the length : ");
        float length = input.nextFloat();
        rec.setLength(length);
        System.out.print("Enter the width : ");
        float width = input.nextFloat();
        rec.setLength(width);

        System.out.println("The area is : " + rec.area());
        System.out.println("The perimeter is : "+ rec.perimeter());


    }
}
