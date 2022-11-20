public class SecondLargestNum1DArrayAlt {
    // we have a task to find the second-largest number in array
    public static void main(String[] args){
        // let's create a sample array
        int[] array = {14,56,63,58,96,57};

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
