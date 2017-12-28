package com.example.buidanhnam.demomvvm.screen.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.buidanhnam.demomvvm.R;
import com.example.buidanhnam.demomvvm.databinding.ActivityMainBinding;
import com.example.buidanhnam.demomvvm.model.People;
import com.example.buidanhnam.demomvvm.screen.adapter.PeopleAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainViewContract.MainView{
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         initView();
    }

    private void initView() {
         activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
         activityMainBinding.recyclerPeople.setLayoutManager(new LinearLayoutManager(this));
         activityMainBinding.recyclerPeople.setAdapter(new PeopleAdapter());

    }
    @Override
    public void loadData(List<People> peopleList) {
         PeopleAdapter peopleAdapter = (PeopleAdapter) activityMainBinding.recyclerPeople.getAdapter();
         peopleAdapter.setPeopleArrayList((ArrayList<People>) peopleList);
    }
}
