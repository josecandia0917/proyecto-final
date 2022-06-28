
package com.emergentes.modelo;

public class Socios {
    private int idSo;
    private String apaterno;
    private String amaterno;
    private String nombres;
    private String fnac;
    private int ci;
    private int celular;
    private String correo;

    public Socios() {
        this.idSo = 0;
        this.apaterno = "";
        this.amaterno = "";
        this.nombres = "";
        this.fnac = "";
        this.ci = 0;
        this.celular = 0;
        this.correo = "";
    }

    public int getIdSo() {
        return idSo;
    }

    public void setIdSo(int idSo) {
        this.idSo = idSo;
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

    public String getFnac() {
        return fnac;
    }

    public void setFnac(String fnac) {
        this.fnac = fnac;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Socios{" + "idSo=" + idSo + ", apaterno=" + apaterno + ", amaterno=" + amaterno + ", nombres=" + nombres + ", fnac=" + fnac + ", ci=" + ci + ", celular=" + celular + ", correo=" + correo + '}';
    }
    
    
}
