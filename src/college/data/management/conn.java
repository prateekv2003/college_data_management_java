
package college.data.management;

import java.sql.*;

public class conn {
    
    Connection c;
    Statement s;
    
    public conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///college_data_management","root","");
            s = c.createStatement();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}