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

public class LuasLingkaran extends AppCompatActivity {

    private ImageView ivBack;
    private EditText etJari;
    private Button btnHitung, btnReset;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        ivBack = findViewById(R.id.iv_back);
        etJari = findViewById(R.id.et_jari);
        btnHitung = findViewById(R.id.btn_hitung);
        btnReset = findViewById(R.id.btn_reset);
        tvHasil = findViewById(R.id.tv_hasil);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LuasLingkaran.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strjari = String.valueOf(etJari.getText());
                if (TextUtils.isEmpty(strjari)) {
                    Toast.makeText(LuasLingkaran.this, "Jari-jari Harus Di Isi", Toast.LENGTH_SHORT).show();
                } else {
                    Double jari = Double.parseDouble(strjari);
                    if (jari % 7 == 0) {
                        Double luas = 22  * jari * jari /7;
                        tvHasil.setText(String.format("%.2f", luas));
                    } else {
                        Double luas1 = 3.14 * jari * jari;
                        tvHasil.setText(String.format("%.2f", luas1));
                    }
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etJari.setText("");
                tvHasil.setText("");
            }
        });

    }
}