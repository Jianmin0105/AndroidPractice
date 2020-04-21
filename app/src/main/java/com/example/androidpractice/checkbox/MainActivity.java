package com.example.androidpractice.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.example.androidpractice.R;

public class MainActivity extends AppCompatActivity {
    private CheckBox eatBox;
    private CheckBox sleepBox;
    private CheckBox gameBox;
    private  CheckBox selectAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_checkbox);
        eatBox = findViewById(R.id.eatId);
        sleepBox = findViewById(R.id.sleepId);
        gameBox = findViewById(R.id.gameId);
        selectAll = findViewById(R.id.setlectAllId);

        CheckBoxListener checkBoxListener = new CheckBoxListener();
        selectAll.setOnCheckedChangeListener(checkBoxListener);
    }

//    static class OnBoxClickListener implements View.OnClickListener {
//
//        @Override
//        public void onClick(View v) {
//            CheckBox checkBox = (CheckBox) v;
//            int clickedItem = checkBox.getId();
//            if (clickedItem == R.id.eatId) {
//
//            } else if (clickedItem == R.id.sleepId) {
//
//            } else if (clickedItem == R.id.gameId) {
//
//            }
//            if (checkBox.isChecked()) {
//
//            }
//        }
//    }
    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                eatBox.setChecked(true);
                sleepBox.setChecked(true);
                gameBox.setChecked(true);
            } else {
                eatBox.setChecked(false);
                sleepBox.setChecked(false);
                gameBox.setChecked(false);
            }
        }
    }
}
