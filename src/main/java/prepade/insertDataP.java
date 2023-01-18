package prepade;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertDataP
{
    public static void main(String[] args) throws IOException, SQLException {
        String username="root";
        String pass="tushar@123";
        String url="jdbc:mysql://localhost:3306/employ";
        Connection connection= DriverManager.getConnection(url,username,pass);
        String s ="insert into dpt values(?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(s);
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the id : ");
        int did =sc.nextInt();

        System.out.println("Enter the Name  : ");
        String dname =sc.nextLine();

        preparedStatement.setInt(1,did);
        preparedStatement.setString(2,dname);

        preparedStatement.executeUpdate();
        System.out.println("inserted ");
        connection.close();



    }
}
