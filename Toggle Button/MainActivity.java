package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb=(ToggleButton) findViewById(R.id.toggleButton);
        tb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    if(compoundButton.getId()==R.id.toggleButton) {
        if(b) Toast.makeText(this, "Toggle Button :Switched on", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Toggle Button :Switched off", Toast.LENGTH_SHORT).show();
    }
    }
}
