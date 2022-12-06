class Product{
    private final int itemno;
    private String name;
    private float price;
    private int qty;

    // for the property methods
    public int getItemno(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    // for the set property methods
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    // now for the constructiors
    public Product(int itemno){
        this.itemno = itemno;
    }
    public Product(int itemno,String name,float price,int qty){
        this.itemno = itemno;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
}

class Customer{
    private int custId;
    private String name;
    private String address;
    private String phoneNo;


    // writing my constructor
    public Customer(int custId,String name){
        this.custId = custId;
        this.name = name;
    }
    public Customer(int custId,String name, String address,String phoneNo){
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    // now for the property methods
    int getCustId(){
        return custId;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    String getPhoneNo(){
        return phoneNo;
    }
    // for the set property
    void setAddress(String address){
        this.address = address;
    }
    void setPhoneNo(String phoneNo){
        this.phoneNo =  phoneNo;
    }

}

public class ProductAndConsumerSC {
}
