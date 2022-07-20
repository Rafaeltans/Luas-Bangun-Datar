package com.example.luasbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LuasSegitiga extends AppCompatActivity {

    private EditText etAlas, etTinggi;
    private Button btnHitung, btnReset;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        etAlas = findViewById(R.id.et_alas);
        etTinggi = findViewById(R.id.et_tinggi);
        btnHitung = findViewById(R.id.btn_hitung);
        tvHasil = findViewById(R.id.tv_hasil);
        btnReset = findViewById(R.id.btn_reset);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stralas = String.valueOf(etAlas.getText());
                String strtinggi = String.valueOf(etTinggi.getText());

                if(TextUtils.isEmpty(stralas)||TextUtils.isEmpty(strtinggi)){
                    Toast.makeText(LuasSegitiga.this,"Alas dan Tinggi Harus Di Isi",Toast.LENGTH_SHORT).show();
                }else {
                    Float alas = Float.parseFloat(stralas);
                    Float tinggi = Float.parseFloat(strtinggi);

                    Float luas = alas *tinggi/2;

                    tvHasil.setText(String.format("%.2f", luas));
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etAlas.setText("");
                etTinggi.setText("");
                tvHasil.setText("");
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}