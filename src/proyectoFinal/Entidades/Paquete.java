
package proyectoFinal.Entidades;


public class Paquete {
    
    private int idPaquete;
    private Ciudad origen;
    private Pasaje pasaje;
    private Alojamiento alojamiento;
    private Ciudad Destino;

    public Paquete() {
    }

    public Paquete(Ciudad origen, Pasaje pasaje, Alojamiento alojamiento, Ciudad Destino) {
        this.origen = origen;
        this.pasaje = pasaje;
        this.alojamiento = alojamiento;
        this.Destino = Destino;
    }

    public Paquete(int idPasaje, Ciudad origen, Pasaje pasaje, Alojamiento alojamiento, Ciudad Destino) {
        this.idPaquete = idPaquete;
        this.origen = origen;
        this.pasaje = pasaje;
        this.alojamiento = alojamiento;
        this.Destino = Destino;
    }

    public int getIdPasaje() {
        return idPaquete;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPaquete = idPasaje;
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
