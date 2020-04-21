package com.example.androidpractice.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.androidpractice.R;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton femaleButton;
    private RadioButton maleButton;
    private RadioButton otherButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_radiobutton);
        textView = findViewById(R.id.display);
        radioGroup = findViewById(R.id.radiogroup);
        femaleButton = findViewById(R.id.female);
        maleButton = findViewById(R.id.male);
        otherButton = findViewById(R.id.other);
        RadioGroupListener listener = new RadioGroupListener();
        radioGroup.setOnCheckedChangeListener(listener);
    }

    class RadioGroupListener implements RadioGroup.OnCheckedChangeListener {

        @SuppressLint({"ResourceType", "SetTextI18n"})
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            RadioButton selectedButton = findViewById(checkedId);
            String text = (String) selectedButton.getText();
            textView.setText(text + " is selected");
        }
    }
}
