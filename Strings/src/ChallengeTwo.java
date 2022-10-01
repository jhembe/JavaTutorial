import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Binary Number  : ");
        String binNum = sc.nextLine();

        String binTxt = String.valueOf(binNum);
        System.out.println(binTxt);

        System.out.println( "Is what you entered a binary number : " + binTxt.matches("[01]+"));

        System.out.print("Enter a hexadecimal number : ");
        String hexNum = sc.nextLine();


        System.out.println( "Is what you entered a hexadecimal number : " + hexNum.matches("[0-9A-F]+"));

        System.out.println("Enter a date of format dd/mm/yyy : ");
        String myDate = sc.nextLine();
        System.out.println(myDate.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
//        System.out.println(myDate.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}");



    }
}
