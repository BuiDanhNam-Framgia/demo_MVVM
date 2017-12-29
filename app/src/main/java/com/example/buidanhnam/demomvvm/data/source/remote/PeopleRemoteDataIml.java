package com.example.buidanhnam.demomvvm.data.source.remote;



import com.example.buidanhnam.demomvvm.model.People;
import com.example.buidanhnam.demomvvm.model.PeopleReponse;
import com.example.buidanhnam.demomvvm.model.Picture;
import com.example.buidanhnam.demomvvm.utils.Binding;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class PeopleRemoteDataIml implements PeopleRemoteData {
    public static final String API = "https://api.randomuser.me/?results=6&nat=en" ;
    @Override
    public Observable<PeopleReponse> getListPeople() throws IOException, JSONException {
        // load data API
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(API).build();
        Response response = okHttpClient.newCall(request).execute();
        String resultResponse = response.body().string();
        // parse data
        PeopleReponse peopleReponse= Binding.parseToJson(resultResponse);
        Observable<PeopleReponse> peopleReponseObservable = Observable.just(peopleReponse);
        return peopleReponseObservable;
    }

    @Override
    public Observable<PeopleReponse> searchPeople(String name) {
        return null;
    }
}
