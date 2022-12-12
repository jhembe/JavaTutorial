package Question5;

class Polygon {
    int height;
    int width;

    public void setValues(int height, int width) {
        this.height = height;
        this.width = width;
    }
}

class Rectangle extends Polygon {
    public int areaR() {
        return height * width;
    }
}

class Triangle extends Polygon {
    public int areaT() {
        return height * width / 2;
    }
}

public class myMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setValues(12, 5);
        System.out.println("Area of the rectangle: " + rectangle.areaR());

        Triangle triangle = new Triangle();
        triangle.setValues(12, 5);
        System.out.println("Area of the triangle: " + triangle.areaT());
    }
}

