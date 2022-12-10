import java.util.Scanner;

public class Question6 {
    public static void main(String  ...args){
        int radius;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        radius = input.nextInt();
//        float circumference = (float)(2*Math.PI*radius);

        System.out.println("The diameter : "+(float)(2*radius));
        System.out.println("The Circumference is : "+(float)(2*Math.PI*radius));
        System.out.println("The Area is : "+(float)(Math.PI*radius*radius));

    }
}
