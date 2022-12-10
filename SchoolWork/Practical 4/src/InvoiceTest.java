class Invoice{
    //for the instance variables
    private String partNumber,partDescription;
    private int quantity;
    private double pricePerItem;
    // for the constructor
    public Invoice(String partNumber,String partDescription,int quantity,double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    //Begin setters
    public void setPartNumber(String partNumber){this.partNumber = partNumber;};
    public void setPartDescription(String partDescription){this.partDescription = partDescription;};
    public void setQuantity(int quantity){
        if(quantity < 0) this.quantity = 0;
        else this.quantity = quantity;
    };
    public void setPricePerItem(double pricePerItem){
        if(pricePerItem < 0) this.pricePerItem = 0.0;
        else this.pricePerItem = pricePerItem;
    };
    //End of setters
    // Begin getters
    public String getPartNumber(){return partNumber;};
    public String getPartDescription(){return partDescription;};
    public int getQuantity(){return quantity;};
    public double getPricePerItem(){return pricePerItem;};
    // end of getters

    // Begin methods
    public double getInvoiceAmount(){
        return quantity*pricePerItem;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        //let's create an object
        Invoice obj = new Invoice("T345","Oil filter for used cars",5,2300);
        System.out.println("Part Number : "+obj.getPartNumber());
        System.out.println("Part Description : " + obj.getPartDescription());
        System.out.println("Quantity bought : "+obj.getQuantity());
        System.out.println("Your Invoice Amount : " + obj.getInvoiceAmount());
    }
}
