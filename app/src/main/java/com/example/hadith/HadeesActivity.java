package com.example.hadith;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hadith.adapter.HadeesAdapter;

public class HadeesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadees);

        RecyclerView hadees_list = (RecyclerView) findViewById(R.id.hadees_list);
        hadees_list.setLayoutManager(new LinearLayoutManager(this));
        String[] ahadees_list={"دلائل الخیرات شریف","نیت آغازِ دلائل الخیرات","Monday پہلا حِزْب", "Tuesday دوسرا حِزْب", "Wedneday تیسرا حِزْب","Thursday چوتھا حِزْب","Friday پانچواں حِزْب","Saturday چھٹا حِزْب","Sunday ساتواں حِزْب"};
        hadees_list.setAdapter(new HadeesAdapter(ahadees_list));



    }
}