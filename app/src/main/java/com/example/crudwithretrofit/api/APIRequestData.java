package com.example.crudwithretrofit.api;

import com.example.crudwithretrofit.models.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("lihat.php")
    Call<ResponseModel>ardRetriveData();
}
