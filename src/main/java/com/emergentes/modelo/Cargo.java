
package com.emergentes.modelo;


public class Cargo {
    private int idCa;
    private String ncargo;


     public Cargo() {
        this.idCa = 0;
        this.ncargo = "";
    }

    public int getIdCa() {
        return idCa;
    }

    public void setIdCa(int idCa) {
        this.idCa = idCa;
    }

    public String getNcargo() {
        return ncargo;
    }

    public void setNcargo(String ncargo) {
        this.ncargo = ncargo;
    }

    @Override
    public String toString() {
        return "Cargo{" + "idCa=" + idCa + ", ncargo=" + ncargo + '}';
    }

    
    
    
}
