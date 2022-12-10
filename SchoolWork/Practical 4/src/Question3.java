import java.util.Scanner;

public class Question3 {
    static void addition(int a, int b){
        System.out.println(a+b);
    }

    static void myMethod(String title){
        System.out.println(title);
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = input.nextInt();
        System.out.print("Enter the second number : ");
        int b = input.nextInt();

        myMethod("Adding two integers");
        addition(a,b);
    }
}
