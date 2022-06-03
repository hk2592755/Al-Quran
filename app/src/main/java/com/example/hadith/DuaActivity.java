package com.example.hadith;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hadith.adapter.DuaAdapter;
import com.example.hadith.adapter.HadeesAdapter;

public class DuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        RecyclerView dua_list;
        dua_list = findViewById(R.id.dua_list);
        dua_list.setLayoutManager(new LinearLayoutManager(this));
        String[] masnoon_dua_list={"Monday", "Tuesday", "Wedneday","Thursday","Friday","saturday","Sunday","Monday", "Tuesday", "Wedneday","Thursday","Friday","saturday","Sunday"};
        dua_list.setAdapter(new DuaAdapter(masnoon_dua_list));

    }
}