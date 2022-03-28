package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s = (Spinner) findViewById(R.id.spinner);
        s.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.months, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        if (i<7)
        {

            if(i%2==0)
                Toast.makeText(this, "No. of days for "+adapterView.getItemAtPosition(i)+" is 31", Toast.LENGTH_SHORT).show();
            else
                if(i==1)
                    Toast.makeText(this, "No. of days for "+adapterView.getItemAtPosition(i)+" is 28 or 29", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "No. of days for "+adapterView.getItemAtPosition(i)+" is 30", Toast.LENGTH_SHORT).show();
        }
        else
        {

            if(i%2==0)
                Toast.makeText(this, "No. of days for "+adapterView.getItemAtPosition(i)+" is 30", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "No. of days for "+adapterView.getItemAtPosition(i)+" is 31", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
