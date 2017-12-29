package com.example.buidanhnam.demomvvm.data.source.remote;

import com.example.buidanhnam.demomvvm.model.PeopleReponse;

import org.json.JSONException;

import java.io.IOException;

import io.reactivex.Observable;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public interface PeopleRemoteData {
       public Observable<PeopleReponse> getListPeople() throws IOException, JSONException;
       public Observable<PeopleReponse> searchPeople(String name);

}
