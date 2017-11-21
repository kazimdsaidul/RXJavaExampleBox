package com.example.lenovo.rxjavatwoapicallexample.model.webservics;

import com.example.lenovo.rxjavatwoapicallexample.model.requst.RequestBody;
import com.example.lenovo.rxjavatwoapicallexample.model.respose.Respose;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by LENOVO on 21/11/2017.
 */

public interface ApiInterface {

    @POST("webservice/")
    Observable<Respose> getAmount(@Body  RequestBody requestBody);

}


