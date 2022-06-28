
package com.emergentes.modelo;


public class Informe {
    private int idIn;
    private int socioid;
    private int cargoid;
    private int repoid;  
    private String finf;
    private String apaterno;
    private String amaterno;
    private String nombres;
    private String ncargo;
    private String gsemana;
    private String fecha;
    private String hora;
    private String lugar;

    public Informe() {
        this.idIn = 0;
        this.socioid = 0;
        this.cargoid = 0;
        this.repoid = 0;
        this.finf = "";
        this.apaterno = "";
        this.amaterno = "";
        this.nombres = "";
        this.ncargo = "";
        this.gsemana = "";
        this.fecha = "";
        this.hora = "";
        this.lugar = "";
    }

    public int getIdIn() {
        return idIn;
    }

    public void setIdIn(int idIn) {
        this.idIn = idIn;
    }

    public int getSocioid() {
        return socioid;
    }

    public void setSocioid(int socioid) {
        this.socioid = socioid;
    }

    public int getCargoid() {
        return cargoid;
    }

    public void setCargoid(int cargoid) {
        this.cargoid = cargoid;
    }

    public int getRepoid() {
        return repoid;
    }

    public void setRepoid(int repoid) {
        this.repoid = repoid;
    }

    public String getFinf() {
        return finf;
    }

    public void setFinf(String finf) {
        this.finf = finf;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNcargo() {
        return ncargo;
    }

    public void setNcargo(String ncargo) {
        this.ncargo = ncargo;
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
        return "Informe{" + "idIn=" + idIn + ", socioid=" + socioid + ", cargoid=" + cargoid + ", repoid=" + repoid + ", finf=" + finf + ", apaterno=" + apaterno + ", amaterno=" + amaterno + ", nombres=" + nombres + ", ncargo=" + ncargo + ", gsemana=" + gsemana + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + '}';
    }
    
  
}
