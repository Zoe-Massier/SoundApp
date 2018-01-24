package com.example.a592506.soundapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer sound1 = MediaPlayer.create(getApplicationContext(), R.raw.sound1);
        sound1.start();
    }
}
