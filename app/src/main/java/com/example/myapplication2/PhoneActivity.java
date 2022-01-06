package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends AppCompatActivity {
    EditText phonetext;
Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        phonetext=(EditText) findViewById(R.id.phone);

        send=findViewById(R.id.Send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send=new Intent(PhoneActivity.this,MainActivity.class);
               Bundle b=new Bundle();
               String phone=phonetext.getText().toString();
               b.putString("ph",phone);
               send.putExtras(b);
               startActivity(send);

            }
        });


    }
}