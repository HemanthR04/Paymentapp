package com.example.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Acitvity2 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitvity2);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseTax();

            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrafficFine();

            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLandline();

            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openElectricity();

            }
        });

    }

    public void openHouseTax() {
        Intent intent = new Intent(this,HouseTax.class);
        startActivity(intent);
    }
    public void openTrafficFine() {
        Intent intent = new Intent(this,TrafficFine.class);
        startActivity(intent);
    }
    public void openLandline() {
        Intent intent = new Intent(this,Landline.class);
        startActivity(intent);
    }
    public void openElectricity() {
        Intent intent = new Intent(this,Electricity.class);
        startActivity(intent);
    }
    }
