import java.lang.*;

public class PrintingF {
    public static void main(String args[]){
        int a = 20;
        float b = 8.76f;
        char c = 'A';
        String str = "Hello there";

            System.out.printf("Hello\n");
            System.out.printf("Hello %d %f %c World\n",a,b,c);

            // with argument index
            System.out.printf("%1$d ,%2$f, %3$c \n",a,b,c);

            // now we deal with flags
            System.out.printf("%5d \n",a); // the 5 signifies the width of the printed values
            System.out.printf("%05d\n",a); // this contains the flag 0, which keeps the leading zeros on the width
        // for other flags like '-', you can sandwitch it with '(' to show brackets only if the value referenced is -ve
        // for '+', you can use it to show signs of the numbers you're referencing.
            System.out.printf("%22s\n",str);  // by default leaves an empty space from the left.
            System.out.printf("%-20s\n",str); // adding a -ve flag, means you want the words to move to the left align, hence leaves space heading to the right
            
    }
}
