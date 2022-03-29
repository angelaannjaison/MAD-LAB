package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class fact extends AppCompatActivity {

    EditText n;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);
        n=(EditText) findViewById(R.id.n);
        tv=(TextView) findViewById(R.id.tv);
    }

    public void calcf(View view) {
        String s=n.getText().toString();
        int a=Integer.parseInt(s);
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        tv.setText(f+" ");
    }

    public void back(View view) {
        Intent i = new Intent(fact.this,MainActivity.class);startActivity(i);
    }
}
