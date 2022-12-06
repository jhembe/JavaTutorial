class Rectangle{
    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }
    public void setLength(int l){
        if(l > 0){
            length = l;
        }
        else length = 0;
    }

    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int b){
        if(b > 0){
            breadth = b;
        }
        else breadth = 0;
    }


    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length*breadth);
    }
}

public class DataHiding {
    public static void main(String ...args){
        Rectangle rec = new Rectangle();

        rec.setLength(25);
        System.out.println(rec.getLength());

        rec.setBreadth(56);
        System.out.println(rec.getBreadth());

        System.out.println("The area of the rectangle is : " + rec.area());
        System.out.println("The perimeter of the rectangle is : " + rec.perimeter());

    }
}
