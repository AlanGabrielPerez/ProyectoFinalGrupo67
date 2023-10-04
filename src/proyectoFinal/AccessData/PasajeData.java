/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.AccessData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import proyectoFinal.Entidades.Pasaje;

/**
 *
 * @author Pc
 */
public class PasajeData {
    private Connection con;
    
    public PasajeData() {
        con = Conexion.getConnection();
    }
    
    public void crearPasaje(Pasaje pasaje){
        String sql = "INSERT INTO `pasaje`(`tipoTransporte`, `importe`, `origen`, `estado`) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasaje.getTipoDeTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setString(3, pasaje.getCiudadOrigen().getNombre());
            ps.setBoolean(4, pasaje.isEstado());
            ps.execute();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
            pasaje.setIdPasaje(1);
            JOptionPane.showMessageDialog(null, "Pasaje creado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el sql");
        }
        
    }
    
    public void eliminarPasaje(int id){
    String sql = "UPDATE `pasaje` SET `estado`='0' WHERE idPasaje = ? estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
             int exito = ps.executeUpdate();
             
             if (exito == 1){
             JOptionPane.showMessageDialog(null, "Pasaje eliminado");
             } else {
             JOptionPane.showMessageDialog(null, "Error al eliminar el pasaje");
             }
             
             ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el sql");
        }
    }
    
    public void modificarPasaje (Pasaje pasaje){
    String sql = "UPDATE `pasaje` SET `tipoTransporte`= ?,`importe`=?,`origen`=?,`estado`= ? WHERE idPasaje = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipoDeTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setString(3, pasaje.getCiudadOrigen().getNombre());
            ps.setBoolean(4, pasaje.isEstado());
            ps.setInt(5, pasaje.getIdPasaje());
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            JOptionPane.showMessageDialog(null, "Alumno modificado");
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el sql");
        }
    }
    
}
