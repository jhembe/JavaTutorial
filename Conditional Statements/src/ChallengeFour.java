import java.util.Scanner;

public class ChallengeFour {
    public static void main(String[] args){

        // display name of a day based on it's number
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of the day : ");
        int dayNum = sc.nextInt();

        switch (dayNum){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
        }

        // Display name of the month based on number

        System.out.print("Enter the number of the month : ");
        int dayMonth = sc.nextInt();

        switch (dayMonth){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }

        // Display the type of website

        Scanner wb = new Scanner(System.in);
        System.out.print("Enter a website URL : ");
        String webUrl = wb.nextLine();

        String domainExtension = webUrl.substring(webUrl.lastIndexOf('.')+1);
//        System.out.println(domainExtension);

        switch (domainExtension){
            case "org" -> System.out.println("It's an organizational Website");
            case "com" -> System.out.println("It's a commercial Website");
            case "net" -> System.out.println("It's a networking website");
            case "site" -> System.out.println("It's a basic Website");
            case "biz" -> System.out.println("It's a business Website");
            case "gov" -> System.out.println("It's a governmental Website");
            default -> System.out.println("We got an error. !! sorry");
        }
    }
}
