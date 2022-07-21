package com.example.luasbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasBelahKetupat extends AppCompatActivity {

    private EditText etDiagonal1, etDiagonal2;
    private Button btnHitung, btnReset;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_belah_ketupat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        etDiagonal1 = findViewById(R.id.et_diagonal1);
        etDiagonal2 = findViewById(R.id.et_diagonal2);
        btnHitung = findViewById(R.id.btn_hitung);
        btnReset = findViewById(R.id.btn_reset);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strd1 = String.valueOf(etDiagonal1.getText());
                String strd2 = String.valueOf(etDiagonal2.getText());
                if (TextUtils.isEmpty(strd1) || TextUtils.isEmpty(strd2)) {
                    Toast.makeText(LuasBelahKetupat.this, "Diagonal 1 dan Diagonal 2 Harus Di Isi", Toast.LENGTH_SHORT).show();
                } else {
                    Float d1 = Float.parseFloat(strd1);
                    Float d2 = Float.parseFloat(strd2);

                    Float luas = d1 * d2 / 2;

                    tvHasil.setText(String.format("%.2f", luas));
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDiagonal1.setText("");
                etDiagonal2.setText("");
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