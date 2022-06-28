
package com.emergentes.modelo;

public class Reportecoo {
        private int idRe;
        private String gsemana;
        private String fecha;
        private String hora;
        private String lugar;

    public Reportecoo() {
        this.idRe = 0;
        this.gsemana = "";
        this.fecha = "";
        this.hora = "";
        this.lugar = "";
    }

    public int getIdRe() {
        return idRe;
    }

    public void setIdRe(int idRe) {
        this.idRe = idRe;
    }

    public String getGsemana() {
        return gsemana;
    }

    public void setGsemana(String gsemana) {
        this.gsemana = gsemana;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Reportecoo{" + "idRe=" + idRe + ", gsemana=" + gsemana + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + '}';
    }

}
