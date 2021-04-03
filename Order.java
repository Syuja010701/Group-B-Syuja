package com.example.projecuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Order extends AppCompatActivity {

    private ImageButton Ig;
    private ImageButton Wa;

    CheckBox menu1,menu2,menu3,menu4,rasa1,rasa2,rasa3,rasa4,rasa5,bri,gopay,ovo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        menu1=(CheckBox)findViewById(R.id.menu1);
        menu2=(CheckBox)findViewById(R.id.menu2);
        menu3=(CheckBox)findViewById(R.id.menu3);
        menu4=(CheckBox)findViewById(R.id.menu4);
        rasa1=(CheckBox)findViewById(R.id.rasa1);
        rasa2=(CheckBox)findViewById(R.id.rasa2);
        rasa3=(CheckBox)findViewById(R.id.rasa3);
        rasa4=(CheckBox)findViewById(R.id.rasa4);
        rasa5=(CheckBox)findViewById(R.id.rasa5);
        bri=(CheckBox)findViewById(R.id.bri);
        gopay=(CheckBox)findViewById(R.id.gopay);
        ovo=(CheckBox)findViewById(R.id.ovo);
        Button kirim = findViewById(R.id.kirim);
        TextView tampil = findViewById(R.id.tampil);
        Button bayar = findViewById(R.id.bayar);


        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!menu1.isChecked() && !menu2.isChecked() && !menu3.isChecked() && !menu4.isChecked() && rasa1.isChecked() && rasa2.isChecked() && rasa3.isChecked() && rasa4.isChecked() && rasa5.isChecked()){
                    Toast.makeText(getApplicationContext(), "tidak ada yang dipih",Toast.LENGTH_LONG).show();
                }
                else {
                    String a = "";
                    if (menu1.isChecked()) {
                        a += "Makaroni Kering - 8000 \n";
                    }

                    String b = "";
                    if (menu2.isChecked()) {
                        b += "Makaroni Sprial - 8000 \n";
                    }

                    String c = "";
                    if (menu3.isChecked()) {
                        c += "Makaroni Basah - 7000 \n";
                    }

                    String d = "";
                    if (menu4.isChecked()) {
                        d += "Makaroni Campur - 8000 \n";
                    }

                    String e = "";
                    if (rasa1.isChecked()) {
                        e += "Rasa Original \n";
                    }

                    String f = "";
                    if (rasa2.isChecked()) {
                        f += "Rasa Pedas Keju \n";
                    }

                    String g = "";
                    if (rasa3.isChecked()) {
                        g += "Rasa Manis Keju \n";
                    }

                    String h = "";
                    if (rasa4.isChecked()) {
                        h += "Rasa Balado \n";
                    }

                    String i = "";
                    if (rasa1.isChecked()) {
                        i += "Rasa Original \n";
                    }

                    String j = "";
                    if (bri.isChecked()){
                        j += "Transfer Bank Bri \n";
                    }

                    String k = "";
                    if (gopay.isChecked()){
                        k += "Go Pay \n";
                    }

                    String l = "";
                    if (ovo.isChecked()){
                        l += "OVO \n";
                    }


                    tampil.setText("Pesanan Anda :\n" + a + "" + b + "" + c + "" + d + "" + e + "" + f + "" + g + "" + h + "" + i + "" + j + "" + k + "" + l);

                }
            }


        });

        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Order.this, Bayar.class);
                intent.putExtra("Datapesan", bayar.getText());
                startActivity(intent);
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

