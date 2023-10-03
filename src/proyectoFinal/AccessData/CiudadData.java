package proyectoFinal.AccessData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import proyectoFinal.Entidades.Ciudad;

/**
 *
 * @author Pc
 */
public class CiudadData {
    private Connection con; 

    public CiudadData() {
        con = Conexion.getConnection();

    }
    
    public void guardarCiudad(Ciudad ciudad){
     String sql = "INSERT INTO `ciudad`(`nombre`, `pais`, `estado`, `provincia`, `temAlta`, `temMedia`, `temBaja`) VALUES (?,?,?,?,?,?,?)";
     
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setBoolean(3, ciudad.isEstado());
            ps.setString(4, ciudad.getPais());
            ps.setDate(5, Date.valueOf(ciudad.getTemAlta()));
            ps.setDate(6, Date.valueOf(ciudad.getTemMedia()));
            ps.setDate(7, Date.valueOf(ciudad.getTemBaja()));
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
            ciudad.setIdCiudad(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Ciudad guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }
     
     
    }
    
    public void modificarCiudad(Ciudad ciudad){
    String sql = "UPDATE `ciudad` SET `nombre`=?,`pais`=?,`estado`=?,`provincia`=?,`temAlta`=?,`temMedia`=?,`temBaja`=? WHERE idCiudad = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
                  
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setBoolean(3, ciudad.isEstado());
            ps.setString(4, ciudad.getPais());
            ps.setDate(5, Date.valueOf(ciudad.getTemAlta()));
            ps.setDate(6, Date.valueOf(ciudad.getTemMedia()));
            ps.setDate(7, Date.valueOf(ciudad.getTemBaja()));
            ps.setInt(8, ciudad.getIdCiudad());
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            JOptionPane.showMessageDialog(null, "Ciudad modificado");
            } else {
            JOptionPane.showMessageDialog(null, "Error al modificar");
            
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }
    
    }
    
    public void eliminarCiudad(Ciudad ciudad){
    String sql = "UPDATE `ciudad` SET `estado`= 0 WHERE idCiudad = ? and estado = 1";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudad.getIdCiudad());
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            JOptionPane.showMessageDialog(null, "Ciudad dada de baja");
            
            } else {
            JOptionPane.showMessageDialog(null, "Error al modificar");
            }
            
            ps.close();
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }
    
    }
    
    public List <Ciudad> listarCiudad(){
        String sql = "SELECT * FROM `ciudad` WHERE estado = 1";
        ArrayList <Ciudad> listado = new ArrayList <>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            Ciudad ciu = new Ciudad();
            
            ciu.setIdCiudad(rs.getInt("idCiudad"));
            ciu.setEstado(rs.getBoolean("estado"));
            ciu.setNombre(rs.getString("nombre"));
            ciu.setProvincia(rs.getString("provincia"));
            ciu.setPais(rs.getString("pais"));
            ciu.setTemAlta(rs.getDate("temAlta").toLocalDate());
            ciu.setTemMedia(rs.getDate("temMedia").toLocalDate());
            ciu.setTemBaja(rs.getDate("temBaja").toLocalDate());
            listado.add(ciu);
            
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }
        return listado;
    }
    
    public List <Ciudad> ciudadesInactivas(){
        String sql = "SELECT * FROM `ciudad` WHERE estado = 0";
        ArrayList <Ciudad> listado = new ArrayList <>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            Ciudad ciu = new Ciudad();
            
            ciu.setIdCiudad(rs.getInt("idCiudad"));
            ciu.setEstado(rs.getBoolean("estado"));
            ciu.setNombre(rs.getString("nombre"));
            ciu.setProvincia(rs.getString("provincia"));
            ciu.setPais(rs.getString("pais"));
            ciu.setTemAlta(rs.getDate("temAlta").toLocalDate());
            ciu.setTemMedia(rs.getDate("temMedia").toLocalDate());
            ciu.setTemBaja(rs.getDate("temBaja").toLocalDate());
            listado.add(ciu);
            
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }
        return listado;
    }
    
    
}