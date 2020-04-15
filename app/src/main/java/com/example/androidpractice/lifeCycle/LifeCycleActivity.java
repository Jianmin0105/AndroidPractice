package com.example.androidpractice.lifeCycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.androidpractice.R;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.e("lifecycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycle", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("lifecycle", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycle", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycle", "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifecycle", "onStop");
    }
}
