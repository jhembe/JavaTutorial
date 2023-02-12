abstract class My{
    abstract void display();
}

class Ouuter{
    public void meth(){
        My m = new My(){
            public void display(){
                System.out.println("Hello");
            }
        };
        m.display();
    }
}

public class AnonymousClasses {
    // these are the ones defined at the time of creation
    // useful for interfaces and abstract classes

}
