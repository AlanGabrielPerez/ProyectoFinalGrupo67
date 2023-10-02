package proyectoFinal.AccessData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String db = "proyectotransversal";
    private static final String usuario = "root";
    private static  String contrasena = "";
    
    private static Connection connection;

    public Conexion() {
    }
    
    public static Connection getConnection(){
    
        if (connection == null){
        
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+db+"?useLegacyDatatimeCode=False&serverTimezone=UTC" + 
                        "&user=" + usuario + "&password" + contrasena);
            } catch (ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "error en el package del driver");
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "error en la conexion. \n" + ex.getMessage());
            }
            
        }
        return connection;
    }
    
}
