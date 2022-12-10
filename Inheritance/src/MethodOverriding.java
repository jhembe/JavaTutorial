class Tv{
    public void switchOn(){System.out.println("TV is switched on");}
    public void changeChannel(){System.out.println("TV channel is changed");}
}

class SmartTv extends Tv{
    @Override
    public void switchOn(){System.out.println("Smart TV is switched on");}
    @Override
    public void changeChannel(){System.out.println("Smart TV channel changed");}
    public void browse(){System.out.println("Smart Tv is browsing");}
}

class Super{
    public void display(){
        System.out.println("Super class display");
    }
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub class display");
    }
}

public class MethodOverriding {
    // redefining the method of super class, in subclass
    public static void main(String[] args) {
        Super su = new Super();
        su.display();

        Sub sb = new Sub();
        sb.display();

        Super sup = new Sub();
        sup.display();

        Tv tv = new Tv();
        tv.changeChannel();
        tv.switchOn();

        SmartTv st = new SmartTv();
        st.browse();
        st.switchOn();
        st.changeChannel();

        Tv ss = new SmartTv();
        ss.switchOn();
        ss.changeChannel();
    }
}
