class Cylinder{
    public float radius;
    public float height;

    public float lidArea(){
        return (float)(Math.PI*radius*radius);
    }
    public float totalSurfaceArea(){
        return (float)(2*Math.PI*radius*height) + (float)(2*Math.PI*radius*radius);
    }
    public float volume(){
        return (float)(Math.PI*radius*radius*height);
    }
}

public class CylinderClassSc {
    public static void main(String ...args){
        Cylinder cyl = new Cylinder();
        cyl.radius = 12;
        cyl.height = 24;

        System.out.println("The lid Area is : "+cyl.lidArea());
        System.out.println("The Total Surface area is : " + cyl.totalSurfaceArea());
        System.out.println("The volume is : "+ cyl.volume());
    }

}
