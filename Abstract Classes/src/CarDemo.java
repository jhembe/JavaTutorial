abstract class Car{
    abstract void start();
    abstract void stop();
}

class Toyota extends Car{
    @Override
    void start(){
        System.out.println("Start Toyota car");
    }
    @Override
    void stop(){
        System.out.println("Stop Toyota Car");
    }

    void sayHello(){
        System.out.println("Hello");
    }

    int sum(int x, int y){
        return(x+y);
    }
}

class Nissan extends Car{
    @Override
    void start(){
        System.out.println("Start Nissan car");
    }
    @Override
    void stop(){
        System.out.println("Stop Nissan Car");
    }

    void sayHello(){
        System.out.println("Hello");
    }
}


public class CarDemo {

    void sayHello(){
        System.out.println("Class Demo Hello");
    }
    public static void main(String[] args) {
        Toyota rav4 = new Toyota();
        Car kluger = new Toyota();
        CarDemo car = new CarDemo();
        car.sayHello();
    }


}
