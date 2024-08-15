package com.example.tdahaprendo.CursoPersonal;

public class MainModelPersonal {

    String titulopersonal, descrippersonal;

    MainModelPersonal(){


    }

    public MainModelPersonal(String titulopersonal, String descrippersonal) {
        this.titulopersonal = titulopersonal;
        this.descrippersonal = descrippersonal;
    }

    public String getTitulopersonal() {
        return titulopersonal;
    }

    public void setTitulopersonal(String titulopersonal) {
        this.titulopersonal = titulopersonal;
    }

    public String getDescrippersonal() {
        return descrippersonal;
    }

    public void setDescrippersonal(String descrippersonal) {
        this.descrippersonal = descrippersonal;
    }
}
