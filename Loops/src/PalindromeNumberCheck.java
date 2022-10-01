import java.util.Scanner;

public class ChallengeEight {
    // checking for a palindrome number
    public static void main(String[] args){
        // Banner Message //
        System.out.println("****** PALINDROME CHECKER ******\n");

        // variable declaration
        int rem, reversed = 0;

//        let's create a user input object;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to check for Palindrome : ");
        int num0riginal = scan.nextInt();
        int num = num0riginal;


        while(num > 0){
            rem = num%10;
            num = num/10;

            reversed = reversed*10 + rem;
        }

        if (num0riginal == reversed) {
            System.out.println("The number " + num0riginal  + " is a palindrome number\n");
        }
        else{
            System.out.println("The number " + num0riginal + " is not a Palindrome Number\n");
        }

        // Banner Message //
        System.out.println("****** PALINDROME CHECKER ******");
    }
}
