class Subject{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    //Constructors
    public Subject(String subId,String name){
        this.subId =  subId;
        this.name = name;
    }
    public Subject(String subId,String name,int maxMarks,int marksObtain){
        this.subId =  subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }

    // for the property methods
    String getName(){
        return name;
    }
    String getSubId(){
        return subId;
    }
    int getMaxMarks(){
        return maxMarks;
    }
    int getMarksObtain(){
        return marksObtain;
    }

    // for set methods
    public void setMaxMarks(int max){
        this.maxMarks = max;
    }
    public void setMarksObtain(int maxOb){
        this.marksObtain = maxOb;
    }

    public String toString() {
        return "\nSubject ID: "+subId+"\nName: "+name+"\nMarks Obtained : "+marksObtain;
    }
}

public class ArrayOfObjectSC {
    public static void main(String ...args){
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("CP213","Data Structure",100,90);
        subs[1] = new Subject("CP211","Introduction to Linux",93 ,95);
        subs[2] = new Subject("CP215","OOP In Java",76,90);

        // using for each loop to print the values
        for(Subject s:subs){
            System.out.println(s);
        }
    }
}
