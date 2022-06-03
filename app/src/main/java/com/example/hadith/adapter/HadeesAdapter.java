package com.example.hadith.adapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hadith.R;
import com.example.hadith.RVCardclickActivity;

public class HadeesAdapter extends RecyclerView.Adapter<HadeesAdapter.HadeesList>{
    private Context context;

    public void RecyclerAdapter(Context context) {
        this.context = context;
    }

    private String[] data;

    public HadeesAdapter(String[] data){
        this.data= data;
    }



    @NonNull
    @Override
    public HadeesList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.card,parent,false);
        return new HadeesList(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HadeesList holder, int position) {
        String texthadees = data[position];
        holder.texthadees.setText(texthadees);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class HadeesList extends RecyclerView.ViewHolder{
            TextView texthadees;
            RelativeLayout parent_layout;
            public HadeesList(@NonNull View itemView) {
                super(itemView);
                texthadees= (TextView) itemView.findViewById(R.id.main_text_hadees);

            }
        }

}
