
package balanceEnquire;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class BalanceDom 
{
    public BalancePojo balance(BalancePojo po) throws SQLException
    {
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre =con.prepareStatement("select * from customer where account_number = ? and pin = ?");
        pre.setInt(1, po.getAccno());
        pre.setInt(2, po.getPin());
        ResultSet rs = pre.executeQuery();
        if(rs.next())
        {
            po.setAccno(rs.getInt("account_number"));
            po.setAmount(rs.getDouble("amount"));
            return po;
        }
        return null;
    }
}
