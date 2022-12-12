package Question3;

class Polygon {
    int height;
    int width;

    public void setValues(int height, int width) {
        this.height = height;
        this.width = width;
    }
}

class Rectangle extends Polygon {
    public int area() {
        return height * width;
    }
}

public class MyTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setValues(45, 20);
        System.out.println("Area of the rectangle: " + rect.area());
    }
}

