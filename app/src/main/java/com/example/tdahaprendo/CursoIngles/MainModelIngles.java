package com.example.tdahaprendo.CursoIngles;

public class MainModelIngles {

    String tituloingles, descripingles;

    MainModelIngles(){


    }

    public MainModelIngles(String tituloingles, String descripingles) {
        this.tituloingles = tituloingles;
        this.descripingles = descripingles;
    }

    public String getTituloingles() {
        return tituloingles;
    }

    public void setTituloingles(String tituloingles) {
        this.tituloingles = tituloingles;
    }

    public String getDescripingles() {
        return descripingles;
    }

    public void setDescripingles(String descripingles) {
        this.descripingles = descripingles;
    }
}
