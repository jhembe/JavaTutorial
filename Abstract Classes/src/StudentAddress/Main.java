package StudentAddress;

public class Main {
    public static void main(String[] args) {
        // now we create objects of Address and Student
        Address addr = new Address("54","Dodoma","Tanzania");
        Student std = new Student(45,"Sangiwa",addr); // here is where you should be carefully
        //you need to reference the address object in the student constructor as an argument

        std.studentInfo(); // for calls the student info function
    }




}
