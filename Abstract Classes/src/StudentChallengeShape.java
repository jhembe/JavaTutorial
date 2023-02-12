abstract class Shape{
    abstract float perimeter();
    abstract float area();
}


class shappe{
    float perimeter(){
        System.out.println("finds the perimeter");
        return 0;
    }

    float area(){
        System.out.println("Finds the area");
        return 1;
    }
}

class circlee extends shappe{
    void volume(){
        System.out.println("FInds the volume");
    }
}

class circleee extends Shape{
    public String fname;
    public String lname;

    public void fullName(String fname,String lname){
        System.out.println(fname + " "+lname);
    }
    @Override
    float perimeter(){
        return 0;
    }
    @Override
    float area(){
        return 1;
    }
}

class Circle extends Shape{
    float radius;
    @Override
    float perimeter(){
        return (float)(2*Math.PI*radius);
    }
    @Override
    float area(){
        return (float)(Math.PI*radius*radius);
    }
}

class Rectangle extends Shape{
    float length, width;

    float perimeter(){
        return 2*length*width;
    }
    float area(){
        return length*width;
    }


}

public class StudentChallengeShape {
    public static void main(String[] args) {
        Circle s = new Circle();
        s.radius = 20.6f;
        s.area();
        s.perimeter();

        Rectangle r = new Rectangle();
        r.length = 45f;
        r.width = 23f;
        r.area();
        r.perimeter();
    }
}
