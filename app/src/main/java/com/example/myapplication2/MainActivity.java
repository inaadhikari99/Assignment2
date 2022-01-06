package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView Display;
Button getPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
getPhone=findViewById(R.id.Getphone);
getPhone.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(MainActivity.this,PhoneActivity.class);
        startActivity(i);
    }
});
Display=findViewById(R.id.DisplayPhone);
String Phone=getIntent().getExtras().getString("ph");
Display.setText(Phone);




    }
}