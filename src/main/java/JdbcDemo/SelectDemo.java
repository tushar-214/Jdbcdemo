package JdbcDemo;

import java.sql.ResultSet;
import java.sql.Statement;

import static JdbcDemo.ConnectionProvider.connection;

public class SelectDemo

{
    public static void main(String[] args) throws  Exception{
        connection=ConnectionProvider.getConnection();
        Statement st=connection.createStatement();
        String query="Select * from emplist;";
        ResultSet resultSet=st.executeQuery(query);
        while (resultSet.next())
        {
            System.out.println(resultSet.getInt(1)  +"    "+resultSet.getString(2)+"  "+resultSet.getInt(3));
        }
        connection.close();

    }
}
