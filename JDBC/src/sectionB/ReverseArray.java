package sectionB;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4}; // 4 3 2 1
        int[] array_copy = new int[4];

        for (int i=array.length-1; i>=0; i--){
            for (int j=0; j<array.length - i;j++){
                array_copy[j] = array[i];
            }
        }
    }
}
