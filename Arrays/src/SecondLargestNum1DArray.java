public class SecondLargestNum1DArray {
    // we have a task to find the second-largest number in array
    public static void main(String[] args){
        // let's create a sample array
        int[] array = {14,56,63,58,96,57};
        int temp;
        for(int j = 0; j < array.length; j++){
            for(int i = 0; i+1 < array.length; i++){
                if(array[i] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


        // for the largest integer
        System.out.println("\nThe largest number is : " + array[0]);
        // for the second-largest integer
        System.out.println("The second largest number is : " + array[1]);


        int max1,max2;
        max1 = max2 = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max1){
                max2 = max1;
                max1 = array[i];
            }
            else if(array[i] > max2) {
                max2 = array[i];
            }
        }
        System.out.println("\nThe largest number is : " + max1);
        System.out.println("The second largest number is : " + max2);
    }
}
