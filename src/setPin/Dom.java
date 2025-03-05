
package setPin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class Dom 
{
    public int setPin(pojo p) throws SQLException
    {
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre = con.prepareStatement("update customer set pin = ? where account_number = ?");
        pre.setInt(1, p.getPin());
        pre.setLong(2, p.getAccountnumber());
        
        int insert = pre.executeUpdate();
        if(insert > 0)
        {
            return insert;
        }
        else
        {
            return insert;
        }
    }
}
