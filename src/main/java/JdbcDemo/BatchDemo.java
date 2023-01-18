package JdbcDemo;
import java.sql.PreparedStatement;
import java.util.Scanner;

import static JdbcDemo.ConnectionProvider.connection;

public class BatchDemo
{
    public static void main(String[] args) throws Exception{
      connection=ConnectionProvider.getConnection();
      String query="insert into emplist value(?,?,?)";
        PreparedStatement ps=connection.prepareStatement(query);
        Scanner sc=new Scanner(System.in);
while(true) {
    System.out.println("Enetr the employ id");
    int eid = sc.nextInt();

    System.out.println("Enetr the employ name");
    String ename = sc.next();

    System.out.println("Enetr the employsalary");
    int esalary = sc.nextInt();


    ps.setInt(1, eid);
    ps.setString(2, ename);
    ps.setInt(3, esalary);

    ps.addBatch();

    System.out.println("want to add more records ..y/n");
    String req=sc.next();
    if (req.equals("no"))
    {
        break;
    }
}
ps.executeBatch();
        System.out.println("record successfully saved");

connection.close();


    }
}
