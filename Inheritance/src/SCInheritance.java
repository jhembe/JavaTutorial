import java.util.AbstractCollection;

class Account{
    private int accountNo,balance;
    private String name,address,phoneNo,dob;


    // for the super class constructor
    public Account(int accountNo,String name){
        this.accountNo = accountNo;
        this.name = name;
    }
    public Account(int accountNo,String name,String phoneNo,String dob){
        this.accountNo = accountNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.dob = dob;
    }

    // for setter methods
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public void setBalance(int balance){this.balance = balance;};
    // for getter methods
    public int getAccountNo(){return accountNo;};
    public String getName(){return name;};
    public String getAddress(){return address;};
    public String getPhoneNo(){return phoneNo;};
    public String getDob(){return dob;};

}

class SavingsAccount extends Account{
    String hisNme;
    public SavingsAccount(String hisNme, int accountNo, String name) {
        super(accountNo, name);
    }

}

public class SCInheritance {
    public static void main(String[] args) {
        float myNum = 56.7868765577f;
        System.out.println(Math.round(myNum));
        Double d = 456.98234;
        Double n = Math.r
    }
}
