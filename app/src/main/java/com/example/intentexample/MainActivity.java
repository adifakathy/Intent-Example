package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText edittext;
    public static final String extra="Its contant the value of edittext in 1st activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext =(EditText)findViewById(R.id.edittextId);

    }


    public void firsttbuttonfunction(View view) {
        String text=edittext.getText().toString();
        Intent intent= new Intent(this,SecondActivity.class);
        intent.putExtra(extra,text);
        startActivity(intent);
    }
}
