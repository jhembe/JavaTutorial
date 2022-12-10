import java.util.Scanner;

public class Question4 {
    public static void main(String ...args){
        int num1,num2;
        Scanner input = new Scanner(System.in);

        // asking for user's input
        System.out.print("Enter your first Integer : ");
        num1 = input.nextInt();

        System.out.print("Enter your second Integer : ");
        num2 = input.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is Larger");
        }
        else if (num1 == num2) {
            System.out.println("These numbers are Equal");
        }
        else System.out.println(num2 + " is Larger");

        }
    }

