package com.thinksbrain.testpost.ui.adapter;

/**
 * Created by AMILKAR on 15/10/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thinksbrain.testpost.Objects.Trabajos;
import com.thinksbrain.testpost.R;

import java.util.ArrayList;

public class TrabajoAdapter extends RecyclerView.Adapter<TrabajoAdapter.ViewHolder> {

    private ArrayList<Trabajos> mDataSet;


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public ViewHolder(TextView tv) {
            super(tv);
            textView = tv;
        }
    }

    public TrabajoAdapter() {
        mDataSet = new ArrayList<>();
    }

    public void setDataSet(ArrayList<Trabajos> dataSet)
    {
        mDataSet = dataSet;
        notifyDataSetChanged();
    }


    @Override
    public TrabajoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {

        TextView tv = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.trabajo_view, parent, false);



        ViewHolder vh = new ViewHolder(tv);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {

        holder.textView.setText(mDataSet.get(i).getTitulo());
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}