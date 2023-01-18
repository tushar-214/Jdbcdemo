import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo
{
    public static void main(String[] args) throws IOException, SQLException {
        String username="root";
        String pass="tushar@123";
        String url="jdbc:mysql://localhost:3306/employ";
        Connection connection= DriverManager.getConnection(url,username,pass);
        Statement statement=connection.createStatement();
        String Query="insert into emp values (3,'rani','shivajinagr',90000)";
        statement.executeUpdate(Query);
        System.out.println("data inserted ...");
        connection.close();




    }
}
