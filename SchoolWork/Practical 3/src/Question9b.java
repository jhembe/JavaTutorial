import java.util.Scanner;
public class Question9b{
    public static void main(String[] args){
        int elem[][]=new int[10][10];
        float average;
        int sum=0,temp1;
        int temp[]=new int[100];

        Scanner data=new Scanner(System.in);
        System.out.println("Enter 100 integers:");

        for (int[] elem1 : elem) {
            for (int j = 0; j < elem1.length; j++) {
                elem1[j] = data.nextInt();
            }
        }

        for (int[] elem1 : elem) {
            for (int j = 0; j < elem1.length; j++) {
                sum = sum + elem1[j];
            }
        }

        average=sum/100.0f;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
        System.out.println("In ascending order: ");
        int l=0;

        for (int[] elem1 : elem) {
            for (int j = 0; j < elem1.length; j++) {
                    temp[l]=elem1[j];
                    l++;
            }
        }

        for(int i=0;i<temp.length;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[i]>temp[j]){
                    temp1=temp[i];
                    temp[i]=temp[j];
                    temp[j]=temp1;
                }
            }
        }

        l=0;
        for(int i=0;i<elem.length;i++){
            for(int j=0;j<elem[i].length;j++){
                elem[i][j]=temp[l];
                l++;
            }
        }


        for(int elem1[]:elem){
            for(int j=0;j<elem1.length;j++){
                System.out.print(elem1[j]+"\t");
            }
            System.out.println();
        }

        System.out.println("In descending order: ");
        l=0;
        for (int[] elem1 : elem) {
            for (int j = 0; j < elem1.length; j++) {
                    temp[l]=elem1[j];
                    l++;
            }
        }
        for(int i=0;i<temp.length;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[i]<temp[j]){
                    temp1=temp[i];
                    temp[i]=temp[j];
                    temp[j]=temp1;
                }
            }
        }


        l=0;
        for(int i=0;i<elem.length;i++){
            for(int j=0;j<elem[i].length;j++){
                elem[i][j]=temp[l];
                l++;
            }
        }

        for(int elem1[]:elem){
            for(int j=0;j<elem1.length;j++){
                System.out.print(elem1[j]+"\t");
            }
            System.out.println();
        }
    }
}

