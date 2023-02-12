import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Question10 {
    public static void main(String ...args){
        Scanner input = new Scanner(System.in);

        // for mules driven per day
        System.out.print("Enter total miles driven per day : ");
        double milesDriven = input.nextDouble();

        // for cost per gallon of gasoline
        System.out.print("Enter cost per gallon of gasoline : ");
        double gasPrice = input.nextDouble();

        // average miles per fallon
        System.out.print("Enter average miles per gallon : ");
        double milesPerGallon = input.nextDouble();

        // Parking gees per day
        System.out.print("Enter parking fees per day : ");
        double parkingFees = input.nextDouble();

        // tolls per day
        System.out.print("Enter tolls per day : ");
        double tolls = input.nextDouble();

        // now for the total cost of driving to work:
        double totalCost =  (milesDriven/milesPerGallon)*gasPrice + parkingFees+tolls;

        System.out.println("Daily driving cost : " + totalCost);
    }
}
