/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.AccessData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectoFinal.Entidades.Alojamiento;
import proyectoFinal.Entidades.Ciudad;

/**
 *
 * @author julian
 */
public class AlojamientoData {

    private Connection con;
    
    private CiudadData ciu=new CiudadData();

    public AlojamientoData() {

        con = Conexion.getConnection();
        
    }            

    public void guardarAlojamiento(Alojamiento alojamiento) {

        String sql = "INSERT INTO `alojamiento`( `tipoAlojamiento`, `nombre`, `estado`, `servicio`, `importeDiario`, `ciudadDest`) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            
            ps.setString(1, alojamiento.getTipoAlojamiento());
            ps.setString(2, alojamiento.getNombre());    
            ps.setBoolean(3, alojamiento.isEstado());    
            ps.setString(4, alojamiento.getServicio()); 
            ps.setDouble(5, alojamiento.getImporteDiario());     
            ps.setString(6, alojamiento.getCiudadDestino().getNombre());      
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                alojamiento.setIdAlojamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alojamiento guardado");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }

    }

    public List<Alojamiento> listaAlojamiento() {

        String sql = "SELECT tipoAlojamiento, nombre, ciudadDest FROM Alojamiento WHERE estado = 1";

        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        PreparedStatement ps;
        

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            

            while (rs.next()) {

                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setCiudadDestino(ciu.buscarNombre(rs.getString("CiudadDest")));
                
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión SQL");
        }

        return alojamientos;

    }
    
    public Alojamiento alojamientoId(int id){
    String sql = "SELECT * FROM `alojamiento` WHERE `idAlojamiento` = ?";
    Alojamiento a = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
            a = new Alojamiento();
            a.getCiudadDestino().setNombre(rs.getString("ciudadDest"));
            a.setIdAlojamiento(id);
            a.setEstado(rs.getBoolean("estado")); 
            a.setImporteDiario(rs.getDouble("importeDiario"));
            a.setServicio(rs.getString("servicio"));
            a.setNombre(rs.getString("nombre"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión SQL");
        }
    return a;
    }
    
    public void modificarAlojamiento(Alojamiento alojamiento){
        
         String sql = "UPDATE `alojamiento` SET `tipoAlojamiento`=?,`nombre`=?,`estado`=?,`servicio`=?,`importeDiario`=?,`ciudadDest`=? WHERE idAlojamiento= ?";
            
          
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, alojamiento.getTipoAlojamiento());
            ps.setString(2, alojamiento.getNombre());
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            
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
}
    