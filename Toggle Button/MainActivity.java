package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton=(ToggleButton) findViewById(R.id.toggleButton);
    }

    public void toggle(View view) {
        if(toggleButton.isChecked())Toast.makeText(this, "Toggle Button :Switched on", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Toggle Button :Switched off", Toast.LENGTH_SHORT).show();

    }
}
