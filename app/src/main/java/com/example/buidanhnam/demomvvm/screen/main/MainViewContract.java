package com.example.buidanhnam.demomvvm.screen.main;

import com.example.buidanhnam.demomvvm.model.People;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public interface MainViewContract {

    interface MainModelView{
        public void destroy();
    }
    interface MainView {
        public void onLoaddata(ArrayList<People>  peoples);
    }
}
