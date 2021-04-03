package com.example.projecuts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bayar extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar);

        Button pesanlagi = findViewById(R.id.pesanlagi);
        Button selasai = findViewById(R.id.selesai);
        TextView tampil = findViewById(R.id.tampil);

        tampil.setText(getIntent().getStringExtra("Datapesan"));

        pesanlagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bayar.this, Order.class));
            }
        });

        selasai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bayar.this,Activity.class));
            }
        });
    }
}