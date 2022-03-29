package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n=(EditText) findViewById(R.id.n);

    }


    public void calc(View view) {

        Intent i=new Intent(MainActivity.this,result.class);
        String s=n.getText().toString();
        i.putExtra("val",s);
        startActivity(i);

    }
}
