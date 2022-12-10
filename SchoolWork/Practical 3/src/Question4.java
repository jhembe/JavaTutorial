import java.util.Scanner;

public class Question4 {
    public static void main(String ...args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String custName = input.nextLine();

        System.out.print("Enter your purchase amount : ");
        int purchaseAmount = input.nextInt();

        System.out.print("Enter tax code : ");
        int taxCode = input.nextInt();
        System.out.print("\n");

        System.out.println("Customer Name : "+custName);
        System.out.println("Purchase Amount : "+purchaseAmount);

        switch (taxCode){
            case 0 -> System.out.println("Sales Tax : " + (0.00*purchaseAmount)+"\nTotal Amount due : "+ (purchaseAmount));
            case 1 -> System.out.println("Sales Tax : " + (0.03*purchaseAmount)+"\nTotal Amount due : "+ (purchaseAmount+(0.03*purchaseAmount)));
            case 2 -> System.out.println("Sales Tax : " + (0.05*purchaseAmount)+"\nTotal Amount due : "+ (purchaseAmount+(0.05*purchaseAmount)));
            case 3 -> System.out.println("Sales Tax : " + (0.03*purchaseAmount)+"\nTotal Amount due : "+ (purchaseAmount+(0.07*purchaseAmount)));
        }
        }



    }

