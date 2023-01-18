package JdbcDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static JdbcDemo.ConnectionProvider.connection;

public class CreateDemo1
{
    public static void main(String[] args) throws SQLException {
      Connection connection =ConnectionProvider.getConnection();
      Statement stmt=connection.createStatement();
      String query="create table empList(eid int,ename varchar(20),esalary int)";
      stmt.execute(query);
        System.out.println("table createed...");
        connection.close();


    }
}
