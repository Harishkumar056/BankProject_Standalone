
package adminPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class adminDao 
{
    public boolean verifyAdmin(adminPojo po) throws SQLException
    {
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre = con.prepareStatement("select * from bank_admin where name = ? and pin = ?");
        pre.setString(1, po.getName());
        pre.setInt(2,po.getPin());
        
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
