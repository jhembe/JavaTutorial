public class InsertingAnArray1D {
    public static void main(String[] args){

        // now we have to initialize an array with free space
        int[] array= new int[10];
        array[0] = 5;
        array[1] = 9;
        array[2] = 6;
        array[3] = 10;
        array[4] = 12;
        array[5] = 7;
        int n = 6;
        int index = 2;
        int x = 20;

        for(int i = n; i > index; i--)
            array[i] = array[i-1];
        array[index] = x;

        for( int i : array){
            System.out.print(array[i] + " ");
        }
    }
}
