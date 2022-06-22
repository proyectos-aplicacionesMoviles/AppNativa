package com.example.appnativa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();

                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        };
        Timer opening = new Timer( );
        opening.schedule(task,4000);
    }
    }
