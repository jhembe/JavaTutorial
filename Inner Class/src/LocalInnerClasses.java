class Outerr{
    void display(){
        class Inner{
            void innerDisplay(){
                System.out.println("Inner Hello");
            }
        }

        Inner in = new Inner();
        in.innerDisplay();
    }
}
public class LocalInnerClasses{

}
