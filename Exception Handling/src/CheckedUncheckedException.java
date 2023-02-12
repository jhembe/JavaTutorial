import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.spec.ECField;

public class CheckedUncheckedException {
//    static void fun1(){
//        try{
//            System.out.println(10/0);
//        }
//        catch (Exception e){
////            System.out.println(e.prin);
//            System.out.println(e);
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//
//    }

    static void fun1(){
        try {
            FileInputStream file = new FileInputStream("My.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
