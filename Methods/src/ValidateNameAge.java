import java.util.Scanner;

public class ValidateNameAge {
    // here we have two overloading functions. one validating name, another validates age
    static void validate(String name){
        if(name.matches("[a-zA-Z\\s]+")){
            System.out.println("The Username is valid");
        }
        else{
            System.out.println("Invalid Username");
        }
    }

    // validating age. We need a user who is under 18, but over 10 years old
    static boolean validate(int age){
        return age>10 && age < 18;
    }

    public static void main(String[] args){
        String name;
        int age;
        // let's make the user enter his/her own input stream
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name for validation : ");
        name = input.nextLine();

        System.out.print("Enter your age for validation : ");
        age = input.nextInt();

        validate(name);
        System.out.println(validate(age));

    }
}
