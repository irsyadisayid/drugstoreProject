package koneksi;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static Connection koneksi;
    public static Connection getConnection() throws SQLException{
        if (koneksi==null) {
            new Driver();
            koneksi=(Connection)DriverManager.getConnection("");
        }
        return koneksi;
    }
}
