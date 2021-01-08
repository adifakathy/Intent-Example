package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.view.Gravity.BOTTOM;

public class SecondActivity extends AppCompatActivity {
    private TextView textview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textview3 =(TextView)findViewById(R.id.textview2Id);
        Intent intent =getIntent();
        String newtext=intent.getStringExtra(MainActivity.extra);
        textview3.setText(newtext);
        Toast mytoast=Toast.makeText(this,"text is  coming from 1st Text activity", Toast.LENGTH_SHORT);
        mytoast.setGravity(BOTTOM,0,0);
        mytoast.show();


    }
}