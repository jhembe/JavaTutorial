import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ranging from 1-3 : ");
        int n = sc.nextInt();

        if(n == 1){
            System.out.println("one");
        }
        else if(n == 2){
            System.out.println("Two");
        }
        else  if(n == 3){
            System.out.println("Three");
        }
        else {
            System.out.println("error");
        }

        // using switch case
//        switch (n){
//            case 1 : System.out.println("one");
//                        break;
//            case 2 : System.out.println("Two");
//                        break;
//            case 3 : System.out.println("Three");
//                        break;
//            default:
//                System.out.println("Error");
//                        break;
//        }
        System.out.println("Enter a string name : ");
        String name = sc.nextLine();

        switch (n){
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Error");
        }

        switch (name){
            case "Joseph" -> System.out.println("Joseph");
            case "Tina" -> System.out.println("Tina");
            case "Amani" -> System.out.println("Amani");
            case "Philomena" -> System.out.println("Philomena");
            case "Success" -> System.out.println("Success");
            default -> System.out.println("Error");
        }
    }
}
