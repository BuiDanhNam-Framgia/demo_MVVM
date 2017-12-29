package com.example.buidanhnam.demomvvm.utils;

import com.example.buidanhnam.demomvvm.model.People;
import com.example.buidanhnam.demomvvm.model.PeopleReponse;
import com.example.buidanhnam.demomvvm.model.Picture;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import io.reactivex.annotations.NonNull;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class Binding {
    public static PeopleReponse parseToJson(@NonNull String sData) throws JSONException {
        ArrayList<People> peopleReponses = new ArrayList<>();
        JSONObject jsonObjectRoot = new JSONObject(sData);
        JSONArray jsonArray = jsonObjectRoot.getJSONArray("results");
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonPeople = jsonArray.getJSONObject(i);
            String  gender = (String) jsonPeople.get("gender");
            String name = (String) jsonPeople.get("email");
            String imageThumbnail = (String) jsonPeople.getJSONObject("picture").get("thumbnail");
            Picture picture = new Picture(imageThumbnail);
            People people = new People(gender , name , picture);
            peopleReponses.add(people);
        }

        return new PeopleReponse(peopleReponses);
    }
}
