import java.lang.*;

class Variables{
	public static void main(String args[]){

		byte b=127;
		short s=300;
		int i=298339454;

		float f = 25.3f;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);

		for(char c=0x0370; c<=0x3FF; c++)
			System.out.print(c+" ");
	}
}
