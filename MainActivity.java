package com.example.projecuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton Ig;
    private ImageButton Wa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImageButton pesan = findViewById(R.id.Pesan);
       pesan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,Order.class));
           }
       });

        Button Tombol = findViewById(R.id.tombol);
        Tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Order.class));
            }
        });

        Ig = findViewById(R.id.ig);
        Ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/ngemealmaka"));
                startActivity(intent);
            }
        });

        Wa = findViewById(R.id.wa);
        Wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://wa.me/message/KQ4RBUZIT5MXF1"));
                startActivity(intent);
            }
        });
    }

}

