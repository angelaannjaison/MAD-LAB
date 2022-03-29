package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox a,b,c;
    int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }


    public void ischecked(View view) {
        boolean c=((CheckBox) view).isChecked();
        CheckBox l=(CheckBox) view;
        String s=l.getText().toString();
        int h=Integer.parseInt(s);

        switch (view.getId()){
            case R.id.checkBox:
                if(c) sum=sum+h;
                else sum=sum-h;
                break;
            case R.id.checkBox2:
                if(c) sum=sum+h;
                else sum=sum-h;
                break;
            case R.id.checkBox3:
                if(c) sum=sum+h;
                else sum=sum-h;
                break;

        }
        Toast.makeText(this, sum+"", Toast.LENGTH_SHORT).show();
    }
}
