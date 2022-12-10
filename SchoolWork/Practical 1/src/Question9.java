import java.util.Scanner;

public class Question9 {
    public static void main(String ...args){
        // initializing variables
        int weight;
        float height,bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in Kilograms : ");
        weight = input.nextInt();
        System.out.print("Enter your height in meters : ");
        height = input.nextFloat();

        bmi = (float)(weight)/(height*height);

        System.out.println("Your Body Mass Index is : " + bmi+"\n");
        System.out.println("""
                   Underweight: less than 18.5
                   Normal:      between 18.5 and 24.9
                   Overweight:  between 25 and 29.9
                   Obese:       30 or greater
                """);
    }
}
