package ParametrisedConstructor;

class Rectangle{
    int length;
    int breadth;

    public Rectangle(){
        this.length = this.breadth = 1;
    }
    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    int volume(){
        return length*breadth;
    }
}

class Cuboid extends Rectangle{
    int height;

    public Cuboid(){
        this.height = 1;
    }
    public Cuboid(int h){
        this.height = h;
    }
    // for me to call a parametrised constructor is should make a new constructor passing those values
    public Cuboid(int l,int b, int h){
        super(l,b);
        this.height = h;
    }

    int volume(){
        return length*breadth*height;
    }
}
public class RectangleTest {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10,12,34  );
        System.out.println(c.volume());
    }
}
