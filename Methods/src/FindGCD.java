public class FindGCD {

    static void gcd(int num1,int num2){
        while(num1 != num2){
            if(num1 > num2){
                num1 -= num2;
            }
            else if(num2 > num1){
                num2 -= num1;
            }
        }
        System.out.println("The GCD IS : "+ num1);

    }

    public static void main(String[] args){
        gcd(25,15);
        gcd(234,236);
    }
}
