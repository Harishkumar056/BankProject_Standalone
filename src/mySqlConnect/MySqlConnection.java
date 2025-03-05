
package mySqlConnect;

import java.sql.Connection;
import java.sql.DriverManager;


public class MySqlConnection 
{
    public static Connection getMysqlConnection()
    {
        try
        {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/bank";
//            String user = "Harish Kumar";
//            String password = "#Harishkumar1";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","Harish Kumar","#Harishkumar1");
            return con;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            //System.out.println("Have Problem in Connection");
        }
        return null;
    }
}
