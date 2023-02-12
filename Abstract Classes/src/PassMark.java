abstract class Student{
    public abstract double getPassMark();
}

class DiplomaStudent extends Student{
    private final double passMark;
    private final double diplomaPassMark;
    int luckyNumber;
    public DiplomaStudent(double passMark,double diplomaPassMark,int luckyNumber){
        this.passMark = passMark;
        this.diplomaPassMark = diplomaPassMark;
        this.luckyNumber = luckyNumber;
    }

    public double getDiplomaPassMark(){
        System.out.println("hafkhds");
        return 0;
    }
    public double getPassMark(){
        return passMark;
    }

    public int getLuckyNumber(){
        return luckyNumber;
    }

}

public class PassMark{
    public static void main(String[] args) {
        DiplomaStudent employees = new DiplomaStudent(67.9,98.9,87);
        System.out.printf("passmark: %.2f%n",employees.getPassMark());
        System.out.printf("passmark: %.2f%n",employees.getDiplomaPassMark());

    }
}
