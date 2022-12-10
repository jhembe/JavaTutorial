import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        int[] array = new int[20];
        Scanner input = new Scanner(System.in);

        // using normal for loop
        for(int i=0; i<array.length; i++){
            System.out.print("Enter and integer : ");
            array[i] = input.nextInt();
        }
        // printing
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }

        // using enhanced for loop
        for(int x:array){
            System.out.print(x+" ");
        }
    }
}
