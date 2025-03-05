
package createAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class CreAccDOM 
{
    public boolean insertDetails(CreAccPojo pojo) 
    {
        boolean created = false;
        try
        {
            Connection con = MySqlConnection.getMysqlConnection();
            PreparedStatement pre = con.prepareStatement("insert into customer(name,phno,address,aadharNumber,fathersname) values(?,?,?,?,?)");
            pre.setString(1, pojo.getName());
            pre.setLong(2, pojo.getPhno());
            pre.setString(3, pojo.getAddress());
            pre.setLong(4, pojo.getAadharNumber());
            pre.setString(5, pojo.getFatherName());
            System.out.println("Create Account "+pre.executeUpdate());
            created = true;
            return created;
        }
        catch(SQLException e)
        {
            System.out.println("Database sarya paru");
        }
        return false;
    }
}
