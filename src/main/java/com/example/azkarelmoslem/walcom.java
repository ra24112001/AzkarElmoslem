package com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class walcom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walcom);
        ImageView walcom=findViewById(R.id.image_walcom);
        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(1000);
                    Intent mainactivity=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(mainactivity);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };

        thread.start();
    }
}