package com.example.bandorganizer.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bandorganizer.R;

public class RepertoriumActivityAdapter extends RecyclerView.Adapter<RepertoriumActivityAdapter.ViewHolder> {

    private String[] localDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final RecyclerView recyclerView;

        public ViewHolder(View view){
            super(view);
            //Define click listener for the ViewHolder's view

            recyclerView = (RecyclerView) view.findViewById(R.id.rclView_Songs);
        }
        public RecyclerView getRecyclerView(){
            return recyclerView;
        }
    }

    public RepertoriumActivityAdapter(String[] dataSet){
        localDataSet = dataSet;
    }

    @NonNull
    @Override
    public RepertoriumActivityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_showrepertorium, parent, false);

        return new RepertoriumActivityAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RepertoriumActivityAdapter.ViewHolder holder, int position) {
        //TODO: https://developer.android.com/develop/ui/views/layout/recyclerview
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
