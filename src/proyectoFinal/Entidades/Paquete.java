package proyectoFinal.Entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Paquete {

    private int idPaquete;
    private Ciudad origen;
    private Pasaje pasaje;
    private Alojamiento alojamiento;
    private Ciudad Destino;
    private LocalDate fechaIn;
    private LocalDate fechaOut;
    private String email;
    private double monto;
    private int cantPasajeros;

    public Paquete() {
    }

    public Paquete(int idPaquete, Ciudad origen, Pasaje pasaje, Alojamiento alojamiento, Ciudad Destino, LocalDate fechaIn, LocalDate fechaOut, String email, double monto, int cantPasajeros) {
        this.idPaquete = idPaquete;
        this.origen = origen;
        this.pasaje = pasaje;
        this.alojamiento = alojamiento;
        this.Destino = Destino;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.email = email;
        this.monto = monto;
        this.cantPasajeros = cantPasajeros;
    }

    public Paquete(Ciudad origen, Pasaje pasaje, Alojamiento alojamiento, Ciudad Destino, LocalDate fechaIn, LocalDate fechaOut, String email, double monto, int cantPasajeros) {
        this.origen = origen;
        this.pasaje = pasaje;
        this.alojamiento = alojamiento;
        this.Destino = Destino;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.email = email;
        this.monto = monto;
        this.cantPasajeros = cantPasajeros;
    }
    
       public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
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

    @Override
    public String toString() {
        return  pasaje.getTipoDeTransporte()+" - " + origen.getNombre()+", "+origen.getProvincia() + " destino " + Destino.getNombre() + ", " + Destino.getProvincia();
    }
    

}
