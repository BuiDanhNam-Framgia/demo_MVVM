package com.example.buidanhnam.demomvvm.data.source.remote;



import com.example.buidanhnam.demomvvm.model.People;
import com.example.buidanhnam.demomvvm.model.PeopleReponse;
import com.example.buidanhnam.demomvvm.model.Picture;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class PeopleSeviceIml implements PeopleService {
    @Override
    public Observable<PeopleReponse> getListPeople() {
        // mock data
         PeopleReponse peopleReponse = new PeopleReponse();
        List<People> people = new ArrayList<>();
        Picture picture = new Picture("http://driver.gianhangvn.com/file/son-kem-chanel-595284f669.jpg");
        people.add(new People("nam" , "BUi danh Nma",picture));
        people.add(new People("nu" , "BUi ",picture));
        people.add(new People("nu" , "Minh ",picture));
        peopleReponse.setPeopleList(people);
        Observable<PeopleReponse> peopleReponseObservable = Observable.just(peopleReponse);
        return peopleReponseObservable;
    }
}
