import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class CreateTable
{
    public static void main(String[] args) throws IOException, SQLException {
        String username="root";
        String pass="tushar@123";
        String url="jdbc:mysql://localhost:3306/employ";
        Connection connection= DriverManager.getConnection(url,username,pass);
        Statement statement=connection.createStatement();
        String Query="create table dpt (did int,dname varchar(20))";
        statement.execute(Query);
        System.out.println("table created ");
        connection.close();



    }
}
