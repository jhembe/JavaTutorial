import java.util.Scanner;

public class Question5 {
    public static float toCelcious(int temp){
        return (5f/9f)*(temp - 32f);
    }

    public static void main(String ...args){
        int temp;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<15; i++){
            System.out.print("Enter the temperature in Fahrenheit : ");
            temp = input.nextInt();
            System.out.println(toCelcious(temp));
        }
        // now printing the results
        System.out.println("All temperatures are processed");
    }
}
