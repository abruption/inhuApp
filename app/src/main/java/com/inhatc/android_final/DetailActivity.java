package com.inhatc.android_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private Button btnCafe, btnKorea, btnJapan, btnChina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnCafe = findViewById(R.id.btnCafe);
        btnCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, CafeActivity.class);
                startActivity(intent);
            }
        });


        btnKorea = findViewById(R.id.btnKorea);
        btnKorea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, KoreaActivity.class);
                startActivity(intent);
            }
        });


        btnJapan = findViewById(R.id.btnJapan);
        btnJapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, JapanActivity.class);
                startActivity(intent);
            }
        });


        btnChina = findViewById(R.id.btnChina);
        btnChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, ChinaActivity.class);
                startActivity(intent);
            }
        });
    }
}
