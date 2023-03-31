package sectionB;

abstract class Polygon{
    private float height,width;

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public abstract float area();
}

class Rectangle extends Polygon{
    @Override
    public float area(){
        return getHeight()*getWidth();
    }
}

class Triangle extends Polygon{
    @Override
    public float area(){
        return 0.5f*getHeight()*getWidth();
    }
}
public class MyMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setHeight(6);
        triangle.setWidth(8);
        System.out.println(triangle.area());
    }
}
