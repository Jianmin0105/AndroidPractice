package com.example.androidpractice.lifeCycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.androidpractice.R;
import com.example.androidpractice.multiActivity.MainActivity;

public class LifeCycleActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("lifecycle", "MainActivity---onCreate");
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(LifeCycleActivity.this, OtherActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycle", "MainActivity---onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("lifecycle", "MainActivity---onReStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycle", "MainActivity---onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycle", "MainActivity---onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle", "MainActivity---onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifecycle", "MainActivity---onStop");
    }
}
