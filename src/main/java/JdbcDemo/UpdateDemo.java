package JdbcDemo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static JdbcDemo.ConnectionProvider.connection;
public class UpdateDemo
{
    public static void main(String[] args) throws SQLException {
     connection=ConnectionProvider.getConnection();
     String query="update emplist set ename=? where eid=?";

     PreparedStatement ps=connection.prepareStatement(query);
        Scanner sc=new Scanner(System.in);

        System.out.println("Enetr the name what you want change");
        String name=sc.next();
        System.out.println("where we want chnage enter id");
        int id=sc.nextInt();

        ps.setString(1,name);
        ps.setInt(2,id);

        ps.executeUpdate();
        connection.close();
    }
}
