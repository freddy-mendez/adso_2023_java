
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConectarBD {
    private String server = "localhost";
    private int port = 3306;
    private String username = "root";
    private String password = "";
    private String dbname = "ventas_2023";
    private String url = "jdbc:mysql://"+server+":"+port+"/"+dbname;
    private Connection conexion = null;
    
    public ConectarBD() {
        
        
        try {
            conexion = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Connection getConexion() {
        return conexion;
    }
    
    public static void main(String[] args) {
        ConectarBD db = new ConectarBD();
    }
}
