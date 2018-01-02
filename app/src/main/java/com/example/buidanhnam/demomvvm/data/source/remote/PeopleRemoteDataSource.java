package com.example.buidanhnam.demomvvm.data.source.remote;


import com.example.buidanhnam.demomvvm.data.source.PeopleDataSource;
import com.example.buidanhnam.demomvvm.model.PeopleReponse;
import com.example.buidanhnam.demomvvm.utils.Binding;

import org.json.JSONException;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class PeopleRemoteDataSource implements PeopleDataSource {
    public static final String API = "https://api.randomuser.me/?results=6&nat=en";

    @Override
    public Observable<PeopleReponse> getListPeople() throws JSONException {
        // load data API
        return Observable.create(new ObservableOnSubscribe<PeopleReponse>() {
            @Override
            public void subscribe(ObservableEmitter<PeopleReponse> emitter) throws Exception {
                OkHttpClient okHttpClient = new OkHttpClient();
                Request request = new Request.Builder().url(API).build();
                Response response = null;
                try {
                    response = okHttpClient.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                    emitter.onError(e);
                }
                String resultResponse = response.body().string();
                // parse data
                PeopleReponse peopleReponse = Binding.parseToJson(resultResponse);
                emitter.onNext(peopleReponse);
                emitter.onComplete();
            }
        });

    }

    @Override
    public Observable<PeopleReponse> searchPeople(String name) {
        return null;
    }
}
