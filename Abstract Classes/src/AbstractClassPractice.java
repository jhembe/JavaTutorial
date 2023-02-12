abstract class Super{
    public Super(){
        System.out.println("Super Constructor");
    }
    public void meth1(){
        System.out.println("Meth of super class");
    }
    abstract void meth2();
}

class Sub extends Super{
    @Override
    void meth2(){
        System.out.println("meth2 of Sub Class");
    }
}


public class AbstractClassPractice {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth2();
    }
}
