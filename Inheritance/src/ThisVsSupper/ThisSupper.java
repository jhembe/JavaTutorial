package ThisVsSupper;

class Rectangle{
    int breadth;
    int length;
    int x = 10;

    Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    void display(){
        System.out.println("Length : "+this.length);
        System.out.println("Breadth : " + this.breadth);
    }
}

class Cuboid extends Rectangle{
    int height;
    int x = 50;

    Cuboid(int l, int b,int h) {
        super(l, b);
        this.height = h;
    }

    void display(){
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
public class ThisSupper {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(34,56,43);
    }
}
