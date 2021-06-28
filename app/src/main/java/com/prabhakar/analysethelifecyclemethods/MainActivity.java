package com.prabhakar.analysethelifecyclemethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private final String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 40000);
        Thread timer = new Thread();
        Log.d(tag, "onCreate is calling");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart is calling");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, " onPause is calling");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume is calling");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart is calling");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy is calling");
    }
}