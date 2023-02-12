import java.sql.*;

public class BatchInsert {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;

        try {
            // Load the JDBC driver
//            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData", "username", "password");

            // Turn off auto-commit
            con.setAutoCommit(false);

            // Create a statement object
            stmt = con.createStatement();

            // Add multiple SQL statements to the batch
            stmt.addBatch("insert into Student(student_id,fname,lname,address) values(1, 'John', 'Doe', '123 Main St')");
            stmt.addBatch("insert into Student(student_id,fname,lname,address) values(2, 'Jane', 'Smith', '456 Elm St')");
            stmt.addBatch("insert into Student(student_id,fname,lname,address) values(3, 'Bob', 'Johnson', '789 Oak St')");

            // Execute the batch
            int[] updateCounts = stmt.executeBatch();

            // Commit the transaction
            con.commit();

            // Print the update counts for each statement in the batch
            for (int i = 0; i < updateCounts.length; i++) {
                System.out.println("Statement " + (i + 1) + ": " + updateCounts[i] + " rows updated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the statement and connection objects
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
