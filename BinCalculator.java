import java.lang.*;
import java.util.*;

class BinCalculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		sc.useRadix(2);

		int num=sc.nextInt();
		System.out.println("The binary is : " + num);
	}
}
