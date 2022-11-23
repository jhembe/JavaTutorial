import java.math.*;

public class AddingTwoMatrices {
    // in this exercise, we're focusing on adding up two-dimensional matrices together
    public static void main(String[] args){

        // now let's create our first 2D array, let's make it a 3 by 3 matrix
        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{10,11,12},{13,14,15},{16,17,18}};
        int[][] arrayTotal = new int[3][3];
        int[][] arrayProduct = new int[3][3];

        // to add this, I'll need a driving loop
        for(int i=0; i<array1.length; i++){
            for(int j=0; j < array1[i].length; j++){
                arrayTotal[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // let's write another loop to print out the added array
        for(int[] x : arrayTotal){
            for(int y:x){
                System.out.print(y+"   ");
            }
            System.out.print("\n");
        }

        for(int i=0; i<array1.length; i++){
            for(int j=0; j < array1[i].length; j++){
                for(int k=0; k < array1.length; k++){
                    arrayTotal[i][j] = arrayTotal[i][j] + array1[i][k] * array2[k][j];

                    }
                }
            }

        // printing

        }




    }

