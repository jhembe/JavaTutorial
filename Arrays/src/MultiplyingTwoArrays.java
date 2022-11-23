public class MultiplyingTwoArrays {
        public static void main(String[] args){

            // now let's create our first 2D array, let's make it a 3 by 3 matrix
            int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
            int[][] array2 = {{10,11,12},{13,14,15},{16,17,18}};
            int[][] arrayProduct = new int[3][3];


            for(int i=0; i<array1.length; i++){
                for(int j=0; j < array1[i].length; j++){
                    for(int k=0; k < array1.length; k++){
                        arrayProduct[i][j] = arrayProduct[i][j] + array1[i][k] * array2[k][j];

                    }
                }
            }

            // printing the multiplied array
            for(int i = 0; i < arrayProduct.length; i++){
                for(int j=0; j < arrayProduct[i].length; j++){
                    System.out.print(arrayProduct[i][j] + " ");
                }
                System.out.print("\n");
            }

        }



}
