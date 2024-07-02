package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class morning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
       Button rr=findViewById(R.id.moning1);
       rr.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), morning4.class);
               startActivity(intent);
               finish();
           }
       });
        Button trr=findViewById(R.id.morning2);
        trr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), morning2.class);
                startActivity(intent);
                finish();
            }
        });
        Button ttrr=findViewById(R.id.morning3);
       ttrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), morning3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}