package com.example.myyyyyyyy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    int n,i;
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.ed);
    }

    public void calc(View view) {
        flag=0;
        n = Integer.parseInt(et.getText().toString());
        int m=n/2;

        if (n == 0 || n == 1) Toast.makeText(this, n + " not prime", Toast.LENGTH_SHORT).show();
        else{
           for(i=2;i<=m;i++){
               if(n%i==0){
                   flag=1;
                   Toast.makeText(this, n+" not prime", Toast.LENGTH_SHORT).show();
                   break;
               }

           }
            if(flag==0) Toast.makeText(this, n+" is prime", Toast.LENGTH_SHORT).show();

        }
    }
}
