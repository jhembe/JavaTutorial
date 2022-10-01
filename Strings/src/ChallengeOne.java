import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Email please : ");
        String email = sc.nextLine();
        int sep = email.indexOf('@');

        String userName = email.substring(0,sep);
        String domainName = email.substring(sep+1);
        System.out.println("Username : " + userName);
        System.out.println("Domain Name : " + domainName);

        System.out.println(email.matches(".*gmail.*"));

        System.out.println(email.indexOf('.'));
        String isGmail = email.substring(sep+1,email.indexOf('.'));
        System.out.println(isGmail.matches("[gmail]*"));
    }
}
