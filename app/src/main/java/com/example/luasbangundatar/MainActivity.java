package com.example.luasbangundatar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cvSegitiga, cvPersegi, cvPersegiPanjang, cvLayangLayang, cvLingkaran, cvJajarGenjang, cvBelahKetupat, cvTrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvSegitiga=findViewById(R.id.cv_segitiga);
        cvPersegi=findViewById(R.id.cv_persegi);
        cvPersegiPanjang=findViewById(R.id.cv_persegiPanjang);
        cvLayangLayang=findViewById(R.id.cv_layang_layang);
        cvLingkaran=findViewById(R.id.cv_lingkaran);
        cvJajarGenjang=findViewById(R.id.cv_jajar_genjang);
        cvBelahKetupat=findViewById(R.id.cv_belah_ketupat);
        cvTrapesium=findViewById(R.id.cv_trapesium);

        cvSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LuasSegitiga.class);
                startActivity(intent);
            }
        });

        cvPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LuasPersegi.class);
                startActivity(intent);
            }
        });

        cvPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LuasPersegiPanjang.class);
                startActivity(intent);
            }
        });

        cvLayangLayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LuasLayangLayang.class);
                startActivity(intent);
            }
        });

        cvJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LuasJajarGenjang.class);
                startActivity(intent);
            }
        });

        cvBelahKetupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LuasJajarGenjang.class);
                startActivity(intent);
            }
        });

        cvTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LuasTrapesium.class);
                startActivity(intent);
            }
        });

    }
}