class Outter{
        static int x =10;
        static int y = 20;

        static class Inner{
            void display(){
                System.out.println(x);
                System.out.println(y);
            }
        }
}

public class StaticInnerClass {
    // are the static members of outer classes
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.innerDisplay();
    }

}
