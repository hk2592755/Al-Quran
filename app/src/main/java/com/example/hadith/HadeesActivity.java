package com.example.hadith;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.hadith.adapter.HadeesAdapter;

import java.util.ArrayList;

public class HadeesActivity extends AppCompatActivity implements HadeesAdapter.OnNoteListener {

    private static final String TAG = "HadeesActivity";

    private ArrayList<Object> ahadees_list = new ArrayList<Object>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadees);

        RecyclerView hadees_list = (RecyclerView) findViewById(R.id.hadees_list);
        hadees_list.setLayoutManager(new LinearLayoutManager(this));
        String[] ahadees_list={"دلائل الخیرات شریف","نیت آغازِ دلائل الخیرات","Monday پہلا حِزْب", "Tuesday دوسرا حِزْب", "Wedneday تیسرا حِزْب","Thursday چوتھا حِزْب","Friday پانچواں حِزْب","Saturday چھٹا حِزْب","Sunday ساتواں حِزْب"};
        hadees_list.setAdapter(new HadeesAdapter(ahadees_list,this));



    }

    @Override
    public void onNoteClick(int position) {
        Log.d(TAG, "onNoteClick: clicked");
    }
}