import java.util.Scanner;

public class ChallengeThree {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of a day : ");
        int day = sc.nextInt();

        if(day == 1){
            System.out.println("This is Sunday");
        }
        else if (day == 2) {
            System.out.println("This is monday");
        }
        else if (day == 3) {
            System.out.println("This is Tuesday");
        }
        else if (day == 4) {
            System.out.println("This is Wednesday");
        }
        else if (day == 5) {
            System.out.println("This is Thursday");
        }
        else if (day == 6) {
            System.out.println("This is Friday");
        }
        else if (day == 7) {
            System.out.println("This is Saturday");
        }
        else {
            System.out.println("We've experience some technical Difficulties");
        }

        Scanner wb = new Scanner(System.in);

        System.out.print("Enter a full website url : ");
        String webAddress = wb.nextLine();
        System.out.println(webAddress);
        String webProtocol = webAddress.substring(0,webAddress.indexOf(':'));
//        System.out.println(webProtocol);

//        System.out.println(webAddress.substring(webAddress.indexOf('.')+15));
        String domainExtension = webAddress.substring(webAddress.indexOf('.')+1);

        if(domainExtension.equals("com")){
            System.out.println("It's a commercial Website");
        }
        else if(domainExtension.equals("gov")){
            System.out.println("It's a governmental Website");
        }
        else if(domainExtension.equals("org")){
            System.out.println("It's an organisational Website");
        }
        else if(domainExtension.equals("net")){
            System.out.println("It's a network Website");
        }
        else if (domainExtension.equals("biz")) {
            System.out.println("It's a business Website");
        }
        else{
            System.out.println("We have some technical Difficulties");
        }

//        System.out.println("For the Transfer Protocol\n");

        if(webProtocol.equals("http")){
            System.out.println("The site uses Hypertext transfer protocol");
        }
        else if (webProtocol.equals("https")) {
            System.out.println("The site uses Hypertext transfer protocol secured");
        }
        else if(webProtocol.equals("ftp")){
            System.out.println("The site uses File Transfer Protocol");
        }
        else {
            System.out.println("We have some technical difficulties");
        }
    }
}
