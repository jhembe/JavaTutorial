package Question4;

class EmployeeA {
    float salary = 1000;
}

class EmployeeB extends EmployeeA {
    float bonusB = 100;
}

class EmployeeC extends EmployeeB {
    float bonusC = 50;
}

public class EmployeesTest {
    public static void main(String[] args) {
        EmployeeC employeeC = new EmployeeC();
        System.out.println("Employee A : " + employeeC.salary);
        System.out.println("Employee B : " + (employeeC.salary+employeeC.bonusB));
        System.out.println("Employee C : " + (employeeC.salary+employeeC.bonusC));
    }
}
