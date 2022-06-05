package com.example.hadith;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hadith.adapter.HadeesAdapter;
import com.example.hadith.adapter.SurahAdapter;

public class SurahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);
        RecyclerView surah_list = findViewById(R.id.surah_list);
        surah_list.setLayoutManager(new LinearLayoutManager(this));
        String[] soorat_list={"Monday", "Tuesday", "Wedneday","Thursday","Friday","saturday","Sunday","Monday", "Tuesday", "Wedneday","Thursday","Friday","saturday","Sunday"};
        surah_list.setAdapter(new SurahAdapter(soorat_list));
    }
}