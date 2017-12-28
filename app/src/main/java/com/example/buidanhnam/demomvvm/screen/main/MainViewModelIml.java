package com.example.buidanhnam.demomvvm.screen.main;

import android.view.View;

import com.example.buidanhnam.demomvvm.data.source.remote.PeopleSeviceIml;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class MainViewModelIml implements MainViewContract.MainModelView {
     private PeopleSeviceIml peopleSeviceIml ;
    public void onLoadData( ){
        peopleSeviceIml.getListPeople();
    }
    @Override
    public void destroy() {

    }
}
