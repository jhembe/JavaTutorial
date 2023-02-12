interface Member{
    void callBack();
}

class Store{
    // this store will mantain a list of customers
    Member[] mem = new Member[100];
    int count = 0;

    // we must have a method to register the customers
    public void register(Member m){
        mem[count++] = m;
    }

    // whenever there is a sale, you should invite the customer. As an invite
    void inviteSell(){
        for(int i=0; i<count; i++){
            mem[i].callBack();
        }
    }
}

class Customer implements Member {

    String name;

    public Customer(String name){
        this.name = name;
    }
    public void callBack(){
        System.out.println("Okay, I will visit "+this.name);
    }
}

public class CallBackMethod {
    public static void main(String[] args) {
        Customer c1 = new Customer("Kapyela");
        Customer c2 = new Customer("Sangiwa");

        Store s = new Store();
        s.register(c1);
        s.register(c2);

        s.inviteSell();


    }
}
