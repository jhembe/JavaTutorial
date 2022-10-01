import java.util.Scanner;

public class ChallengeOne {
    // Display a multiplication table
    public static void main(String[] args){
        // now let's create a variable
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Multiplication table number : ");
        num = sc.nextInt();
        System.out.println("\n");

        for (int i=1; i<=12; i++){
//            System.out.println(num*i);
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}
