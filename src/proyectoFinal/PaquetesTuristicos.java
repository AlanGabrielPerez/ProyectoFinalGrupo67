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
import proyectoFinal.Entidades.Alojamiento;
import proyectoFinal.Entidades.Ciudad;

/**
 *
 * @author Asus
 */
public class PaquetesTuristicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ciudad Mendoza=new Ciudad("Mendoza" ,"Mendoza","Argentina",true, LocalDate.of(2000,1, 1),LocalDate.of(2000,9, 1),LocalDate.of(2000,5, 1));
        Ciudad Cordoba=new Ciudad("Cordoba","nueva cordoba","Bolivia",true, LocalDate.of(2000,5, 1),LocalDate.of(2000,9, 1),LocalDate.of(2000,12, 1));
        Ciudad ElCalafate=new Ciudad("ElCalafate","Santa Cruz","Argentina",true, LocalDate.of(2000,12, 1),LocalDate.of(2000,8, 1),LocalDate.of(2000,4, 1));
        Ciudad caba = new Ciudad("CABA","Buenos Aires","Argentina",true,LocalDate.of(2000,11, 30),LocalDate.of(2000,4, 1),LocalDate.of(2000,12, 1));
        
        //CiudadData ciu=new CiudadData();
        //ciu.guardarCiudad(Cordoba);
        //ciu.guardarCiudad(Mendoza);
        //ciu.guardarCiudad(ElCalafate);
        //Ciudad ciuCiu = ciu.ciudadId(1);
//        Cordoba.setNombre("Vieja cordoba");
//        ciu.modificarCiudad(Cordoba);
        //ciu.eliminarCiudad(5);
        //System.out.println(ciu.ciudadId(1).toString());
        //System.out.println("lista de ciudades:");
        //for(Ciudad c:ciu.listarCiudad()){
        //System.out.println(c);
        
       // }
        //ciu.eliminarCiudad(1);
        //System.out.println("Ciudades inactivas:");
        //for(Ciudad c2:ciu.ciudadesInactivas()){
          //  System.out.println(c2);
        //}
        
        //Alojamiento alojamiento = new Alojamiento("Hostel","Los Hermeticos", true, "Desayuno",50000,Cordoba);
        //AlojamientoData ad= new AlojamientoData();
        //ad.guardarAlojamiento(alojamiento);
    }
}
