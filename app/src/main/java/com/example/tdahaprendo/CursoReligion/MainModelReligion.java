package com.example.tdahaprendo.CursoReligion;

public class MainModelReligion {

    String tituloreligion, descripreligion;

    MainModelReligion(){


    }

    public MainModelReligion(String tituloreligion, String descripreligion) {
        this.tituloreligion = tituloreligion;
        this.descripreligion = descripreligion;
    }

    public String getTituloreligion() {
        return tituloreligion;
    }

    public void setTituloreligion(String tituloreligion) {
        this.tituloreligion = tituloreligion;
    }

    public String getDescripreligion() {
        return descripreligion;
    }

    public void setDescripreligion(String descripreligion) {
        this.descripreligion = descripreligion;
    }
}
