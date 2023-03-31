import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter the numerator : ");
            float numerator = input.nextFloat();

            System.out.print("Enter the denominator : ");
            float denominator = input.nextFloat();

            float result = divide(numerator,denominator);
            System.out.println("Result : " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Error : " + e);
        }
        catch (Exception e){
            System.out.println("Invalid Input : "+e);
        }
    }

    public static float divide(float numerator, float denominator) throws ArithmeticException{
        try{
            return numerator/denominator;
        }
        catch (ArithmeticException e){
            throw e;
        }
    }
}
