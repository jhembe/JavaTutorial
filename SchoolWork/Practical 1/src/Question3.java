import java.util.Scanner;

public class Question3 {
    public static void main(String ...args){
        int num1,num2;
        Scanner input = new Scanner(System.in);

        // asking for user's input
        System.out.print("Enter your first Integer : ");
        num1 = input.nextInt();

        System.out.print("Enter your second Integer : ");
        num2 = input.nextInt();

        System.out.print("\n");
        System.out.println("The sum is : "+ (num1+num2));
        System.out.println("The Difference is :"+ Math.abs(num1-num2));
        System.out.println("The Product is : "+ num1*num2);
        System.out.println("The Quotient is : " + num1/num2);
    }
}
