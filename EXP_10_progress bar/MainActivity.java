package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
    //declaring variables
    ProgressBar pb;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fn being called
        progbar();
    }
    //defining prog fn
    public void progbar()
    {
        //typcasting pb+connecting the variable with already created view
        pb=(ProgressBar)findViewById(R.id.progressBar2);

        final Timer t= new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                pb.setProgress(counter);
                if(counter == 100){
                    t.cancel();
                }
            }
        };

        t.schedule(tt,0,100);
    }
}