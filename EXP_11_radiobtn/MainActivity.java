package com.example.radiobtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleradiobutton(View view) {
        //if radio btn is checked then value of checked variable becomes true
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.radioButton1:
                if(checked)
                {
                    showmessage("Male selected");
                }
                break;
            case R.id.radioButton2:
                if(checked)
                {
                    showmessage("Female selected");
                }
                break;
        }
    }

    private void showmessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}