import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args){
//        System.out.println("Hello world");
        int a,b,c;
        double r1,r2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficient 'a' : ");
        a = sc.nextInt();

        System.out.println("Enter the coefficient of 'b' : ");
        b = sc.nextInt();

        System.out.println("Enter the constant value 'c' : ");
        c = sc.nextInt();

        // now for the main formula for finding roots of the equation
//        sqrt(5);

//        double sqrt = sqrt(b*b - 4 * a * c);
//        System.out.println(sqrt);

        r1 = (-b + sqrt(b*b - 4*a*c))/(2*a);
        r2 = (-b - sqrt(b*b - 4*a*c))/(2*a);

        System.out.println("The first root R1 = "+r1);
        System.out.println("THe second root R2 = "+r2);

    }
}
