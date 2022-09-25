import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args){
        //initializing the inputs
        double length, breadth, height;
        double areaFrontBack, areaRightLeft, areaBottomTop, totalArea, volume;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the cuboid : ");
        length = sc.nextDouble();

        System.out.println("Enter the breadth of the cuboid : ");
        breadth = sc.nextDouble();

        System.out.println("Enter the height of the cuboid : ");
        height = sc.nextDouble();

        areaFrontBack = height * length;
        areaBottomTop = length * breadth;
        areaRightLeft = breadth * height;

        totalArea = 2 * (areaBottomTop + areaFrontBack + areaRightLeft);
        volume = height * breadth * length;

        System.out.println("The total area of the Cuboid is : " + totalArea);
        System.out.println("The volume of the Cuboid is : " + volume);

    }
}
