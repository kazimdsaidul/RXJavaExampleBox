package com.example.lenovo.rxjavatwoapicallexample.model.webservics;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LENOVO on 21/11/2017.
 */

public class APIService {
    public static final String BASE_URL = "https://aucorpws.com/";
    private static Retrofit retrofit = null;


    public static Retrofit getRetrofitClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
