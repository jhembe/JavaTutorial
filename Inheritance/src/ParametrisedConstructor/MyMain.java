package ParametrisedConstructor;

abstract class Bank{
    abstract int getInterestRate();
}

class NMB extends Bank{
    int getInterestRate(){
        return 5;
    }

    void sayHello(){
        System.out.println("Hello there");
    }

}


public class MyMain {
    public static void main(String[] args) {
        NMB b1 = new NMB();

    }
}
