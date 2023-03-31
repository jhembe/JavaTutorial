package Aggregation;

public class Aggregate {
    public static void main(String[] args) {
        Address address1 = new Address(123,"Dodoma","Tanzania");
        Student student1 = new Student(121,"Stivine",address1);

        System.out.println(student1);
        System.out.println("Was it a car or a cat I saw?".substring(9,16));
    }
}
