package com.efgh.kettlebelltrainer;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class ExcerciseActivity extends AppCompatActivity
{


    GifImageView excerciseGifView;
    GifDrawable drawableObj;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        excerciseGifView = (GifImageView)findViewById(R.id.excerciseGifView);


        drawableObj = (GifDrawable)excerciseGifView.getDrawable();
        drawableObj.stop();


    }
    public void playGif(View v)
    {
        if(drawableObj.isPlaying())
        {
            Toast.makeText(getApplicationContext(),"stopping gif",Toast.LENGTH_SHORT).show();
            drawableObj.stop();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Playing gif",Toast.LENGTH_SHORT).show();
            drawableObj.start();
        }

    }

}
