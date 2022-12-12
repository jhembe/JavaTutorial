package Question7;

class Employee {
    double salary = 1500000;
}

class Programmer extends Employee {
    double bonusP = 100000;
}

class Accountant extends Employee {
    double bonusA = 50000;
}

public class MyMain {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println("Total earning of the programmer: " + (programmer.salary + programmer.bonusP));
        Accountant accountant = new Accountant();
        System.out.println("Total earning of the accountant: " + (accountant.salary + accountant.bonusA));
    }
}

