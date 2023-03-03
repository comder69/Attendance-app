package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricPrompt;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Screen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        Intent intent = new Intent(Screen1.this,MainActivity.class);

        //this is use to make the splash screen just to show a Activity for given time..

        new Handler().postDelayed(new Runnable() {//Handaler handels splash screen and the delay holds for the timr differance
            @Override
            public void run() {
                startActivity(intent);
                finish(); // This is for not going back to previous Screen
            }
        },2000);
    }
}