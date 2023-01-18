package JdbcDemo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static JdbcDemo.ConnectionProvider.connection;

public class DeleteDemo
{
    public static void main(String[] args) throws SQLException {
     connection=ConnectionProvider.getConnection();
     String query="delete from emplist where eid=?";

     PreparedStatement ps=connection.prepareStatement(query);
        Scanner sc=new Scanner(System.in);


        System.out.println("which id we want delete ");
        int id=sc.nextInt();


        ps.setInt(1,id);

        ps.executeUpdate();
        System.out.println("record deleted...");
        connection.close();
    }
}
