package Question1;

import java.util.Scanner;

class Date {
    int month;
    int day;
    int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}

class Employee {
    String firstName;
    String lastName;
    Date birthDate;
    Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString() {
        return firstName + " " + lastName + "\n"
                + "Birthday: " + birthDate.toString() + "\n"
                + "Hire Question1.Date: " + hireDate.toString();
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Date birthDate = new Date(10, 15, 1989);
        Date hireDate = new Date(1, 15, 2020);

        Employee employee = new Employee("Eliah", "Kapyela", birthDate, hireDate);
        System.out.println(employee.toString());
        
    }
}

