package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1,cb2;
    int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1=(CheckBox) findViewById(R.id.checkBox);
        cb2=(CheckBox) findViewById(R.id.checkBox2);

    }

    public void checked(View view) {
        boolean c=((CheckBox) view).isChecked();
        switch(view.getId())
        {
            case R.id.checkBox:
                String s=cb1.getText().toString();
                int a=Integer.parseInt(s);
                if(c)sum=sum+a;
                else sum=sum-a;
                break;
            case R.id.checkBox2:
                String e=cb2.getText().toString();
                int b=Integer.parseInt(e);
                if(c)sum=sum+b;
                else sum=sum-b;

                break;

        }

        Toast.makeText(this,sum+" ", Toast.LENGTH_SHORT).show();
    }
}
