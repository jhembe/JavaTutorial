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

    public SavingsAccount(int accountNo, String name) {
        super(accountNo, name);
    }

}

public class SCInheritance {
}
