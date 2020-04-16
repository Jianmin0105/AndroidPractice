package com.example.androidpractice.handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
        setContentView(R.layout.activity_main_handler);
        button = findViewById(R.id.button5);
        textView = findViewById(R.id.textView3);
        button.setOnClickListener(new ButtonListener());
        handler = new MyHandler();
    }

    class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Message msg = handler.obtainMessage();
            msg.what = 2;
            handler.sendMessage(msg);
        }
    }
    class MyHandler extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            int what = msg.what;
            textView.setText("" + what);
        }
    }
}
