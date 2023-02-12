public class FindGCD {

    static void gcd(int num1,int num2){
        while(num1 != num2){
            if(num1 > num2){
                num1 -= num2;
            }
            else {
                num2 -= num1;
            }
        }
        System.out.println("The GCD IS : "+ num1);

    }

    public static void main(String[] args){
        gcd(25,15);
        gcd(234,236);

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int j : array) {
            System.out.println(j);
        }
    }
}
