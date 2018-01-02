package com.example.buidanhnam.demomvvm.data.source;

import com.example.buidanhnam.demomvvm.data.source.remote.PeopleRemoteDataSource;
import com.example.buidanhnam.demomvvm.model.PeopleReponse;

import org.json.JSONException;

import java.io.IOException;

import io.reactivex.Observable;

/**
 * Created by Bui Danh Nam on 29/12/2017.
 */

public class PeopleRepository implements PeopleDataSource {
    private PeopleRemoteDataSource mRemoteDataSource;

    public PeopleRepository(PeopleRemoteDataSource remoteDataSource) {
        mRemoteDataSource = remoteDataSource;
    }

    @Override
    public Observable<PeopleReponse> getListPeople() throws IOException, JSONException {
        return mRemoteDataSource.getListPeople();
    }

    @Override
    public Observable<PeopleReponse> searchPeople(String name) {
        return mRemoteDataSource.searchPeople(name);
    }
}
