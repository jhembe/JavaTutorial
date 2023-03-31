package Mwamvua;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students : ");
        int numStudents = input.nextInt();

        int[] marksArray = new int[numStudents];

        for(int i=0; i<marksArray.length; i++){
            System.out.println("Enter mark for student "+i+1+" ");
            int mark = input.nextInt();

            if(mark > 100 || mark < 0){
                System.out.println("Invalid Input");
                break;
            }
            else{
                marksArray[i] = mark;
            }
        }
        for(int i = 0; i<marksArray.length;i++){
            System.out.print(marksArray[i] + "  ");
        }

    }
}
