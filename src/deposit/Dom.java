
 
package deposit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class Dom 
{
    public boolean db(Pojo p) throws SQLException
    {
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre = con.prepareStatement("update customer set amount = ? where account_number = ? and pin = ?");
        pre.setDouble(1, p.getAmount());
        pre.setInt(2, p.getAccountNumber());
        pre.setInt(3, p.getPin());
        
        int amount = pre.executeUpdate();
        if(amount > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
