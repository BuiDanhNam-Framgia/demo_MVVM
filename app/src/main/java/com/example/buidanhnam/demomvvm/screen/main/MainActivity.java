package com.example.buidanhnam.demomvvm.screen.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.buidanhnam.demomvvm.R;


import com.example.buidanhnam.demomvvm.databinding.ActivityMainBinding;
import com.example.buidanhnam.demomvvm.model.People;
import com.example.buidanhnam.demomvvm.screen.adapter.PeopleAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainViewContract.MainView {
  private ActivityMainBinding activityMainBinding ;
    MainViewContract.MainModelView mainModelView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainModelView = new MainViewModelIml(this);
       // binding data

       activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel((MainViewModelIml) mainModelView);

    }

    @Override
    public void onLoaddata(ArrayList<People> people) {
        PeopleAdapter peopleAdapter = new PeopleAdapter();
        peopleAdapter.setPeopleArrayList(people);
        activityMainBinding.recyclerPeople.setAdapter(peopleAdapter);
        peopleAdapter.notifyDataSetChanged();

    }
}
