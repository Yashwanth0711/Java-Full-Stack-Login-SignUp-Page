package SignUp;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Login.DB;

public class Addusers {
    public static void add(String user,String mail, String pass) throws ClassNotFoundException, SQLException {
        Connection con=DB.getConnection();
        Statement st=con.createStatement();
        st.execute("insert into users(Name,Mailid,password) values(\""+user+"\",\""+mail+"\",\""+pass+"\")");
    }
}