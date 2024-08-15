package com.example.tdahaprendo.CursoCiencia;

public class MainModelCiencia {

    String titulociencia, descripciencia;

    MainModelCiencia(){


    }

    public MainModelCiencia(String titulociencia, String descripciencia) {
        this.titulociencia = titulociencia;
        this.descripciencia = descripciencia;
    }

    public String getTitulociencia() {
        return titulociencia;
    }

    public void setTitulociencia(String titulociencia) {
        this.titulociencia = titulociencia;
    }

    public String getDescripciencia() {
        return descripciencia;
    }

    public void setDescripciencia(String descripciencia) {
        this.descripciencia = descripciencia;
    }
}
