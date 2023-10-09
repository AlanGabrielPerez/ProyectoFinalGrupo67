
package proyectoFinal.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;


public class Paquete {
    
    private int idPaquete;
    private Ciudad origen;
    private Pasaje pasaje;
    private Alojamiento alojamiento;
    private Ciudad Destino;
    private LocalDate fechaIn;
    private LocalDate fechaOut;

    public Paquete() {
    }

    public Paquete(Ciudad origen, Pasaje pasaje, Alojamiento alojamiento, Ciudad Destino, LocalDate fechaIn, LocalDate fechaOut) {
        this.origen = origen;
        this.pasaje = pasaje;
        this.alojamiento = alojamiento;
        this.Destino = Destino;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
    }
    

    public Paquete(int idPasaje, Ciudad origen, Pasaje pasaje, Alojamiento alojamiento, Ciudad Destino, LocalDate fechaIn, LocalDate FechaOut) {
        this.idPaquete = idPaquete;
        this.origen = origen;
        this.pasaje = pasaje;
        this.alojamiento = alojamiento;
        this.Destino = Destino;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(LocalDate fechaOut) {
        this.fechaOut = fechaOut;
    }
 
    
    
    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Ciudad getDestino() {
        return Destino;
    }

    public void setDestino(Ciudad Destino) {
        this.Destino = Destino;
    }
   
    
    
}
