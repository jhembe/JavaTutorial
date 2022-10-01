import java.util.Scanner;

public class ChallengeFour {
    // Displaying digits of a number
    public static void main(String[] args){
        // now let's take our little int digs

        // creating a scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be reversed : ");
        int num = sc.nextInt();
        int rem = 1;

        while(num > 0){
            rem = num%10;
            num = num/10;
            System.out.print(rem + "");
        }



    }
}
