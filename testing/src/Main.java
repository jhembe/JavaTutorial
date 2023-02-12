public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int count=0;
        // starting for loop
        for(int j = 0; j<array.length; j++){
           //checking for prime
            for(int i = 1; i<=array[j]; i++){
                if(array[j]%i == 0){
                    count++;
                }

            }
            if(count<=2){
                System.out.println(array[j] + " is Prime ");
            }
            else System.out.println(array[j] + " is NOT Prime ");
            count = 0;
        }
    }
}