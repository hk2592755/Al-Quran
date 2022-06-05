package com.example.hadith;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class RVCardclickActivity extends AppCompatActivity {

    private static final String TAG = "SomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvcardclick);
        Log.d(TAG, "onCreate: called");
    }
}