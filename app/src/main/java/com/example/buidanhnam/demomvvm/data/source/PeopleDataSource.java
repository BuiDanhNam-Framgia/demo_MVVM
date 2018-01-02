package com.example.buidanhnam.demomvvm.data.source;

import com.example.buidanhnam.demomvvm.model.PeopleReponse;

import org.json.JSONException;

import java.io.IOException;

import io.reactivex.Observable;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public interface PeopleDataSource {
    Observable<PeopleReponse> getListPeople() throws IOException, JSONException;

    Observable<PeopleReponse> searchPeople(String name);

}
