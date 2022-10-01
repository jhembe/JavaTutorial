import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of studets in class : ");
        int noStud = sc.nextInt();

        if(noStud >= 1){
            System.out.println("Hello students !! \uD83E\uDD23");
        }
        else {
            System.out.println("Okay, fine ❤️\u200D\uD83D\uDD25");
        }


    }
}