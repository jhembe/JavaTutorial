class Employee{
    private String name,address,phoneNumber;
    int age;

    public Employee(String name,String phoneNumber,String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    void setName(String name){
        this.name = name;
    }
    void setAddress(String address){
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class Payroll extends Employee{
    int bankNumber;
    public Payroll(String name, String phoneNumber, String address,int bankNumber) {
        super(name, phoneNumber, address);
        this.bankNumber = bankNumber;
    }

    void printName(){
        System.out.println(getName());
    }
}

public class EmployeeDemo{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Eliah","0766047784","Block 6");
        emp1.setAge(67);
        emp1.setName("Sangiwa");

        System.out.println("Name : "+emp1.getName()+"\nPhone Number : "+emp1.getPhoneNumber()
        +"\nAge : "+emp1.getAge()+"\nAddress : "+emp1.getAddress());

    }
}
