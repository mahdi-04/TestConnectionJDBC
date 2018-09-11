
import java.sql.*;

public class TestConnectionJDBC {

    private final static String DB_URL = "jdbc:oracle:thin:@//127.0.0.1:1521/CDB";
    private final static String USER = "system";
    private final static String PASS = "bjwJdH4a4srP9DDF";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                System.out.println("Connection To Database is OK");
                try {
                    conn.close();
                } catch (SQLException e) {
                    // ignore    
                }
            } else {
                System.out.println("Connection To Database is NOKAY");
            }
        }
    }
}
