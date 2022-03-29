package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity {

    TextView r;
    Button b;
    int a,i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        r=(TextView) findViewById(R.id.textView);
        b=(Button) findViewById(R.id.btn);

        Bundle extras = getIntent().getExtras();
        String s=extras.getString("val");
        int a=Integer.parseInt(s);
        //Toast.makeText(this,a+" ", Toast.LENGTH_SHORT).show();

        for(int i=1;i<10;i++) {
            // r.setText((a*i)+" ");
            //Toast.makeText(this,(a*i)+" ",Toast.LENGTH_SHORT).show();

            r.setText(r.getText().toString() + a + " * " + i + " = " + a * i + "\n");
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(result.this,MainActivity.class);startActivity(l);

            }
        });
    }
}
