abstract class Car {
    double price;
    int year;

    public Car(double price, int year){
        this.price = price;
        this.year = year;
    }

    abstract double calculateSalePrice();
}

class LuxuryCar extends Car{
    public LuxuryCar(double price, int year){
        super(price,year);
        this.price =price;
        this.year = year;
    }
    @Override
    double calculateSalePrice() {
        return 10000;
    }
}

class SportCar extends Car{
    public SportCar(double price, int year){
        super(price,year);
        this.price = price;
        this.year = year;
    }

    double calculateSalePrice(){
        if(this.year > 2000){
            this.price = this.price * 0.8;
        }
        else if(year > 1995){
            this.price = this.price * 0.5;
        }
        else{
            this.price = this.price * 0.25;
        }
        return this.price;
    }
}

public class CarTest{
    public static void main(String[] args) {
        SportCar sc = new SportCar(200000.0,2017);
        System.out.println("Sales Price : " + sc.calculateSalePrice());

        LuxuryCar lc = new LuxuryCar(123000,2018);
        System.out.println("Sales Price : " + lc.calculateSalePrice());

    }
}

