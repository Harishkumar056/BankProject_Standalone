
package gendratePinScreen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class PinDom 
{
    public boolean setPin(PinPojo pojo) throws SQLException
    {
        boolean userFind = false;
        Connection  con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre= con.prepareStatement("select * from customer where name = ? and account_number = ?");
        pre.setString(1, pojo.getName());
        pre.setInt(2, pojo.getAcno());
        ResultSet rs = pre.executeQuery();
        if(rs.next())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
