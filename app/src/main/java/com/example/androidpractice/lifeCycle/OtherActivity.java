package com.example.androidpractice.lifeCycle;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidpractice.R;

public class OtherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("lifecycle", "OtherActivity---onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycle", "OtherActivity---onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("lifecycle", "OtherActivity---onReStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycle", "OtherActivity---onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycle", "OtherActivity---onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle", "OtherActivity---onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifecycle", "OtherActivity---onStop");
    }
}
