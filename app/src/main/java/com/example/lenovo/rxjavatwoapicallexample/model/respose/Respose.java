
package com.example.lenovo.rxjavatwoapicallexample.model.respose;


import com.google.gson.annotations.SerializedName;



public class Respose {


    @SerializedName("status_code")
    private Long mStatusCode;

    @SerializedName("result")
    private Result mResult;


    public Result getResult() {
        return mResult;
    }

    public void setResult(Result result) {
        mResult = result;
    }

    public Long getStatusCode() {
        return mStatusCode;
    }

    public void setStatusCode(Long statusCode) {
        mStatusCode = statusCode;
    }

}
