package sectionB;
import java.util.Scanner;

class CiveException extends Exception{
    @Override
    public String toString(){
        return "Electorate is less than 18";
    }
}


public class AgeValidator {
    public static void ageValidator(int age) throws CiveException{
        if(age < 18){
            throw new CiveException();
        }
        else {
            System.out.println("Valid");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter your age : ");
            int age = input.nextInt();

            ageValidator(age);
        }
        catch (CiveException e){
            System.out.println(e.toString());
        }

    }

}
