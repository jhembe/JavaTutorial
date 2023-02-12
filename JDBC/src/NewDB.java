import java.sql.*;

public class NewDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sonoo","acacia","password");

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM emp");

            int id;
            int age;
            String name;
            while(rs.next()){
                id = rs.getInt("id");
                age = rs.getInt("age");
                name = rs.getString("name");

                System.out.println(id + " "+name+" "+age+" ");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
