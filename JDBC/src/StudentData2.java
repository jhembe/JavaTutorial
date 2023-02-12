import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;

public class StudentData2 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData","acacia","password");

            // The insert Operation
            String insertSQL = "INSERT INTO student (student_id,fname,lname,address) VALUES (1,'Joseph','Gabriel','External St')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertSQL);

            // select operation
            String selectSQL = "SELECT * FROM student WHERE student_id = 1";
            ResultSet resultSet = statement.executeQuery(selectSQL);
            while (resultSet.next()){
                int studentId = resultSet.getInt("student_id");
                String firstName = resultSet.getString("fname");
                String lastName = resultSet.getString("lname");
                String address = resultSet.getString("address");

                System.out.println("Student ID : " + studentId+"\nName : "+firstName+" "+lastName+"\nAddress : "+address);
            }

            // Update Operation
            String updateSQL = "UPDATE student SET address = 'Himalayas' WHERE student_id = 2";
            statement.executeUpdate(updateSQL);

            // Delete Operation
            String deleteSQL = "DELETE FROM student WHERE student_id = 3";
            statement.executeUpdate(deleteSQL);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
