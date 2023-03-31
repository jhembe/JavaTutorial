import java.sql.*;
public class DatabaseTest {
public static void main(String[]args) throws SQLException{


        //creating connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData","acacia","password");
        //creating a statement
        Statement stmt = conn.createStatement();

        // create a sql string
        String selectSql = "SELECT * FROM student";
        // create a resultset
        ResultSet rs = stmt.executeQuery(selectSql);

        // get metadate for the resultset
        ResultSetMetaData rsmd = rs.getMetaData();
        int numColumns = rsmd.getColumnCount();

        // print the column headers
        for(int i=1; i<=numColumns; i++){
            System.out.printf("%-15s",rsmd.getColumnName(i));
        }
        System.out.println();

        // printing the separator line
        for(int i=1; i<=numColumns; i++){
            System.out.printf("%-15s","------------------");
        }
        System.out.println();
        // now to display this stuffs
        while(rs.next()){
            int studentId = rs.getInt("student_id");
            String firstName = rs.getString("fname");
            String lastName = rs.getString("lname");
            String address = rs.getString("address");

            System.out.printf("%-15s%-15s%-15s%-15s",studentId,firstName,lastName,address);
            System.out.println();

        }
    }
}
