package com.example.crudwithretrofit.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {
    private static String baseUrl="http://192.168.43.101/androidku/";
    private static Retrofit retro;

    public static Retrofit konekRetrofit(){
        if(retro==null){
            retro = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retro;
    }
}
