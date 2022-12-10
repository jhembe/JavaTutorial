import java.util.Scanner;

public class Question2 {
    public static void main(String ...args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade : ");
        char grade = input.nextLine().charAt(0);
//        System.out.println(grade);

        switch (grade){
            case 'A' -> System.out.println("Very Good");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Bad");
        }




    }
}
