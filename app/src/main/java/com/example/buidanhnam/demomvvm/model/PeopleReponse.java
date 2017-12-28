package com.example.buidanhnam.demomvvm.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class PeopleReponse {
    @SerializedName("results")
    List<People> peopleList ;

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }
}
