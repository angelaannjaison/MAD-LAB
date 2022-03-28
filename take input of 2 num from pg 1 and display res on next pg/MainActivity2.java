package com.example.appapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView e;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e=(TextView) findViewById(R.id.ed);
        btn=(Button) findViewById(R.id.button2);
        Bundle ex=getIntent().getExtras();
        String s1=ex.getString("val1");
        int a=Integer.parseInt(s1);
        String s2=ex.getString("val2");
        int b=Integer.parseInt(s2);
        int s = a+b;
        e.setText(e.getText()+" "+s);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
