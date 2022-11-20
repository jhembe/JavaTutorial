public class Rotating1DArrayRightShift {
    public static void main(String[] args){

        // consider the following array
        int[] array = {5,9,6,10,12,7,3,5,4,2};
        int temp = array[array.length - 1];

        // now let's get on with the array for right shifting
        for(int i = 0; i+1 < array.length; i++){
            array[i+2] = array[i+1];
        }
        array[0] = temp;
    }
}
