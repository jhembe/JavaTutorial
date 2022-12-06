class CylinderCons{

    private int radius;
    private int height;

    // creating my constructor
    public CylinderCons(){
        this.radius = 0;
        this.height = 0;
    }
    public CylinderCons(int r){
        this.radius = r;
        this.height = 1;
    }
    public CylinderCons(int r, int h){
        this.radius=r;
        this.height=h;
    }
    int getRadius(){
        return radius;
    }
    void setRadius(int r){
        this.radius = r;
    }

    int getHeight(){
        return height;
    }
    void setHeight(int h){
        this.height = h;
    }
    public void printDim(){
        System.out.println("Radius : "+radius+" "+" Length : "+height);
    }

}


public class CylinderChallengeCons {
    public static void main(String ...args){
        CylinderCons cyl1 = new CylinderCons(4);

        cyl1.printDim();
    }
}
