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

public class LuasPersegi extends AppCompatActivity {

    private EditText etSisi;
    private Button btnHitung, btnReset;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        etSisi = findViewById(R.id.et_sisi);
        tvHasil = findViewById(R.id.tv_hasil);
        btnHitung = findViewById(R.id.btn_hitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strSisi = String.valueOf(etSisi.getText());

                if (TextUtils.isEmpty(strSisi)) {
                    Toast.makeText(LuasPersegi.this, "Sisi Harus Di Isi", Toast.LENGTH_SHORT).show();
                } else {
                    Float sisi = Float.parseFloat(strSisi);

                    Float luas = sisi * sisi;

                    tvHasil.setText(String.format("%.2f", luas));
                }
            }
        });

        btnReset = findViewById(R.id.btn_reset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etSisi.setText("");
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