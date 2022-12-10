class Studentt{
    private String name;
    private String regNumber;
    private String yearOfStudy;
    private String gender;


    void setName(String name){
        this.name = name;
    }
    void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }
    void setYearOfStudy(String yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }
    void setGender(String gender){
        this.gender = gender;
    }

    String getName(){
        return name;
    }
    String getRegNumber(){
        return regNumber;
    }
    String getYearOfStudy(){
        return yearOfStudy;
    }
    String getGender(){
        return gender;
    }
}

public class myMain {
    public static void main(String[] args) {
        Studentt std = new Studentt();
        std.setName("Stivine");
        std.setRegNumber("T21-03-00876");
        std.setYearOfStudy("2022/2023");
        std.setGender("Male");

        System.out.println("Name : "+std.getName());
        System.out.println("Reg NO : "+std.getRegNumber());
        System.out.println("Year of Study : "+std.getYearOfStudy());
        System.out.println("Gender : "+std.getGender());
    }
}
