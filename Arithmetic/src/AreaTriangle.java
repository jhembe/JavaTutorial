import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaTriangle {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        float height, base, area,exp;
        float a,b,c,s;

//        System.out.println("Enter the base of the triangle : ");
//        base = sc.nextFloat();
//
//        System.out.println("Enter the height of the triangle : ");
//        height = sc.nextFloat();
//
//        area = 0.5f * (base*height);
//
//        System.out.println("The area of the triangle is : " +area);

        System.out.println("Enter the length of side a : ");
        a = sc.nextFloat();

        System.out.println("Enter the length of side b : ");
        b = sc.nextFloat();

        System.out.println("Enter the length of side c : ");
        c = sc.nextFloat();

        s = (a+b+c)/2f;
        exp = (s*(s-a)*(s-b)*(s-c));
        area = (float) sqrt(exp);

        System.out.println("The area of the triangle is : " + area );

    }
}
