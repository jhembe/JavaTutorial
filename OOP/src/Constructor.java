class RectangleCons{
    private int length;
    private int breadth;

    public RectangleCons(){
        length = 1;
        breadth = 1;
    }
    public RectangleCons(int l, int b){
        length = l;
        breadth = b;
    }
    public int getLength(){
        return length;
    }
    public int area(){
        return length*breadth;
    }
}

public class Constructor {
    // a constructor is a method of a class which is automatically called whenever an object is created

    public static void main(String ...args){
        RectangleCons rec1 = new RectangleCons(4,5);
        RectangleCons rec2 = new RectangleCons();
//        System.out.println(rec1.getLength());

        System.out.println(rec1.area());
        System.out.println(rec2.area());
    }

}
