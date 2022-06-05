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

import com.example.hadith.HadeesActivity;
import com.example.hadith.R;
import com.example.hadith.RVCardclickActivity;

public class HadeesAdapter extends RecyclerView.Adapter<HadeesAdapter.HadeesList>{
    Context context;
    private OnNoteListener mOnNoteListener;

    private String[] data;

    public HadeesAdapter(String[] data,OnNoteListener onNoteListener){
        this.data= data;
        this.mOnNoteListener = onNoteListener;
    }

    @NonNull
    @Override
    public HadeesList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.card,parent,false);
        return new HadeesList(view,mOnNoteListener);
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

    public class HadeesList extends RecyclerView.ViewHolder implements View.OnClickListener{
            TextView texthadees;
            RelativeLayout parent_layout;
            OnNoteListener onNoteListener;
            public HadeesList(@NonNull View itemView,OnNoteListener onNoteListener) {
                super(itemView);
                texthadees= (TextView) itemView.findViewById(R.id.main_text_hadees);
                itemView.setOnClickListener(this);
                this.onNoteListener = onNoteListener;
            }

        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }

        public  interface OnNoteListener{
        void onNoteClick(int position);
        }

}
