package com.example.tdahaprendo.CursoComputo;

public class MainModelComputo {

    String titulocomputo, descripcomputo;

    MainModelComputo(){

    }

    public MainModelComputo(String titulocomputo, String descripcomputo) {
        this.titulocomputo = titulocomputo;
        this.descripcomputo = descripcomputo;
    }

    public String getTitulocomputo() {
        return titulocomputo;
    }

    public void setTitulocomputo(String titulocomputo) {
        this.titulocomputo = titulocomputo;
    }

    public String getDescripcomputo() {
        return descripcomputo;
    }

    public void setDescripcomputo(String descripcomputo) {
        this.descripcomputo = descripcomputo;
    }
}
