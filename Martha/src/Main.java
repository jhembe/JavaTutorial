import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        boolean isPrime = true;
        int count=0;

        for(int j=1;j<=13;j++){
            for (int i=1; i<=j;i++){
                if(j%i==0){
                    count++;
                }
            }
            if(count <= 2){
                System.out.println(j + " is Prime");
            }
            else System.out.println(j + " IS NOT Prime");
            count = 0;
        }




    }
}