import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentData {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData","acacia","password");

            // The insert Operation
            String insertSQL = "INSERT INTO student (student_id,fname,lname,address) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setInt(1,4);
            preparedStatement.setString(2,"Christina-Rhobi");
            preparedStatement.setString(3,"Gabriel");
            preparedStatement.setString(4,"External st");
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

                System.out.println("Student ID : " + studentId+"\nName : "+firstName+" "+lastName+"\nAddress : "+address);
                System.out.print("\n");
            }


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
