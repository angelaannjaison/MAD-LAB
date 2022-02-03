package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void select(View view)
    {
        boolean checked=((CheckBox) view).isChecked();
        switch(view.getId())
        {
            case R.id.checkBox1:
                //displaymsg fn shall be activated using displaymsg class
                if(checked)
                    displaymessege("INDIA selected");
                else
                    displaymessege("INDIA removed");
                break;
            case R.id.checkBox2:
                if(checked)
                    displaymessege("SRILANKA selected");
                else
                    displaymessege("SRILANKA removed");
                break;
        }
    }

    private void displaymessege(String s)
    {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}