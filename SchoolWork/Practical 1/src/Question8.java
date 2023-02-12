import java.util.Scanner;

public class Question8 {
    public static void main(String ...args){

        Scanner scanner = new Scanner(System.in);
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for(int i = 1; i<=5; i++){
            System.out.print("Enter a number : ");
            int num = scanner.nextInt();
            if(num < 0){
                negativeCount++;
            }
            else if(num > 0){
                positiveCount++;
            }
            else{
                zeroCount++;
            }

        }

        System.out.println("Number of negatives : " + negativeCount);
        System.out.println("Number of positives : " + positiveCount);
        System.out.println("Number of zeros : " + zeroCount);
    }
}
