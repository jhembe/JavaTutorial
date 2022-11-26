public class OverloadReversing {
    //Here we'll apply method overloading in Integer reversing and array reversing

    // for integer reversing
    static void reverse(int num){
        // using while loop
        int reversed = 0;
        while(num > 0){
            int rem = num%10;
            reversed = reversed*10 + rem;
            num = num/10;
        }
        System.out.println(reversed);

    }

    // for the array inversing
    static int[] reverse(int[] array){
        // we need an array to copy values to
        int[] arrayCopy = new int[array.length];
        // driving loop
        for(int i=array.length-1,j=0; i>=0; i--,j++){
            arrayCopy[j] = array[i];
        }
        return arrayCopy;
    }

    public static void main(String[] args){

        int[] arr = {23,34,5,4,6,722};
        System.out.println(reverse(arr)); // returns the address of an array

        for(int x:reverse(arr)){
            System.out.print(x + " ");
        }
    }
}
