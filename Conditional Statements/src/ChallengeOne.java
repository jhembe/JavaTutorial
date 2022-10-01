import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number on the console : ");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("The number "+num+ " is Even");
        }
        else{
            System.out.println("The number " + num + " is odd");
        }

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age >= 0 && age <= 39){
            System.out.println("You are young");
        }
        else{
            System.out.println("You are old ");
        }

        // average of 3 marks
        System.out.println("Enter marks for your three subjects ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        float average = (m1+m2+m3)/3;

        if(average >= 75){
            System.out.println("You scored grade A ");
        }
        else if(average >= 0 && average <= 39){
            System.out.println("You scored grade F");
        }
        else if(average >= 40 && average <= 54){
            System.out.println("You scored grade D");
        }
        else if(average >= 55 && average <= 64){
            System.out.println("You scored grade C");
        }
        else if(average >=65 && average <= 74){
            System.out.println("You scored grade B");
        }
        else {
            System.out.println("We've got some technical difficulties");
        }

    }
}
