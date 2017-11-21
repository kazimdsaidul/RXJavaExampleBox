package com.example.lenovo.rxjavatwoapicallexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.lenovo.rxjavatwoapicallexample.model.requst.Body;
import com.example.lenovo.rxjavatwoapicallexample.model.requst.RequestBody;
import com.example.lenovo.rxjavatwoapicallexample.model.respose.Respose;
import com.example.lenovo.rxjavatwoapicallexample.model.webservics.APIService;
import com.example.lenovo.rxjavatwoapicallexample.model.webservics.ApiInterface;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.Subject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multipleAPICall();


    }

    private void multipleAPICall() {
        // request object
        Body body = new Body();
        body.setAmountToCheck("11");
        body.setToken("241785278");

        RequestBody requestBody = new RequestBody("x5gb5smmaa4d9n4jf8ghnkc9v45bppz6", "au-accounts", "Xaw287-3", "balance");
        requestBody.setBody(body);


        // start http calling
        Observable.zip(APIService.getRetrofitClient().create(ApiInterface.class).getAmount(requestBody),
                APIService.getRetrofitClient().create(ApiInterface.class).getAmount(requestBody),
                (respose, respose2) -> {
                    Log.e(TAG, "apply: ");

                    // two request response call
                    // then conbin on object

                    return respose;
                }).
                subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
        .subscribe(this::handleResults);



    }

    private void handleError(Throwable throwable) {
        Log.e(TAG, "handleError: ");
    }

    private void handleResults(Respose respose) {
        Log.e(TAG, "handleResults: ");
    }
}
