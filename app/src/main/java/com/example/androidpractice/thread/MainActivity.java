package com.example.androidpractice.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.androidpractice.R;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_thread);
        button = findViewById(R.id.button4);
        textView = findViewById(R.id.textView2);
        progressBar = findViewById(R.id.progressBar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new MyThread();
                thread.start();
            }
        });
    }

    class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 100; i++) {
                //textView.setText(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressBar.setProgress(progressBar.getProgress() + 1);
            }
        }
    }
}
