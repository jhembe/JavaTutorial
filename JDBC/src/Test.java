import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);

        System.out.print( "Enter the first name : ");
        String fname = input.nextLine();
        System.out.print("Enter  the last name : ");
        String lname = input.nextLine();
        System.out.print( "enter the phone number : ");
        String pnumber = input.nextLine();


        System.out.println(fname +" "+ lname +" "+ pnumber);
//        System.out.println("First name : "+ fname+ "\nLast name: "+lname+ "\nPhone number: "+ pnumber);
    }
}
