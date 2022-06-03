package com.example.hadith.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hadith.R;

public class DuaAdapter extends RecyclerView.Adapter<DuaAdapter.DuaList>{

    private String[] data;
    public DuaAdapter(String[] data){
        this.data= data;
    }

    @NonNull
    @Override
    public DuaList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.card_dua,parent,false);
        return new DuaAdapter.DuaList(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DuaList holder, int position) {
        String textdua = data[position];
        holder.textdua.setText(textdua);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class DuaList extends RecyclerView.ViewHolder{
        TextView textdua;
        public DuaList(@NonNull View itemView) {
            super(itemView);

            textdua= (TextView) itemView.findViewById(R.id.main_text_dua);


        }
    }

}
