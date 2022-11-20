import java.util.Scanner;

public class sumArray1D {

    public static void main(String[] args){
        // in this challenge we're going to find the sum of all elements in the array
        // let's prompt the user to enter his own elements
        int lenArray;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to enter : ");
        lenArray = input.nextInt();

        int[] array = new int[lenArray];

        // let's create a loop to enter those elements on user's demand
        for(int i = 0; i<array.length; i++){
            System.out.print("Enter the next num : ");
            array[i] = input.nextInt();
        }
        // now let's print out the entered array if it works fine
        System.out.print("The entered array is : ");
        for (int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        // now for the sum of the elements
        for( int i = 0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("\nThe sum of the elements in the array is : " + sum);
    }
}
