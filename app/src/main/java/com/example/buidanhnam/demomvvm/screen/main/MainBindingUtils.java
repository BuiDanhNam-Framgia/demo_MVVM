package com.example.buidanhnam.demomvvm.screen.main;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Bui Danh Nam on 29/12/2017.
 */

public class MainBindingUtils {

    @BindingAdapter("src")
    public static void setImageUrl(ImageView view, String linkUrl) {
        Glide.with(view.getContext()).
                load(linkUrl).into(view);
    }

    @BindingAdapter("adapter")
    public static void setRecyclerAdapter(RecyclerView view, RecyclerView.Adapter adapter) {
        view.setAdapter(adapter);
    }
}
