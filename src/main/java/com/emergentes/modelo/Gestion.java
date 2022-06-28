
package com.emergentes.modelo;

public class Gestion {
    private int idGe;
    private String gestion;
    
    
    
     public Gestion() {
        this.idGe = 0;
        this.gestion = " ";
    }

    public int getIdGe() {
        return idGe;
    }

    public void setIdGe(int idGe) {
        this.idGe = idGe;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @Override
    public String toString() {
        return "Gestion{" + "idGe=" + idGe + ", gestion=" + gestion + '}';
    }

    

    
     
    
}
