/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal;

import java.time.LocalDate;
import java.time.Month;
import proyectoFinal.AccessData.AlojamientoData;
import proyectoFinal.AccessData.CiudadData;
import proyectoFinal.AccessData.PaqueteData;
import proyectoFinal.Entidades.Alojamiento;
import proyectoFinal.Entidades.Ciudad;
import proyectoFinal.Entidades.Paquete;

/**
 *
 * @author Asus
 */
public class PaquetesTuristicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        PaqueteData pd = new PaqueteData();
        for (Paquete p: pd.listaPaquete("h")){
            System.out.println(p.toString());
        }
       
        
    }
}
