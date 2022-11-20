import java.util.Scanner;

public class SearchElement1DArray {
    // in this challenge, we're going to search for an element within an array
    public static void main(String[] args){
        // now let's create our variables
        int key=0;

        // now creating our input object
        Scanner input = new Scanner(System.in);

        // user prompt start
        System.out.print("Enter the element you're searching for : ");
        key = input.nextInt();

//        System.out.println(key);
        // now let's create our manual array
        int[] array = {10,34,47,8,96,47};

        boolean isFound = false;
        // now we create a loop purposely for traversing
        for(int i = 0; i < array.length; i++){
            if(key == array[i]){
                System.out.println("The element "+key+" is found at location " + i );
                System.exit(0);
            }
        }
        if(isFound == false){
            System.out.println("The element entered isn't present in the array ");
        }


    }
}
