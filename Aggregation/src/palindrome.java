public class palindrome {
    public static void main(String[] args) {

        int num = 454;
        int sum = 0;
        int rem;
        int temp = num;

        while(num>0){
            rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        if(temp == sum){
            System.out.println(temp + " is a Palindrome");
        }
        else{
            System.out.println(temp + " Is not a palindrome");
        }
    }
}
