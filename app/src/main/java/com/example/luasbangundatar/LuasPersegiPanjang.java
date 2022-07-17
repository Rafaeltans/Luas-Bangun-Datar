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

public class LuasPersegiPanjang extends AppCompatActivity {

    private ImageView ivBack;
    private EditText etPanjang, etLebar;
    private Button btnHitung, btnReset;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        ivBack = findViewById(R.id.iv_back);
        etPanjang = findViewById(R.id.et_panjang);
        etLebar = findViewById(R.id.et_lebar);
        btnHitung = findViewById(R.id.btn_hitung);
        btnReset = findViewById(R.id.btn_reset);
        tvHasil  =findViewById(R.id.tv_hasil);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LuasPersegiPanjang.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strpanjang = String.valueOf(etPanjang.getText());
                String strlebar = String.valueOf(etLebar.getText());

                if(TextUtils.isEmpty(strpanjang)||TextUtils.isEmpty(strlebar)){
                    Toast.makeText(LuasPersegiPanjang.this,"Panjang dan Lebar Harus Di Isi",Toast.LENGTH_SHORT).show();
                }else {
                    Float panjang = Float.parseFloat(strpanjang);
                    Float lebar = Float.parseFloat(strlebar);

                    Float luas = panjang*lebar;

                    tvHasil.setText(String.format("%.2f",luas));
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etPanjang.setText("");
                etLebar.setText("");
                tvHasil.setText("");
            }
        });

    }
}