class Outer {
    int x = 10;

    static class Inner{
        int y=20;

        void innerDisplay(){
            System.out.println(x + " " + y);
        }
    }

    void outerDisplay(){
        Inner in = new Inner();
        in.innerDisplay();
        System.out.println(in.y);
    }
}

public class NestedClasses{
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerDisplay();

        // for an object of inner class
        Outer.Inner outin = new Outer().new Inner();
        outin.innerDisplay();
    }
}


