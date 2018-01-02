package com.example.buidanhnam.demomvvm.screen.main;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.example.buidanhnam.demomvvm.BR;
import com.example.buidanhnam.demomvvm.data.source.remote.PeopleRemoteDataSource;
import com.example.buidanhnam.demomvvm.model.People;
import com.example.buidanhnam.demomvvm.model.PeopleReponse;

import org.json.JSONException;

import java.io.IOException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class MainViewModel extends BaseObservable implements OnItemPeopleClickListener {
    private PeopleRemoteDataSource peopleRemoteDataIml;
    private PeopleAdapter adapter;

    public static final String TAG = "MainViewModel";

    public MainViewModel() {
        peopleRemoteDataIml = new PeopleRemoteDataSource();
    }

    public void onLoadDataClicked()  {
        try {
            peopleRemoteDataIml
                    .getListPeople()
                    .subscribe(new Observer<PeopleReponse>() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            Log.i(TAG, "onSubscribe: ");
                        }

                        @Override
                        public void onNext(PeopleReponse peopleReponse) {
                            adapter.updateData(peopleReponse.getPeopleList());
                        }

                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Bindable
    public PeopleAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(PeopleAdapter adapter) {
        this.adapter = adapter;
        notifyPropertyChanged(BR.adapter);
    }

    @Override
    public void onClick(People people) {
        // handling
    }
}
