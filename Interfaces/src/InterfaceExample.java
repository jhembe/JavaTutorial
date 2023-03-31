class Phone{
    static class MyPhone{
        void myName(){
            System.out.println("My Phone");
        }
    }
    void call(){
        System.out.println("Phone calling");
    }
    void sms(){
        System.out.println("sms sending");
    }
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer{
    void videoCall(){
        System.out.println("Smartphone Video-calling");
    }
    @Override
    public void click(){
        System.out.println("Smartphone Click");
    }
    @Override
    public void record(){
        System.out.println("Smartphone Record");
    }

    @Override
    public void play(){
        System.out.println("Smartphone music playing");
    }
    @Override
    public void pause(){
        System.out.println("Smartphone Music Paused");
    }
    @Override
    public void stop(){
        System.out.println("Smartphone Music Stopped");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        ICamera cm = new SmartPhone();
        IMusicPlayer mp = new SmartPhone();

        Phone p = s;
        ICamera c = s;
        Phone.MyPhone mpp = new Phone.MyPhone();
        IMusicPlayer m = s;

        p.call();
        p.sms();

        c.click();
        c.record();

        m.play();
        m.pause(); 
        m.stop();

    }
}
