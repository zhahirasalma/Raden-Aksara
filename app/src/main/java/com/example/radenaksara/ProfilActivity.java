package com.example.radenaksara;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.style.IconMarginSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ProfilActivity extends AppCompatActivity {
    private ImageView nilaitebak;
    private ImageView nilaiterjemah;
    TextView tvTebak;
    TextView tvTerjemah;

    private long sharedPoinTebak;
    private long sharedPoinTerjemah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        tvTebak = findViewById(R.id.text_dolanan2);
        tvTerjemah = findViewById(R.id.text_dolanan3);

        showPoin();

        tvTerjemah.setText("Poin Terjemah Aksara: " + sharedPoinTerjemah);

        tvTebak.setText("Poin Tebak Aksara: " + sharedPoinTebak);


        nilaitebak=findViewById(R.id.dolanan2);
        Glide.with(this).load(R.drawable.iv_tebak).into(nilaitebak);

        nilaiterjemah=findViewById(R.id.dolanan3);
        Glide.with(this).load(R.drawable.iv_tj).into(nilaiterjemah);

    }

    private void showPoin() {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPoinTebak = sp.getLong("poinUser", 0);
        sharedPoinTerjemah=sp.getLong("poinUserTerjemah",0);
    }
}
