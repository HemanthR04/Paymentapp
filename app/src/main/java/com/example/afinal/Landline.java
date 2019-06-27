package com.example.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Landline extends AppCompatActivity {
    private Button Landlineconfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landline);

        Landlineconfirm = (Button) findViewById(R.id.Landlineconfirm);
        Landlineconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLandlinebill();

            }
        });
    }

    public void openLandlinebill() {
        Intent intent = new Intent(this, LandlineBill.class);
        startActivity(intent);
    }
}
