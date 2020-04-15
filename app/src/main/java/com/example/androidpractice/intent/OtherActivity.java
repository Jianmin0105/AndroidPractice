package com.example.androidpractice.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.androidpractice.R;

public class OtherActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_intent);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        int age = intent.getIntExtra("com.example.androidpractice.intent.Age", 10);
        String name = intent.getStringExtra("com.example.androidpractice.intent.Name");
        textView.setText("My Name is " + name + "\n" + "I'm " + age);

    }
}
