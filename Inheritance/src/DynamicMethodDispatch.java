class Superr{
    void meth1(){
        System.out.println("meth1");
    }
    void meth2(){
        System.out.println("meth2");
    }
}

class Subb extends Superr{
    @Override
    void meth2(){
        System.out.println("Sub meth2");
    }
    void meth3(){
        System.out.println("meth3");
    }
}
public class DynamicMethodDispatch {
    // it is used for achieving runtime polymorphism using method overriding
    public static void main(String[] args) {
        Superr sup = new Superr();
        sup.meth1();
        sup.meth2(); // runtime polymorphism
    }
}
