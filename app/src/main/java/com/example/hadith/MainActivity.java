package com.example.hadith;
import android.annotation.TargetApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView format1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String dateTime;
        Calendar calendar;
        SimpleDateFormat simpleDateFormat;

        format1 = (TextView) findViewById(R.id.format1);

        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("HH:mm:ss aaa");
        dateTime = simpleDateFormat.format(calendar.getTime()).toString();
        format1.setText(dateTime);

        MaterialCardView hadees_card;

        hadees_card = findViewById(R.id.ahadees_card);
        hadees_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HadeesActivity.class);
                startActivity(intent);
            }
        });

        MaterialCardView surah_card;

        surah_card = findViewById(R.id.surah_card);
        surah_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SurahActivity.class);
                startActivity(intent);
            }
        });

        MaterialCardView dua_card = (MaterialCardView) findViewById(R.id.dua_card);
        dua_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DuaActivity.class);
                startActivity(intent);
            }
        });

    }
}