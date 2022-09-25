public class IncrementDecrement {
    public static void main(String[] args){
        int  x=5,y,z;
        char m = 'A';
        m++;

        y = x++;
        z = ++x;

        System.out.println("for Y : " + y);
        System.out.println("for x : " + x);
        System.out.println("for z : " + z);
        System.out.println("for m : " + m);
    }
}
