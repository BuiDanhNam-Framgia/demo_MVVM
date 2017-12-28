package com.example.buidanhnam.demomvvm.screen.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.buidanhnam.demomvvm.R;
import com.example.buidanhnam.demomvvm.databinding.ItemPeopleBinding;
import com.example.buidanhnam.demomvvm.model.People;
import com.example.buidanhnam.demomvvm.screen.main.PeopeleItemViewModel;

import java.util.ArrayList;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {

     private ArrayList<People> peopleArrayList ;

    public PeopleAdapter(ArrayList<People> peopleArrayList) {
        this.peopleArrayList = peopleArrayList;
    }

    public PeopleAdapter() {
    }

    public ArrayList<People> getPeopleArrayList() {
        return peopleArrayList;
    }

    public void setPeopleArrayList(ArrayList<People> peopleArrayList) {
        this.peopleArrayList = peopleArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemPeopleBinding itemPeopleBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_people,parent , false);
        return new ViewHolder(itemPeopleBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
         if(holder.itemPeopleBinding.getPeopleItem() == null){
             holder.itemPeopleBinding.setPeopleItem(new PeopeleItemViewModel(peopleArrayList.get(position)));
         }
         else {
             holder.itemPeopleBinding.getPeopleItem().setPeople(peopleArrayList.get(position));
         }
         holder.itemPeopleBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return peopleArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
          ItemPeopleBinding itemPeopleBinding ;
        public ViewHolder(ItemPeopleBinding itemPeopleBinding) {
            super(itemPeopleBinding.getRoot());
            this.itemPeopleBinding = itemPeopleBinding ;
        }
    }
}
