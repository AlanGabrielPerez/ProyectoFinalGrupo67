/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.Entidades;


public class Alojamiento {
    
    private int idAlojamiento;
    private String tipoAlojamiento;
    private String nombre;
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad ciudadDestino;

    public Alojamiento() {
    }

    public Alojamiento(String tipoAlojamiento, String nombre, boolean estado, String servicio, double importeDiario, Ciudad ciudadDestino) {
        this.tipoAlojamiento = tipoAlojamiento;
        this.nombre = nombre;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDestino = ciudadDestino;
    }

    public Alojamiento(int idAlojamiento, String tipoAlojamiento, boolean estado, String servicio, double importeDiario, Ciudad ciudadDestino) {
        this.idAlojamiento = idAlojamiento;
        this.tipoAlojamiento = tipoAlojamiento;
        this.nombre = nombre;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDestino = ciudadDestino;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + "(" + tipoAlojamiento + ") - " +  ciudadDestino ;
    }

    
    
   
    
}
