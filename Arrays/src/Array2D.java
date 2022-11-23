public class Array2D {
    public static void main(String[] args){
        // initialization / syntax of an array
        int [][]array = new int[3][4]; // method 1

        int [][]array2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i][j] + "    ");
            }
            System.out.print("\n");
        }

        // using for each loop
        for(int x[]: array2){
            for(int y:x){
                System.out.print(array2[y]);
            }
        }
    }
}
