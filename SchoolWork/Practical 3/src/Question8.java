import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        Scanner input = new Scanner(System.in);

        // for entering the values
        for(int i = 0; i<array.length; i++){
            for(int j=0; j<array[0].length;j++){
                array[i][j] = input.nextInt();
            }
        }
        // for printing out the values entered
        for(int i = 0; i<array.length; i++){
            for(int j=0; j<array[0].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
