package com.example.languagephrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void playPhrase(View v)
    {
        Button btn = (Button) v;
        MediaPlayer mp = MediaPlayer.create(this,getResources().getIdentifier(btn.getTag().toString(),"raw",getPackageName()));
        mp.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
