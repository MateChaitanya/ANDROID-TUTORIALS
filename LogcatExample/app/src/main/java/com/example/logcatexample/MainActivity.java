package com.example.logcatexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Test","Test Log");

        String TAG ="First Log";

        Log.d(TAG,"MY FIRST LOG MESSAGE");


    }
}