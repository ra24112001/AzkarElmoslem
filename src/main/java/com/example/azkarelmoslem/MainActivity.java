package com.example.azkarelmoslem;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView gg= findViewById(R.id.morning);
        Button ggbtn=findViewById(R.id.morningbt);
        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),morning.class);
                startActivity(intent);
            }
        });
        ggbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),morning.class);
                startActivity(intent);
            }
        });
        ImageView HH= findViewById(R.id.night);
        Button HHbtn=findViewById(R.id.nightbt);
        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),night.class);
                startActivity(intent);
            }
        });
        HHbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),night.class);
                startActivity(intent);
            }
        });
    }
}


