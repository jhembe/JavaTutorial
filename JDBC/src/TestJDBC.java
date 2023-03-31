import java.sql.*;

public class TestJDBC {
    public static void main(String[] args){
        try {
//            Class.forName("com.mysql.jdbc.Driver");

            //create a connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","acacia","password");

            String selectSQL = "SELECT first_name,last_name,phone_number FROM EmployeeInfo";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSQL);

            while(resultSet.next()){
                String fistName = resultSet.getString("first_name");
                String secondName = resultSet.getString("last_name");
                String phoneNumber = resultSet.getString("phone_number");

                System.out.printf("%-15s%-15s%-15s",fistName,secondName,phoneNumber);
                System.out.println();
//                System.out.println(fistName+"       "+secondName+"      "+phoneNumber);
            }
            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
