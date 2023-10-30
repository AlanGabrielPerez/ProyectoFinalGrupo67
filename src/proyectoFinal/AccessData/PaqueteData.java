
package proyectoFinal.AccessData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import proyectoFinal.Entidades.Paquete;


public class PaqueteData {
    private Connection con; 
    private CiudadData ciudad = new CiudadData();
    private PasajeData pasaje =  new PasajeData();
    private AlojamientoData alojamiento = new AlojamientoData();
    

    public PaqueteData() {
       con = Conexion.getConnection();
        
    }
    
    public void armarPaquete(Paquete paquete) {
        String sql = "INSERT INTO `paquete`( `idOrigen`, `idPasaje`, `idAlojamiento`, `idDestino`, `fechaIn`, `fechaOut`, `email`, `monto`, `cantPasajeros`) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getPasaje().getIdPasaje());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getDestino().getIdCiudad());
            ps.setDate(5, Date.valueOf(paquete.getFechaIn()));
            ps.setDate(6, Date.valueOf(paquete.getFechaOut()));
            ps.setString(7, paquete.getEmail());
            ps.setDouble(8, paquete.getMonto());
            ps.setInt(9, paquete.getCantPasajeros());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paquete.setIdPaquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete guardado.");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }

    }

    public void eliminarPaquete(int id) {
        String sql = "DELETE FROM `paquete` WHERE idPaquete = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paquete eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }

    }
    
    public Paquete buscarPaquete (int id){
        String sql = "SELECT * FROM `paquete` WHERE idPaquete = ?";
        Paquete paquete = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
               paquete = new Paquete();
               paquete.setIdPaquete(id);
               paquete.setOrigen(ciudad.ciudadId(rs.getInt("idOrigen")));
               paquete.setDestino(ciudad.ciudadId(rs.getInt("idDestino")));
               paquete.setAlojamiento(alojamiento.alojamientoId(rs.getInt("idAlojamiento")));
               paquete.setPasaje(pasaje.pasajeId(rs.getInt("idPasaje")));
               paquete.setFechaIn(rs.getDate("fechaIn").toLocalDate());
               paquete.setFechaOut(rs.getDate("fechaOut").toLocalDate());
               paquete.setEmail(rs.getString("email"));
               paquete.setMonto(rs.getDouble("monto"));
               paquete.setCantPasajeros(rs.getInt("cantPasajeros"));
            }else {
                JOptionPane.showMessageDialog(null,"No se encontro el paquete");
           
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el mensaje sql");
        }
           
        return paquete;
        
    }
    
    public HashSet <String> listaEmail(){
    String sql = "SELECT  `email` FROM `paquete` WHERE `idPaquete` > 0";
    HashSet <String> hs = new HashSet<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            hs.add(rs.getString("email"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el sql");
        }
     return hs;
    }
    
    public List <Paquete> listaPaquete(String email){
    String sql = "SELECT * FROM `paquete` WHERE `email` = ?";
    
    ArrayList <Paquete> ap = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
               Paquete paquete = new Paquete();
               paquete.setIdPaquete(rs.getInt("idPaquete"));
               paquete.setOrigen(ciudad.ciudadId(rs.getInt("idOrigen")));
               paquete.setDestino(ciudad.ciudadId(rs.getInt("idDestino")));
               paquete.setAlojamiento(alojamiento.alojamientoId(rs.getInt("idAlojamiento")));
               paquete.setPasaje(pasaje.pasajeId(rs.getInt("idPasaje")));
               paquete.setFechaIn(rs.getDate("fechaIn").toLocalDate());
               paquete.setFechaOut(rs.getDate("fechaOut").toLocalDate());
               paquete.setEmail(rs.getString("email"));
               paquete.setMonto(rs.getDouble("monto"));
               paquete.setCantPasajeros(rs.getInt("cantPasajeros"));
                 ap.add(paquete);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el sql");
        }
        return ap;
    }

}
