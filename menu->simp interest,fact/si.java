package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class si extends AppCompatActivity {

    EditText p,n,r;
    Button calc;
    TextView c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si);

        p=(EditText) findViewById(R.id.p);
        n=(EditText) findViewById(R.id.n);
        r=(EditText) findViewById(R.id.r);
        c=(TextView) findViewById(R.id.c);
    }

    public void calc(View view) {
        String ps=p.getText().toString();
        int a=Integer.parseInt(ps);

        String ns=n.getText().toString();
        int b=Integer.parseInt(ns);

        String rs=r.getText().toString();
        int d=Integer.parseInt(rs);

        int res=(a*b*d)/100;
        c.setText(res+" ");
    }

    public void back(View view) {
        Intent i = new Intent(si.this,MainActivity.class);startActivity(i);
    }
}
