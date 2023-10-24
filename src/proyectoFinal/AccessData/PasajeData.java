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
import java.util.ArrayList;
import java.util.List;
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
    private CiudadData cd = new CiudadData();
    
    public PasajeData() {
        con = Conexion.getConnection();
        
    }
    
    public void crearPasaje(Pasaje pasaje){
        String sql = "INSERT INTO `pasaje`(`tipoTransporte`, `importe`, `origen`, `estado`, `destino`) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasaje.getTipoDeTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setString(3, pasaje.getCiudadOrigen().getNombre());
            ps.setBoolean(4, pasaje.isEstado());
            ps.setString(5,pasaje.getCiudadDestino().getNombre());
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
    
    public void activarPasaje(int id, boolean estado){
    String sql = "UPDATE `pasaje` SET `estado`=? WHERE idPasaje = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ps.setInt(2, id);
            int exito = ps.executeUpdate();
             
             if (exito != 1){
                  JOptionPane.showMessageDialog(null, "Error al actualizar el estado del pasaje");
             }              
             ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el sql");
        }
    }
    
    public void modificarPasaje (Pasaje pasaje){
    String sql = "UPDATE `pasaje` SET `tipoTransporte`= ?,`importe`=?,`origen`=?,`estado`= ?, `destino`= ? WHERE idPasaje = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipoDeTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setString(3, pasaje.getCiudadOrigen().getNombre());
            ps.setBoolean(4, pasaje.isEstado());
            ps.setString(5, pasaje.getCiudadDestino().getNombre());
            ps.setInt(6, pasaje.getIdPasaje());
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            JOptionPane.showMessageDialog(null, "Pasaje modificado");
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el sql");
        }
    }
    
        public void eliminarPasaje(int id) {
        String sql = "DELETE FROM `pasaje` WHERE idPasaje = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pasaje eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }

    }
    
    public List listaTransporte (String pasaje) {
    String sql = "SELECT * FROM `pasaje` WHERE `tipoTransporte` = ?";
    ArrayList <Pasaje> listado = new ArrayList <>();
    
        try { 
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasaje);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            Pasaje p = new Pasaje();
            p.setIdPasaje(rs.getInt("idPasaje"));
            p.getCiudadOrigen().setNombre("origen");
            p.getCiudadDestino().setNombre(rs.getString(rs.getString("destino")));
            p.setEstado(rs.getBoolean("estado"));
            p.setTipoDeTransporte(rs.getString("tipoTransporte"));
            p.setImporte(rs.getDouble("importe"));
            listado.add(p);
            
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el sql");
        }
        
        return listado;
    }
    
    public Pasaje pasajeId(int id){
    String sql = "SELECT * FROM `pasaje` WHERE idPasaje = ?";
    Pasaje p = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
            p = new Pasaje ();
            p.setIdPasaje(id);
            p.setCiudadOrigen(cd.buscarNombre(rs.getString("origen")));
            p.setCiudadDestino(cd.buscarNombre(rs.getString("destino")));
            p.setEstado(rs.getBoolean("estado"));
            p.setImporte(rs.getDouble("importe"));
            p.setTipoDeTransporte(rs.getString("tipoTransporte"));
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el sql");
        }
        return p;
    }
    
    public List<Pasaje> listarPasajes(){
        ArrayList <Pasaje> lista = new ArrayList<>();
        String sql =  "SELECT * FROM pasaje";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pasaje p = new Pasaje();
                p.setIdPasaje(rs.getInt("idPasaje"));
                p.setTipoDeTransporte(rs.getString("tipoTransporte"));
                p.setImporte(rs.getDouble("importe"));
                p.setCiudadOrigen(cd.buscarNombre(rs.getString("origen")));
                p.setCiudadDestino(cd.buscarNombre(rs.getString("destino")));
                p.setEstado(rs.getBoolean("estado"));
                
                lista.add(p);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL");
        }
        
        return lista;
        
    }
    
    
}
