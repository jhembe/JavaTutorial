package Question6;
abstract class Polygon {
    int height;
    int width;

    public void setValues(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public abstract int area();
}

class Rectangle extends Polygon {
    public int area() {
        return height * width;
    }
}

class Triangle extends Polygon {
    public int area() {
        return height * width / 2;
    }
}

public class myMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setValues(15, 10);
        System.out.println("Area of the rectangle: " + rect.area());

        Triangle triangle = new Triangle();
        triangle.setValues(15, 10);
        System.out.println("Area of the triangle: " + triangle.area());
    }
}

