package Question1;

class Account{
    private String name;
    private int balance;
    // creating the constructor
    public Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
    // setters
    public void setName(String name){this.name = name;}
    //getters
    public String getName(){return name;};
    public int getBalance(){return balance;};

    public void deposit(int depAmount){
        this.balance += depAmount;
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account("Eliah Kapyela",3400000);
        Account acc2 = new Account("Erick Sangiwa",4560000);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());

        // depositing cash
        acc1.deposit(5000);
        System.out.println(acc1.getBalance());
    }
}

