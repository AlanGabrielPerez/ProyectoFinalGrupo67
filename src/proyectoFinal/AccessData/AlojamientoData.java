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

    public AlojamientoData() {

        con = Conexion.getConnection();
    }            

    public void guardarAlojamiento(Alojamiento alojamiento) {

        String sql = "INSERT INTO `alojamiento`(`tipoAlojamiento`,`estado`, `servicio`, `importeDiario`, `ciudadDest`) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            
            ps.setString(1, alojamiento.getTipoAlojamiento());
            ps.setBoolean(2, alojamiento.isEstado());
            ps.setString(3, alojamiento.getServicio());
            ps.setDouble(4, alojamiento.getImporteDiario());
            ps.setString(5, alojamiento.getCiudadDestino().getNombre());
            ps.executeUpdate(sql);

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                alojamiento.setIdAlojamiento(1);
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
                alojamiento.getCiudadDestino().setNombre(rs.getString("ciudadDest"));

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

}
