package com.example.hadith;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DalailUlKhairatActivity extends AppCompatActivity {

    private CardView cardOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalail_ul_khairat);

        cardOne = findViewById(R.id.card_dalail_ul_kherat);
        cardOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CardoneActivity.class);
                startActivity(intent);
            }
        });

    }
}