public class MaxElement1DArray {
    public static void main(String[] args){
        // the task here is to find the maximum number
        int maxNum;
        // now we create a manual array
        int[] array = {34,23,57,14,5,80,65};
        maxNum = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > maxNum){
                maxNum = array[i];
            }
        }
        System.out.println(maxNum);
    }
}
