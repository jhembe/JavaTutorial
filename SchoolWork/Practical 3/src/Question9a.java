import java.util.Scanner;
public class Question9a{
    public static void main(String[] args) {
        int elem[]=new int[100];
        float sum=0.0f,average;
        int temp;

        Scanner data=new Scanner(System.in);
        System.out.println("Enter 100 numbers:");

        for(int i=0;i<elem.length;i++){

            elem[i]=data.nextInt();
        }

        for(int i=0;i<elem.length;i++){
            sum=sum+elem[i];
        }

        average=sum/100.0f;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);

        for(int i=0;i<elem.length;i++){
            for(int j=i+1;j<elem.length;j++){
                if(elem[i]>elem[j]) {
                    temp=elem[i];
                    elem[i]=elem[j];
                    elem[j]=temp;
                }
            }
        }


        System.out.println("The elements of the array in ascending order are:");

        for(int i=0;i<elem.length;i++){
            System.out.printf("%d\n", elem[i]);
        }

        for(int i=0;i<elem.length;i++){
            for(int j=i+1;j<elem.length;j++){
                if(elem[i]<elem[j]){
                    temp=elem[i];
                    elem[i]=elem[j];
                    elem[j]=temp;
                }
            }
        }

        System.out.println("The elements of the array in descending order are:");
        for(int i=0;i<elem.length;i++){
            System.out.printf("%d\n", elem[i]);
        }
    }
}

