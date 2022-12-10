import java.util.Scanner;

public class Question5 {
    public static void main(String ...args){
        int num1,num2,num3;

        Scanner input = new Scanner(System.in);

        // asking for user's input
        System.out.print("Enter your first Integer : ");
        num1 = input.nextInt();

        System.out.print("Enter your second Integer : ");
        num2 = input.nextInt();

        System.out.println("Enter the third Integer : ");
        num3 = input.nextInt();

        System.out.print("\n");
        System.out.println("The sum is : "+ (num1+num2));
        System.out.println("The Average : "+(float)(num1+num2+num3)/3);
        System.out.println("The Product : "+(num1*num2*num3));
        System.out.println("The smallest : "+ Math.min(num1,num2));
        System.out.println("The largest : "+Math.max(num1,num2));
    }
}
