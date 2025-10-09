
package com.mycompany.taller_programacion_2.Modelo;

public class Pais {
   private int  idpais;
   private String descripcion;

    public Pais(int idpais, String descripcion) {
        this.idpais = idpais;
        this.descripcion = descripcion;
    }
    public Pais() {
    }

    public int getIdpais() {
        return idpais;
    }
    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pais{" + "idpais=" + idpais + ", descripcion=" + descripcion + '}';
    }
   
}
