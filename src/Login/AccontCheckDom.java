
package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class AccontCheckDom 
{

    public boolean checkAccount(AccountPojo po) throws SQLException
    {
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre = con.prepareStatement("select * from customer where account_number = ? and pin = ?");
        pre.setInt(1, po.getAccnum());
        pre.setInt(2, po.getPin());
        ResultSet result = pre.executeQuery();
        if(result.next())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
