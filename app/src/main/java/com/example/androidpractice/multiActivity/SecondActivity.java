package com.example.androidpractice.multiActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidpractice.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
