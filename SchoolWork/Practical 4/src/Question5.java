public class Question5 {

    static void addition(int a,int b){
        System.out.println(a+b);
    }
    static void addition(double a,double b){
        System.out.println(a+b);
    }
    static void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void addition(String s1,String s2){
        System.out.println(s1+" "+s2);
    }

    public static void main(String[] args) {
        addition(4,5);
        addition(4.2,56.8);
        addition(4,3,6);
        addition("Hello","there");
    }
}
