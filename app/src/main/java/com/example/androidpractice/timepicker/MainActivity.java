package com.example.androidpractice.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;

import com.example.androidpractice.R;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_timepicker);
        timePicker = findViewById(R.id.timePicker);
        TimePickerListener timeListener = new TimePickerListener();
        timePicker.setOnTimeChangedListener(timeListener);



    }
    class TimePickerListener implements TimePicker.OnTimeChangedListener {

        @Override
        public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            System.out.println("hour : " + hourOfDay + " min : " + minute);
        }
    }


}
