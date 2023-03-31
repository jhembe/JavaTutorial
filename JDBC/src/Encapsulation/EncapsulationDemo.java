package Encapsulation;

class Car{
    private String name;
    private int topSpeed;

    public void setName(String name) {
        this.name = name;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Subaru");
        car1.setTopSpeed(180);

        System.out.println("Name : "+car1.getName()+"\nTop Speed : "+car1.getTopSpeed());
    }
}
