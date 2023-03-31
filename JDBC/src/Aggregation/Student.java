package Aggregation;

public class Student {
    int studentID;
    String studentName;
    Address address;

    public Student(int studentID, String studentName, Address address){
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
    }

    public String toString(){
        return "ID : "+studentID+"\nName : "+studentName+"\nStreet No"+address.streetNumber+
                "\nCity : "+address.city+"\nCountry : "+address.country;

    }
}
