
package com.example.lenovo.rxjavatwoapicallexample.model.respose;


import com.google.gson.annotations.SerializedName;


public class Result {

    @SerializedName("Balance")
    private Double mBalance;
    @SerializedName("Currency")
    private String mCurrency;
    @SerializedName("isAvailable")
    private Boolean mIsAvailable;

    public Double getBalance() {
        return mBalance;
    }

    public void setBalance(Double Balance) {
        mBalance = Balance;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String Currency) {
        mCurrency = Currency;
    }

    public Boolean getIsAvailable() {
        return mIsAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        mIsAvailable = isAvailable;
    }

}
