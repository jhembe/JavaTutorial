import java.sql.*;

public class Database {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "acacia", "password");


            String insertSql = "INSERT INTO emp(id,name,age) VALUES(3,'Pendo',27)";
            String selectSql = "SELECT * FROM emp";
            Statement stmt = con.createStatement();
//            stmt.executeUpdate(insertSql);
            ResultSet rs = stmt.executeQuery(selectSql);
//
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + "  " +  name +"   " +age);

            }
            con.close();



        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
