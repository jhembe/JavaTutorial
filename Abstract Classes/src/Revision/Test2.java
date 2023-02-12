package Revision;

public class Test2 {
    int a,b;

    public void method(int a,int b){
        this.a  = a;
        this.b = b;
    }

    public static void main(String ...args){
        Test2 t = new Test2();
        t.method(45,34);

    }
}
