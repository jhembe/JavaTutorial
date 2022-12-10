import java.util.Scanner;

public class Question3{
    static int fact = 1;
    static int num;

    // using for loop

    public static void getNum(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        num = input.nextInt();

        forFactorial();
        fact = 1;
        whileFactorial();
        fact = 1;
        dowhileFactorial();
    }

    public static void forFactorial(){
        for(int i = num; i>0; i--){
            fact = fact*i;
        }
        System.out.println(num+"! = "+fact);
    }

    public static void whileFactorial(){
        int i=num;
        while(i>0){
            fact = fact*i;
            i--;
        }
        System.out.println(num+"! = "+fact);
    }

    public  static void dowhileFactorial(){
        int j = num;
        do{
            fact = fact * j;
            j--;
        }while (j>0);
        System.out.println(num+"! = "+fact);
    }
    public static void main(String ...args){
        getNum();
    }
}
