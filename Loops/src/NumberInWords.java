import java.util.Scanner;

public class ChallengeNine {
    // Displaying numbers in words
    public static void main(String[] args){
        // Challenge Banner
        System.out.println("******** NUMBER SPELLER ******** \n");

        // let's take a sample number'
        int rem;
        // let's create scanner object
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to be spelled : ");
        int num = scan.nextInt();


        String stringNumber = "";

        while(num > 0){
            rem = num % 10;
            num = num / 10;

            stringNumber =  stringNumber + rem;
        }
        // System.out.println(stringNumber);

        // now let's traverse through the string number
        for(int i = stringNumber.length() - 1 ; i >= 0; i--){
        // stringNumber.charAt(i);
        // System.out.println(stringNumber.charAt(i));

            switch (stringNumber.charAt(i)) {
                case '1' -> System.out.print("one ");
                case '2' -> System.out.print("two ");
                case '3' -> System.out.print("three ");
                case '4' -> System.out.print("Four ");
                case '5' -> System.out.print("Five ");
                case '6' -> System.out.print("Six ");
                case '7' -> System.out.print("seven ");
                case '8' -> System.out.print("eight ");
                case '9' -> System.out.print("nine ");
                case '0' -> System.out.print("zero ");
                default -> System.out.println("Try Again Later");
            }
        }
        System.out.println("\n");
        System.out.println("******** NUMBER SPELLER ******** \n");

    }
}
