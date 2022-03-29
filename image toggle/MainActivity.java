package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView)findViewById(R.id.imageView);
        tb=(ToggleButton)findViewById(R.id.toggleButton);

        iv.setImageDrawable(getResources().getDrawable(R.drawable.light_off));

    }

    public void click(View view){
        if(tb.isChecked()){
            iv.setImageDrawable(getResources().getDrawable(R.drawable.light_on));
        }
        else{
            iv.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
        }
    }


}
