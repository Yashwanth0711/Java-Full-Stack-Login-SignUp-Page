
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCheck {
    public static boolean check(String user,String pass) throws ClassNotFoundException, SQLException {
        String str="select * from users where Name=\""+user+"\" and password=\""+pass+"\"";
        Connection con=DB.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(str); 

        return rs.next();
    }
}
