import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jdbc.Driver;
public class DB  {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        new Driver();
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","0711");
        return con;
    }
}