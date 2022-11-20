public class Rotating1DArrayLeftShift {
    public static void main(String[] args){

        // consider the following array
        int[] array = {5,9,6,10,12,7,3,5,4,2};
        int temp = array[0];

        // start of the for loop for the right shifting of an array
        for(int i=0; i+1 < array.length; i++){
            array[i] = array[i+1];

        }
        array[array.length - 1] = temp;

        // now let's view our array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
