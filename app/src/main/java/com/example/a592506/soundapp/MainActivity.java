package com.example.a592506.soundapp;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void sound (View view) {
        MediaPlayer sound1 = MediaPlayer.create(getApplicationContext(), R.raw.sound1);
        sound1.start();
    }

    public void email(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"zermassier@gmail.com"});
        CharSequence value;
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Sound App");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Listen to my sound");

        startActivity(emailIntent);
    }

    public void activity2(View view) {
        Intent myIntent = new Intent(this, Activity2.class);
        startActivity(myIntent);
    }

}
