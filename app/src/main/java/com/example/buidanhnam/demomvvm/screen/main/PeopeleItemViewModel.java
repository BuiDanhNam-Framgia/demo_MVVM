package com.example.buidanhnam.demomvvm.screen.main;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.buidanhnam.demomvvm.model.People;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class PeopeleItemViewModel extends BaseObservable {
    private People people ;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public PeopeleItemViewModel(People people) {
        this.people = people;
    }
    public String getUrlImage(){
        return people.picture.thumbnail;
    }
    public String getName(){
        return people.fullName;
    }
    public String getGenger(){
        return people.gender ;
    }
    @BindingAdapter("android:src")
    public static void getImage(ImageView view , String linkUrl){
        Glide.with(view.getContext()).
                load(linkUrl).into(view);
    }
}
