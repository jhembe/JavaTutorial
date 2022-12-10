import java.util.Scanner;

public class Question1 {
    public static void main(String ...args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the mark : ");
        int marks = input.nextInt();

        if(marks >= 0 && marks < 40){
            System.out.println("Grade : C");
        }
        else if (marks >= 40 && marks < 70){
            System.out.println("Grade : B");
        }
        else if(marks >= 70 && marks <= 100){
            System.out.println("Grade : A");
        }
        else if(marks > 100 && marks < 0){
            System.out.println("Mark entered is out of Bound");
        }
    }
}
