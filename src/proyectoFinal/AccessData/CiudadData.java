package proyectoFinal.AccessData;

import java.sql.Connection;


public class CiudadData {
    
    private Connection con;

    public CiudadData() {
        con = Conexion.getConnection();
    }
    
    
    
}
