import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        String num = sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("This is a binary with Radix=2");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("This is a Hexadecimal with Radix=16 ");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("This is an Octal with Radix=8 ");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("This is a decimal with Radix=10 ");
        }
        else {
            System.out.println("We encountered some technical difficulties");
        }

        // now let's find if a year is leap or not

        System.out.println("Enter a year in format yyyy");
        int year = sc.nextInt();

        if (year%4 == 0){
            System.out.println("You've entered a leap year");
        }
        else{
            System.out.println("That's not a leap year");
        }
    }
}
