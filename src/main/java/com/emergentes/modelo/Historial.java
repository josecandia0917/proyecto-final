
package com.emergentes.modelo;

public class Historial {
   private int idHi;
   private String ingreso;
   private String aporte;
   private String participaciones;

    public Historial() {
        this.idHi = 0;
        this.ingreso = "";
        this.aporte = "";
        this.participaciones = "";
    }



    public int getIdHi() {
        return idHi;
    }

    public void setIdHi(int idHi) {
        this.idHi = idHi;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getAporte() {
        return aporte;
    }

    public void setAporte(String aporte) {
        this.aporte = aporte;
    }

    public String getParticipaciones() {
        return participaciones;
    }

    public void setParticipaciones(String participaciones) {
        this.participaciones = participaciones;
    }

    @Override
    public String toString() {
        return "Historial{" + "idHi=" + idHi + ", ingreso=" + ingreso + ", aporte=" + aporte + ", participaciones=" + participaciones + '}';
    }
    
    
   
   
}
