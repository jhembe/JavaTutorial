import java.util.Scanner;

public class APSeries {
    // Displaying an Arithmetic progression serries
    public static void main(String[] args){
        // Let's initialise important variables
        int startNum,commonDifference, numTerms;
        // let's create a scanner object
        Scanner scan = new Scanner(System.in);

        // let's get user input from the keyboard
        System.out.print("Enter your Starting number : ");
        startNum = scan.nextInt();

        System.out.print("Enter the common difference : ");
        commonDifference = scan.nextInt();

        System.out.print("Enter the number of terms you need : ");
        numTerms = scan.nextInt();

        // getting into the logic. we know how many times to loop. Using for loop
        for(int i=1; i<=numTerms; i++){
            System.out.print(startNum + " ");
            startNum = startNum + commonDifference;
        }
    }
}
