package JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider
{
    public static Connection connection;
    public static Connection getConnection()
    {
        String username="root";
        String pass="tushar@123";
        String url="jdbc:mysql://localhost:3306/employ";
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(url, username, pass);
            }
        }
        catch(Exception e){
            System.out.println("connectionfaild");
        }
        return connection;
    }
}
