
package DeleteCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class DeleDOm 
{
    public boolean deleteAccNum(DelePojo po) throws SQLException
    {
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre = con.prepareStatement("delete from customer where account_number = ?");
        pre.setInt(1, po.getAccNumber());
        if(pre.executeUpdate() > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
