import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Question10 {
    public static void main(String ...args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Total Miles driven per day : ");
        float nMiles = input.nextFloat();
        System.out.println("Enter the average miles per gallon  : ");
        float milePerGallon = input.nextFloat();
        System.out.println("Enter your parking gees per day : ");
        int parkingFeesPerDay = input.nextInt();
        System.out.println("Enter the average tolls per day : ");
        int numTollsPerDay = input.nextInt();

        float totalCost = (nMiles * milePerGallon) + parkingFeesPerDay + numTollsPerDay;
    }
}
