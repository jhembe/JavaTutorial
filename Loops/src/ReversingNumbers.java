import java.util.Scanner;

public class ChallengeSeven {
    // Reversing a number challenge;
    public static void main(String[] args){
        // let's take our sample number
        int rem;
//        String reversed = "";
        int reversed = 0;
        // let's create a scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to be reversed : ");
        int num = sc.nextInt();

        while(num > 0){
            rem = num % 10;
            num = num / 10;

//            reversed += rem;

            reversed = reversed*10 + rem;
        }
          num = reversed;
//        num = Integer.parseInt(reversed);
        System.out.println("The reversed number is : " + num);
    }
}
