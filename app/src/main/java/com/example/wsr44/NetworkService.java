package com.example.wsr44;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    public static String BASE_URL = "http://mskko2021.mad.hakta.pro/";
    public static NetworkService instance;
    public Retrofit retrofit;

    public  NetworkService(){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static NetworkService getInstance() {
        if(instance == null){
            instance = new NetworkService();
        }
        return instance;
    }
    public Api GetApi(){
        return retrofit.create(Api.class);
    }
}
