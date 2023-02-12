package StudentAddress;

public class Student {
    String name;
    int id;
    Address address; // consider this an object like creation

    // this is the constructor for the Student class
    public Student(int id,String name,Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // this is the method for Student info
    public void studentInfo(){
        System.out.println("Student ID : "+id +"\nStudent Name : "+name);
        System.out.println("\nStreet No : " + address.streetNo + "\nCity : " + address.city + "\nCountry : " +address.country);
    }
}
