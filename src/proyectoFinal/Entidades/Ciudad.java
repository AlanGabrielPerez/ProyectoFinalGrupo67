/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Pc
 */
public class Ciudad {
    private int idCiudad;
    private String nombre;
    private String provincia;
    private String pais;
    private boolean estado; 
    private LocalDate temAlta; 
    private LocalDate temMedia;
    private LocalDate temBaja;

    public Ciudad() {
    }

    public Ciudad(int idCiudad, String nombre, String provincia, String pais, boolean estado, LocalDate temAlta, LocalDate temMedia, LocalDate temBaja) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.provincia = provincia;
        this.pais = pais;
        this.estado = estado;
        this.temAlta = temAlta;
        this.temMedia = temMedia;
        this.temBaja = temBaja;
    }

    public Ciudad(String nombre, String provincia, String pais, boolean estado, LocalDate temAlta, LocalDate temMedia, LocalDate temBaja) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.pais = pais;
        this.estado = estado;
        this.temAlta = temAlta;
        this.temMedia = temMedia;
        this.temBaja = temBaja;
    }

    public LocalDate getTemAlta() {
        return temAlta;
    }

    public void setTemAlta(LocalDate temAlta) {
        this.temAlta = temAlta;
    }

    public LocalDate getTemMedia() {
        return temMedia;
    }

    public void setTemMedia(LocalDate temMedia) {
        this.temMedia = temMedia;
    }

    public LocalDate getTemBaja() {
        return temBaja;
    }

    public void setTemBaja(LocalDate temBaja) {
        this.temBaja = temBaja;
    }

  
   
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre + ",  " + provincia + ", " + pais;
    }
    
    
}
