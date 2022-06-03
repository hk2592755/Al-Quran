package com.example.hadith.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hadith.R;

public class SurahAdapter extends RecyclerView.Adapter<SurahAdapter.SurahList> {

    private String[] data;
    public SurahAdapter(String[] data){
        this.data= data;
    }

    @NonNull
    @Override
    public SurahList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.card_surah,parent,false);
        return new SurahAdapter.SurahList(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SurahList holder, int position) {
        String textsurah = data[position];
        holder.textsurah.setText(textsurah);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class SurahList extends RecyclerView.ViewHolder{
        TextView textsurah;
        public SurahList(@NonNull View itemView) {
            super(itemView);

            textsurah= (TextView) itemView.findViewById(R.id.main_text_surah);


        }
    }

}
