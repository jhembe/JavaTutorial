import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // for 1D  array
        int[] array = new int[100];
        int[][] arrayy = new int[10][10];
        Scanner input = new Scanner(System.in);

        // getting user input
        for(int i=0; i<array.length; i++){
            System.out.println("Enter num : ");
            array[i] = input.nextInt();
        }
        // summation
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("The Sum of all Elements is : " + sum);
        System.out.println("The Average is : "+sum/array.length);

        // for 2D
        // for entering the values
        for(int i = 0; i<arrayy.length; i++){
            for(int j=0; j<arrayy[0].length;j++){
                arrayy[i][j] = input.nextInt();
            }
        }
        // for it's sum
        int summ = 0,count = 0;
        for(int i = 0; i<arrayy.length; i++){
            for(int j=0; j<arrayy[0].length;j++){
                summ = arrayy[i][j];
                count++;
            }
        }
        System.out.println("The Sum of all Elements is : " + summ);
        System.out.println("The Average is : "+summ/count);


    }
}
