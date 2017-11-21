
package com.example.lenovo.rxjavatwoapicallexample.model.requst;


import com.google.gson.annotations.SerializedName;



public class Body {

    @SerializedName("AmountToCheck")
    private String mAmountToCheck;
    @SerializedName("Token")
    private String mToken;

    public String getAmountToCheck() {
        return mAmountToCheck;
    }

    public void setAmountToCheck(String AmountToCheck) {
        mAmountToCheck = AmountToCheck;
    }

    public String getToken() {
        return mToken;
    }

    public void setToken(String Token) {
        mToken = Token;
    }

}
