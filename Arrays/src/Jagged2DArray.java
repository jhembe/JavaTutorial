public class Jagged2DArray {
    public static void main(String[] args){
        // these are non-uniform  2D arrays
        int[][] array;
        array = new int[3][];

        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[3];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("");
        // using for each loop alone


        for(int x[] : array){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }


    }
}
