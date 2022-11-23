public class Main {
    // now I'm going to create a function outside the main method
    static int maxNum(int x, int y){
        if(x>y){
            return x;
        }
        else {
            return y;
        }
    }
    public static void main(String[] args){
        int a=5, b=7, c;
        c = maxNum(a,b);
        System.out.print(c);
    }
}