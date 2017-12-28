package com.example.buidanhnam.demomvvm.data.source.remote;

import com.example.buidanhnam.demomvvm.model.PeopleReponse;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public interface PeopleService {
       io.reactivex.Observable<PeopleReponse> getListPeople();
}
