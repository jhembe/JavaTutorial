//import java.util.Scanner;

public class FindPrime {
    // in this challenge we have to find a prime number while integrating method concepts within

    // now let's create a function to find prime numbers
    static void findArrayPrime(int[] arr){
        int count=0;

        for(int i=0; i<=arr.length-1; i++){
            count=0;
            for(int j=2; j<= arr[i]; j++){
                if(arr[i]%j == 0){
                    count++;
                }
            }
            if(count <= 2){
                System.out.println("The number "+arr[i]+" is Prime !");
            }
            else System.out.println("The number "+arr[i]+ " is NOT Prime");

        }
    }

    static boolean isPrime(int num){
        int count = 0;
        for(int j=2; j<= num; j++){
            if(num%j == 0){
                count++;
            }
        }
        if(count <= 2){
            return true;
        }
        else return false;
    }

    public static void main(String[] args){
        int[] array = {12,45,32,2,3,7,90,134,23,65};
        int number = 7;

        findArrayPrime(array);

        System.out.println("\nAlso\n");
        System.out.println(isPrime(number));
    }
}
