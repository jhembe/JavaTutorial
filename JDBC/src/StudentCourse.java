import java.sql.*;
import java.util.Scanner;

public class StudentCourse {
    public static void main(String[] args)throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData","acacia","password");

        // create a prepared statement
        String insertSql = "INSERT INTO courseNew (course_name,instructor_name,lifespan) VALUES (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

        // prepare user Input for the prepared statement
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the course name : ");
        String courseName = input.nextLine();
        System.out.print("Enter the Instructor name : ");
        String instructorName = input.nextLine();
        System.out.print("Enter the projected lifespan : ");
        int lifespan = input.nextInt();

        // now assigning the prepared statement variables
        preparedStatement.setString(1,courseName);
        preparedStatement.setString(2,instructorName);
        preparedStatement.setInt(3,lifespan);

        // push the changes to the database
        preparedStatement.executeUpdate();

        // now I want us to print the results we hae on the screen
        String selectSql = "SELECT * FROM courseNew";
        preparedStatement = connection.prepareStatement(selectSql);
        ResultSet resultSet = preparedStatement.executeQuery();

        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columNo = rsmd.getColumnCount();
        // creating headers
        System.out.printf("%-25s%-20s%-20s","Course Name","Course Instructor","Lifespan");
        System.out.println();
        //printing separating line
        for (int i=0; i<columNo;i++){
            System.out.printf("%-10s","----------------------");
        }
        System.out.println();


        // printing the data
        while(resultSet.next()){
            courseName = resultSet.getString("course_name");
            instructorName = resultSet.getString("instructor_name");
            lifespan = resultSet.getInt("lifespan");

            System.out.printf("%-25s%-20s%-20s",courseName,instructorName,lifespan);
            System.out.println();
        }
        //printing separating line
        for (int i=0; i<columNo;i++){
            System.out.printf("%-10s","----------------------");
        }
        System.out.println();
        connection.close();

    }
}
