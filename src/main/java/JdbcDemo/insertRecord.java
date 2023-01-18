package JdbcDemo;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import static JdbcDemo.ConnectionProvider.connection;

public class insertRecord
{
    public static void main(String[] args) throws Exception {
        connection=ConnectionProvider.getConnection();
        String q="insert into emplist values(?,?,?)";
      PreparedStatement ps=connection.prepareStatement(q);
        Scanner sc=new Scanner(System.in);

        System.out.println("Enetr the employ id");
        int eid=sc.nextInt();

        System.out.println("Enetr the employ name");
        String ename=sc.next();

        System.out.println("Enetr the employsalary");
        int esalary=sc.nextInt();


        ps.setInt(1,eid);
        ps.setString(2,ename);
        ps.setInt(3,esalary);

        ps.executeUpdate();
        System.out.println("data inserted");
        connection.close();





    }
}
