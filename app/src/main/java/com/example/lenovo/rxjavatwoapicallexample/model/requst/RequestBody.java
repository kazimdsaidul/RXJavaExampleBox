
package com.example.lenovo.rxjavatwoapicallexample.model.requst;



import com.example.lenovo.rxjavatwoapicallexample.model.requst.Body;
import com.google.gson.annotations.SerializedName;


public class RequestBody {

    @SerializedName("ApiKey")
    private String mApiKey;
    @SerializedName("AppId")
    private String mAppId;
    @SerializedName("Body")
    private Body mBody;
    @SerializedName("ClientId")
    private String mClientId;
    @SerializedName("Method")
    private String mMethod;

    public RequestBody(String mApiKey, String mAppId, String mClientId, String mMethod) {
        this.mApiKey = mApiKey;
        this.mAppId = mAppId;
        this.mClientId = mClientId;
        this.mMethod = mMethod;
    }

    public String getApiKey() {
        return mApiKey;
    }

    public void setApiKey(String ApiKey) {
        mApiKey = ApiKey;
    }

    public String getAppId() {
        return mAppId;
    }

    public void setAppId(String AppId) {
        mAppId = AppId;
    }

    public Body getBody() {
        return mBody;
    }

    public void setBody(Body Body) {
        mBody = Body;
    }

    public String getClientId() {
        return mClientId;
    }

    public void setClientId(String ClientId) {
        mClientId = ClientId;
    }

    public String getMethod() {
        return mMethod;
    }

    public void setMethod(String Method) {
        mMethod = Method;
    }

}
