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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectoFinal.Entidades.Alojamiento;

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

        String sql = "INSERT INTO `alojamiento`(`fechaIn`, `fechaOut`, `estado`, `servicio`, `importeDiario`, `ciudadDest`) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(alojamiento.getFechaIn()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaOut()));
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setString(6, alojamiento.getCiudadDestino().getNombre());
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
}
