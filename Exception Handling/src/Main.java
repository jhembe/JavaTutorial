import java.util.Scanner;

public class Main {
    // they're caused at the user's end
    // Runtime errors means that the program will stop

    // cause 1. Bad input, 2. Unavailability of resources

    // what to do ??
    // inform the user about the error !! using a message printout, or guide
    // now that can be done by exception handling


    /*
    consider this:
    1. Syntax Errors -- solved with the compiler
    2. Logical Errors -- solved with tracing or debuging
    3. Runtime Error -- Exception Handling
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // for user input
        System.out.print("Enter the number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the divisor : ");
        int num2 = input.nextInt();


        try {
            int ans = num1/num2;
            System.out.println("Result is : " + ans);
        }
        catch (ArithmeticException e){
            System.out.println("Division by Zero = " + e);
        }


        // now let's learn about multiple cache block
        // using array
        try{
            int[] array = {10,3,4,0,76,0};
            int r = array[0]/array[3];

            // now let's make an array out of bound error
            System.out.println(r);
            System.out.println(array[12]);
        }
        catch (ArithmeticException e){
            System.out.println("Division by Zero = " + e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound = " + e);
        }

    }
}