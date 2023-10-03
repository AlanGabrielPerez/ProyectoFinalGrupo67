/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.Entidades;

/**
 *
 * @author Pc
 */
public class Pasaje {
    private int idPasaje;
    private String tipoDeTransporte;
    private double importe;
    private Ciudad ciudadOrigen;
    private boolean estado; 

    public Pasaje() {
    }

    public Pasaje(int idPasaje, String tipoDeTransporte, double importe, Ciudad ciudadOrigen, boolean estado) {
        this.idPasaje = idPasaje;
        this.tipoDeTransporte = tipoDeTransporte;
        this.importe = importe;
        this.ciudadOrigen = ciudadOrigen;
        this.estado = estado;
    }

    public Pasaje(String tipoDeTransporte, double importe, Ciudad ciudadOrigen, boolean estado) {
        this.tipoDeTransporte = tipoDeTransporte;
        this.importe = importe;
        this.ciudadOrigen = ciudadOrigen;
        this.estado = estado;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }


    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "pasaje{" + "idPasaje=" + idPasaje + ", tipoDeTransporte=" + tipoDeTransporte + ", importe=" + importe + ", ciudadOrigen=" + ciudadOrigen + ", estado=" + estado + '}';
    }
    
    
    
}
