class Student{
    // for the properties we want for our student
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    // now for our methods
    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average() >= 60){
            return 'A';
        }
        else{
            return 'B';
        }
    }
}

public class StudentClassChalenge {
    public static void main(String ...args){

        Student std = new Student();
        std.m1 = 58;
        std.m2 = 98;
        std.m3 = 34;
        std.name = "Stivine Magabiro Mgasa";
        std.roll = 342;
        std.course = "IDIT";

        System.out.println("The total Marks is : " + std.total());
        System.out.println("The average Marks is : " + std.average());
        System.out.println("The total grade is : " + std.grade());
    }
}
