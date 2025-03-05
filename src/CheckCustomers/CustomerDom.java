
package CheckCustomers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mySqlConnect.MySqlConnection;

public class CustomerDom 
{
    public List<CustomerPojo> CustomerDetails() throws SQLException
    {
        List<CustomerPojo> li = new ArrayList();
        Connection con = MySqlConnection.getMysqlConnection();
        PreparedStatement pre = con.prepareStatement("select * from customer");
        ResultSet rs = pre.executeQuery();
        
        while(rs.next())
        {
            CustomerPojo pojo = new CustomerPojo();
            
            pojo.setAccnumber(rs.getInt("account_number"));
            pojo.setName(rs.getString("name"));
            pojo.setAadhar(rs.getLong("aadharNumber"));
            pojo.setAddress(rs.getString("address"));
            pojo.setFatherName(rs.getString("fathersname"));
            pojo.setPin(rs.getInt("pin"));
            pojo.setAmount(rs.getDouble("amount"));
            pojo.setPhno(rs.getLong("phno"));
            
            li.add(pojo);
        }
        return li;
    }
}
