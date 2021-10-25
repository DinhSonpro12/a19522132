package com.google.a19522132;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button button1 = findViewById(R.id.nut1);
        Button button2 = findViewById(R.id.nut2);
        Button button3 = findViewById(R.id.nut3);
        Button button4 = findViewById(R.id.nut4);
        Button button5 = findViewById(R.id.nut5);
        Button button6 = findViewById(R.id.nut6);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(menu.this, MainActivity.class);

                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(menu.this, MainActivity_th3.class);
                startActivity(i);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(menu.this, MainActivity_th4.class);
                startActivity(i);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( getApplicationContext(),MainActivity_th5.class));

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(menu.this, MainActivity_th6.class);
                startActivity(i);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(menu.this, MainActivity_th7.class);
                startActivity(i);

            }
        });


    }
}
