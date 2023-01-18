import java.io.IOException;
import java.sql.*;

public class Select
{
    public static void main(String[] args) throws IOException, SQLException {
        String username="root";
        String pass="tushar@123";
        String url="jdbc:mysql://localhost:3306/employ";

        Connection connection= DriverManager.getConnection(url,username,pass);
        Statement statement=connection.createStatement();
        String Query="Select * from emp";

        ResultSet  resultSet=statement.executeQuery(Query);

        while(resultSet.next())
        {
            System.out.println(resultSet.getInt(1)+ "  "+ resultSet.getString(2)+"  "+ resultSet.getString(3)+ "  "+ resultSet.getString(4));
        }
        System.out.println("close  connection");

        connection.close();



    }
}
