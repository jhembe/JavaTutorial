import java.util.Scanner;

public class ChallengeSix {
    // find if the number is armstrong or not !!
    public static void main(String[] args){

        // let's take a sample integer to test
        int num,rem, sum = 0;
        // let's create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Testing : ");
        int numOriginal = sc.nextInt();
//        System.out.println(numOriginal);
        num = numOriginal;


        while(num > 0){
            rem = num%10;
            num = num/10;
            sum = sum + (rem*rem*rem);
        }
        if (sum == numOriginal) {
            System.out.println("The number " + sum + " is an Armstrong number ");
        }
        else {
            System.out.println("The number entered is not an Armstrong number ");
        }
    }
}
