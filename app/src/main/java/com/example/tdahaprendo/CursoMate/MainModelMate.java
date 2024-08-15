package com.example.tdahaprendo.CursoMate;

public class MainModelMate {

    String titulomate, descripmate;

    MainModelMate (){


    }

    public MainModelMate(String titulomate, String descripmate) {
        this.titulomate = titulomate;
        this.descripmate = descripmate;
    }

    public String getTitulomate() {
        return titulomate;
    }

    public void setTitulomate(String titulomate) {
        this.titulomate = titulomate;
    }

    public String getDescripmate() {
        return descripmate;
    }

    public void setDescripmate(String descripmate) {
        this.descripmate = descripmate;
    }
}
