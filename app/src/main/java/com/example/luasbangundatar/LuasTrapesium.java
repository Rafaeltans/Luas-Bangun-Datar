package com.example.luasbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasTrapesium extends AppCompatActivity {

    private EditText etS1, etS2, etTinggi;
    private Button btnHitung, btnReset;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        etS1 = findViewById(R.id.et_sisi1);
        etS2 = findViewById(R.id.et_sisi2);
        etTinggi = findViewById(R.id.et_tinggi);
        btnHitung = findViewById(R.id.btn_hitung);
        tvHasil = findViewById(R.id.tv_hasil);
        btnReset = findViewById(R.id.btn_reset);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strs1 = String.valueOf(etS1.getText());
                String strs2 = String.valueOf(etS2.getText());
                String strtinggi = String.valueOf(etTinggi.getText());

                if (TextUtils.isEmpty(strs1) || TextUtils.isEmpty(strs2) || TextUtils.isEmpty(strtinggi)) {
                    Toast.makeText(LuasTrapesium.this, "Sisi LM dan KN dan Tinggi Harus Di Isi", Toast.LENGTH_SHORT).show();
                } else {
                    Float s1 = Float.parseFloat(strs1);
                    Float s2 = Float.parseFloat(strs2);
                    Float tinggi = Float.parseFloat(strtinggi);

                    Float luas = (s1 + s2) * tinggi / 2;

                    tvHasil.setText(String.format("%.2f", luas));
                }

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etS1.setText("");
                etS2.setText("");
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