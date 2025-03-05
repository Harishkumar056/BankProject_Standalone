
package withdrawl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class WithDom 
{
    public withPojo withDrawProceess(withPojo po) throws SQLException
    {
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre = con.prepareStatement("select * from customer where account_number = ? and pin = ?");
        pre.setInt(1, po.getAccountNumber());
        pre.setInt(2,po.getPin());
        ResultSet rs = pre.executeQuery();
        if(rs.next())
        {
            po.setAmount(rs.getDouble("amount"));
            return po;
        }
        return null;
    }
    
    public boolean withDrawAmount(withPojo p) throws SQLException
    {
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre = con.prepareStatement("update customer set amount = ? where account_number = ? and pin = ?");
        pre.setDouble(1, p.getAmount());
        pre.setInt(2, p.getAccountNumber());
        pre.setInt(3, p.getPin());
        int result = pre.executeUpdate();
        if(result>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
