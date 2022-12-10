
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

