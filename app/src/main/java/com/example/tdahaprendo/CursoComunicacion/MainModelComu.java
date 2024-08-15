package com.example.tdahaprendo.CursoComunicacion;

public class MainModelComu {

    String titulocomu, descripcomu;

    MainModelComu(){

    }

    public MainModelComu(String titulocomu, String descripcomu) {
        this.titulocomu = titulocomu;
        this.descripcomu = descripcomu;
    }

    public String getTitulocomu() {
        return titulocomu;
    }

    public void setTitulocomu(String titulocomu) {
        this.titulocomu = titulocomu;
    }

    public String getDescripcomu() {
        return descripcomu;
    }

    public void setDescripcomu(String descripcomu) {
        this.descripcomu = descripcomu;
    }
}
