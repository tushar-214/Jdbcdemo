package JdbcDemo;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.Callable;

import static JdbcDemo.ConnectionProvider.connection;

public class StorePro {
    public static void main(String[] args) throws SQLException {
        connection=ConnectionProvider.getConnection();
        String query="insert into emplist value (?,?,?)";

       CallableStatement cs =connection.prepareCall(query);

        Scanner sc=new Scanner(System.in);

        System.out.println("Enetr the employ id");
        int eid=sc.nextInt();

        System.out.println("Enetr the employ name");
        String ename=sc.next();

        System.out.println("Enetr the employsalary");
        int esalary=sc.nextInt();


       cs.setInt(1,eid);
        cs.setString(2,ename);
        cs.setInt(3,esalary);

        cs.addBatch();
        cs.executeBatch();
        System.out.println("data inserted");
        connection.close();

    }
}
