package com.example.bsmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.Chronometer;



public class Preview extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        new Thread( new Runnable(){ @Override public void run(){ Looper.prepare();Switch();  } }).start();

    }

    public void Switch() {
        Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
        long startTime = SystemClock.elapsedRealtime();
        chronometer.setBase(startTime);
        chronometer.start();
        String arr[] = chronometer.getText().toString().split(":");
        int sec = Integer.parseInt(arr[1]);
        while (sec !=3) {

            arr = chronometer.getText().toString().split(":");
            sec = Integer.parseInt(arr[1]);
            if (sec == 2){
                Intent intent = new Intent("android.intent.action.MainActivity2");
                startActivity(intent);
            }

        }
    }
}


