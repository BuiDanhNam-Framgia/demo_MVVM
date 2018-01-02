package com.example.buidanhnam.demomvvm.screen.main;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.buidanhnam.demomvvm.R;
import com.example.buidanhnam.demomvvm.databinding.ItemPeopleBinding;
import com.example.buidanhnam.demomvvm.model.People;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bui Danh Nam on 28/12/2017.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {

    private List<People> mPeoples;

    public PeopleAdapter(List<People> peoples) {
        mPeoples = peoples;
    }

    public List<People> getPeoples() {
        return mPeoples;
    }

    public void setPeoples(List<People> peoples) {
        mPeoples = peoples;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemPeopleBinding itemPeopleBinding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_people, parent,
                        false);
        return new ViewHolder(itemPeopleBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindData(mPeoples.get(position));
    }

    @Override
    public int getItemCount() {
        return mPeoples.size();
    }

    public void updateData(List<People> peoples) {
        if (peoples == null) {
            return;
        }
        mPeoples.addAll(peoples);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemPeopleBinding mBinding;

        public ViewHolder(ItemPeopleBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bindData(People people) {
            mBinding.setPeople(people);
            mBinding.executePendingBindings();
        }
    }
}
