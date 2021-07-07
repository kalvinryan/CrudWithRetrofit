package com.example.crudwithretrofit.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseModel {
    private String pesan;
    private int kode;
    private List<DataModel> data;

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public List<DataModel> getData() {
        return data;
    }

    public void setData(List<DataModel> data) {
        this.data = data;
    }
}
