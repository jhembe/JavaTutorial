import java.util.Scanner;

public class ChallengeFIve {
    public static void main(String[] args){
        // Make a menu driven program for arithmetic operations
        Scanner sc = new Scanner(System.in);
        double num1 ,num2 ;
        String operation;

        System.out.println("   MENU");
        System.out.println("1. ADD\n2. SUB\n3. MUL\n4. DIV\n");
        System.out.print("Enter the operation to be performed from the menu : ");
        operation = sc.nextLine();
//        sc.nextLine();
        // now let's take the numbers from the user
        System.out.print("Enter the first Number : ");
        num1 = sc.nextDouble();
        System.out.print("Enter the second Number : ");
        num2 = sc.nextDouble();

        switch (operation){
            case "ADD" -> System.out.println("The sum is : " + (num1+num2));
            case "SUB" -> System.out.println("The Difference is : " + (num1-num2));
            case "MUL" -> System.out.println("The Product is : " + (num1*num2));
            case "Div" -> System.out.println("The Division is : " + (num1/num2));
            default -> System.out.println("An Error Occurred");
        }

    }
}
