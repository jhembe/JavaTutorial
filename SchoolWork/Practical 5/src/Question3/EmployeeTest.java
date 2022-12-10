package Question3;

class Employee{
    static int count=0;

    // for the constructor
    public Employee(){
        count++;
    }
    public static int getCount(){
        return count;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        System.out.println("Number of objects created : " + Employee.count);
    }
}
