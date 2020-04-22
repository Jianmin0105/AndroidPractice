package com.example.androidpractice.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.androidpractice.R;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar1;
    private ProgressBar progressBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_progressbar);
        progressBar1 = findViewById(R.id.progressBar1);
        progressBar1.setMax(200);
        progressBar1.setProgress(0);
        Thread thread = new Thread(new ProgressBarThread());
        thread.start();


    }
    class ProgressBarThread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressBar1.incrementProgressBy(10);
            }
        }
    }
}
