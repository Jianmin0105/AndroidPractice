package com.example.androidpractice.handlerBetweenThread;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidpractice.R;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_handlerbetweenthread);
        button = findViewById(R.id.button6);
        textView = findViewById(R.id.textView4);
        handler = new MyHandler();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new NetWorkThread();
                thread.start();
            }
        });

    }
    class MyHandler extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            textView.setText((String) msg.obj);
        }
    }

    class NetWorkThread extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String s = "Data from network";
            Message msg = handler.obtainMessage();
            msg.obj = s;
            handler.sendMessage(msg);
        }
    }
}
