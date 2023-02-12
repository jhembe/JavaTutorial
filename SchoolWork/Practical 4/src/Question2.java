public class Question2 {

    static void addition(int a, int b){
        System.out.println(a+b);
    }

    static void myMethod(String title){
        System.out.println(title);
    }

    public static void main(String[] args) {
        myMethod("Adding two integers");
        addition(4,6);
    }
}
