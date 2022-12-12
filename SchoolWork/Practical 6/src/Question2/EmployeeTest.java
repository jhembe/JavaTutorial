package Question2;

class Date {
    int month;
    int day;
    int year;

    public Date(int month, int day, int year) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month: " + month);
            throw new IllegalArgumentException("Invalid month: " + month);
        }
        if (day < 1 || day > 31) {
            System.out.println("Invalid day: " + day);
        }

        // Special case for February
        if (month == 2) {
            if (day > 29) {
                System.out.println("Invalid day: " + day);
            }
            if (day == 29) {
                if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) {
                    System.out.println("Invalid day: " + day);
                }
            }
        }

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
        Date birthDate = new Date(11, 12, 1989);
        Date hireDate = new Date(1, 15, 2020);

        Employee employee = new Employee("Eliah", "Kapyela", birthDate, hireDate);
        System.out.println(employee.toString());
    }
}

