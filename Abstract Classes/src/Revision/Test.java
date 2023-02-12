package Revision;

class A{

}
class B extends A{

}
class C extends B{

}
class D extends C{

}

public class Test {
    public static void main(String[] args) {
        A a  = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println(b instanceof D);
        System.out.println(d instanceof A);
        System.out.println(c instanceof B);
        System.out.println(a instanceof C);
        System.out.println(b instanceof B);
    }
}
