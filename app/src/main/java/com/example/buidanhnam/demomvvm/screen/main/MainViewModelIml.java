package com.example.buidanhnam.demomvvm.screen.main;

import android.util.Log;
import android.view.ViewGroup;

import com.example.buidanhnam.demomvvm.data.source.remote.PeopleRemoteDataIml;
import com.example.buidanhnam.demomvvm.model.People;
import com.example.buidanhnam.demomvvm.model.PeopleReponse;
import com.example.buidanhnam.demomvvm.screen.adapter.PeopleAdapter;

import org.json.JSONException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.io.IOException;
import java.util.ArrayList;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.ArrayCompositeSubscription;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class MainViewModelIml implements MainViewContract.MainModelView {
     private PeopleRemoteDataIml peopleRemoteDataIml;

      public static final String TAG = "MainViewModelIml";
      public MainViewContract.MainView mainView ;

    public MainViewModelIml(MainViewContract.MainView mainView) {
        this.mainView = mainView;
    }

    public void onClickLoadData(final ViewGroup viewGroup) throws IOException, JSONException {
        peopleRemoteDataIml.getListPeople().subscribe(new Observer<PeopleReponse>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG, "onSubscribe: ");
            }

            @Override
            public void onNext(PeopleReponse peopleReponse) {

                mainView.onLoaddata((ArrayList<People>) peopleReponse.getPeopleList());

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
//        Subscriber subscription = new Subscriber() {
//            @Override
//            public void onSubscribe(Subscription s) {
//
//            }
//
//            @Override
//            public void onNext(Object o) {
//
//            }
//
//            @Override
//            public void onError(Throwable t) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        } ;

    }
    @Override
    public void destroy() {

    }
}
