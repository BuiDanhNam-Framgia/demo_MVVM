package com.example.buidanhnam.demomvvm.screen.main;

import com.example.buidanhnam.demomvvm.model.People;

import java.util.List;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public interface MainViewContract {
    interface MainView {
        public void loadData(List<People> peopleList) ;
    }
    interface MainModelView{
        public void destroy();
    }
}
