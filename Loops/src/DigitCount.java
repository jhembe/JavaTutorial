import java.util.Scanner;

public class ChallengeFive {
    // Counting digits of a number
    public static void main(String[] args){
        // let's create a sample case integer
        int rem=1, count=0;
        // let's create user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be counted : ");
        int num = Integer.parseInt(sc.nextLine());


        while(num > 0){
//            rem = num%10;
            num = num/10;
            count++;
        }
        System.out.println("There are " +count+" Digits ");

    }
}
