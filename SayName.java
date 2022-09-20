import java.lang.*;
import java.util.*;

class SayName{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String name;

		System.out.println("What's your name ? ");
		name = s.nextLine();
		System.out.println("Welcome" + " " + name);
	}
}
