import java.util.Scanner;

public class SumOf_n_Numbers {
    // Find Sum of n Numbers
    public static void main(String[] args){

        // now let's initialise and ask the user for the input
        Scanner sc=new Scanner(System.in);

        int n, sum=0;
        System.out.println("Enter the number you want : ");
        n = sc.nextInt();

        for (int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("The sum of the numbers is : " + sum);
    }
}
