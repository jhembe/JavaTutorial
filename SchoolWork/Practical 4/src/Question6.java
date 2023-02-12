
class Student{
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

public class Question6{
    // creating an object
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("Eliah");
        std1.setGender("Male");
        std1.setRegNumber("T21-03-11119");
        std1.setYearOfStudy("2021/2022");

        System.out.println("Name : " + std1.getName() + "\nGender : "+std1.getGender()+
                "\nRegistration No : " + std1.getRegNumber() + "\nYear of Study : " + std1.getYearOfStudy());
    }
}

