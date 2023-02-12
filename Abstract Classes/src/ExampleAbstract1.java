abstract class Hospital{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}

class MyHospital extends Hospital{
    public MyHospital(){
        System.out.println("My Hospital Constructor");
    }
    @Override
    void emergency(){
        System.out.println("Emergency Req");
    }
    @Override
    void appointment(){
        System.out.println("Appointment Req");
    }
    @Override
    void admit(){
        System.out.println("Admit Req");
    }
    @Override
    void billing(){
        System.out.println("Billing Req");
    }


}
public class ExampleAbstract1 {
    public static void main(String[] args) {
        Hospital h = new MyHospital();
        h.admit();
        h.appointment();
        h.billing();
        h.emergency();

    }
}
