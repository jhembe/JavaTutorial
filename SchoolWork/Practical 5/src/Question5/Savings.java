package Question5;

class SavingsAccount{
    static float annualInterestRate = 0.04f;
    private int savingsBalance;
    // constructor
    public SavingsAccount(int savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    int getSavingsBalance(){
        return savingsBalance;
    }
    // for method
    float calculateMonthlyInterest(){
        float interest = (savingsBalance*annualInterestRate)/12;
//        this.savingsBalance += interest;
        return interest;
    }
    static void modifyInterestRate(float newInterest){
        annualInterestRate = newInterest;
    }
}
public class Savings {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04f);
        System.out.println("For 4% Annual interest Rate");
        System.out.println(saver1.calculateMonthlyInterest() + saver1.getSavingsBalance());
        System.out.println(saver2.calculateMonthlyInterest() + saver2.getSavingsBalance());
        System.out.print("\n");
        SavingsAccount.modifyInterestRate(0.05f);
        System.out.println("For 5% Annual interest Rate");
        System.out.println(saver1.calculateMonthlyInterest() + saver1.getSavingsBalance());
        System.out.println(saver2.calculateMonthlyInterest() + saver2.getSavingsBalance());


    }
}
