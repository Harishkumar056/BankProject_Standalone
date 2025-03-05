
package accountNumber;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mySqlConnect.MySqlConnection;

public class Dom 
{
    public Pojo getDetails() throws SQLException
    {
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre = con.prepareStatement("select name,account_number from customer order by account_number desc LIMIT 1");
        ResultSet rs = pre.executeQuery();
        Pojo p = new Pojo();
        if(rs.next())
        {
           p.setName(rs.getString("name"));
           p.setAccno(rs.getInt("account_number"));
        }
        return p;
    }
}
