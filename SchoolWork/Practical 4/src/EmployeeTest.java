import java.util.Scanner;

class Employee{
    private String firstName,lastName;
    private double monthlySalary;

    // for the constructor
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    // for getters
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public double getMonthlySalary(){return monthlySalary;}

    // for setters
    public void setFirstName(String firstName){this.firstName = firstName;};
    public void setLastName(String lastName){this.lastName = lastName;};
    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary > 0) this.monthlySalary = monthlySalary;
    };
}
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        String fname1 = input.nextLine();

        System.out.println("Enter the first name : ");
        String fname2 = input.nextLine();

        //creating two employees obeject
        Employee emp1 = new Employee("Erick","Sangiwa",450000.00);
        Employee emp2 = new Employee("Eliah","Kapyela",530000.00);

        emp2.setFirstName(fname1);

        // for displaying yearly salary
        double emp1Salary = emp1.getMonthlySalary()*12;
        double emp2Salary = emp2.getMonthlySalary()*12;
        System.out.println("First Name : " + emp1.getFirstName()+"\nLast Name : "+emp1.getLastName()+
                "\nYearly Salary : "+ emp1Salary+"\n");
        System.out.println("First Name : " + emp2.getFirstName()+"\nLast Name : "+emp2.getLastName()+
                "\nYearly Salary : "+ emp2Salary+"\n");

        System.out.println("\nAfter a 10% Raise in Salary\n");


        // After a 10% raise
        System.out.println("First Name : " + emp1.getFirstName()+"\nLast Name : "+emp1.getLastName()+
                "\nYearly Salary : "+((emp1Salary*0.1)+emp1Salary)+"\n");
        System.out.println("First Name : " + emp2.getFirstName()+"\nLast Name : "+emp2.getLastName()+
                "\nYearly Salary : "+((emp2Salary*0.1)+emp2Salary)+"\n");

    }
}
