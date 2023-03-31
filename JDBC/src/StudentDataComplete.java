import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentDataComplete {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData","acacia","password");
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            // The insert Operation
            String insertSQL = "INSERT INTO student (student_id,fname,lname,address) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            System.out.print("Enter student ID : ");
            int id = input.nextInt();
            System.out.print("Enter First name : ");
            String fname = input2.nextLine();
            System.out.print("Enter Last name : ");
            String lname = input2.nextLine();
            System.out.print("Enter address : ");
            String addr = input2.nextLine();

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,fname);
            preparedStatement.setString(3,lname);
            preparedStatement.setString(4,addr);
            preparedStatement.executeUpdate();

            // The select operation
            String selectSQL = "SELECT * FROM student";
            preparedStatement = connection.prepareStatement(selectSQL);
//            preparedStatement.setInt(1,2);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int studentId = resultSet.getInt("student_id");
                String firstName = resultSet.getString("fname");
                String lastName = resultSet.getString("lname");
                String address = resultSet.getString("address");

                System.out.println(studentId+"      "+firstName+"       "+lastName+"        "+address);
                System.out.print("\n");
            }

//            // Update Operation
            String updateSQL = "UPDATE student SET address = ? WHERE student_id = ?";
            preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.setString(1,"Maganga St 456");
            preparedStatement.setInt(2,3);
            preparedStatement.executeUpdate();
//
//            //Delete operation
            String deleteSQL = "DELETE FROM student WHERE student_id = ?";
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1,4);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
