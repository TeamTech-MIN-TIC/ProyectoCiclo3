package com.ProyectoCiclo3.proyectociclo3.entity;

public class EntidadEmpresa {

    private String nomempresa;
    private String dirempresa;
    private String telempresa;
    private String nitempresa;

    public EntidadEmpresa(String nomempresa, String dirempresa, String telempresa, String nitempresa) {
        this.nomempresa = nomempresa;
        this.dirempresa = dirempresa;
        this.telempresa = telempresa;
        this.nitempresa = nitempresa;
    }

    public EntidadEmpresa() {

    }

    public String getNomempresa() {
        return nomempresa;
    }

    public void setNomempresa(String nomempresa) {
        this.nomempresa = nomempresa;
    }

    public String getDirempresa(String s) {
        return dirempresa;
    }

    public void setDiremprresa(String diremprresa) {
        this.dirempresa = diremprresa;
    }

    public String getTelempresa() {
        return telempresa;
    }

    public void setTelempresa(String telemprresa) {
        this.telempresa = telemprresa;
    }

    public String getNitempresa() {
        return nitempresa;
    }

    public void setNitempresa(String nitemprresa) {
        this.nitempresa = nitemprresa;
    }
}
