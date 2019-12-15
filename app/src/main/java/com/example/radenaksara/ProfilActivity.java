package com.example.radenaksara;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

//    public static final String SHARED_PREFS="sharedPrefs";
//    public static final String KEY_HIGHSCRORE="keyHighscore";
//
//    private TextView TebakHighscore;
//    private TextView TerjemahHighscore;
//
//    private int tebHs;
//    private int terHs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        tvTebak = findViewById(R.id.text_dolanan2);
        tvTerjemah = findViewById(R.id.text_dolanan3);

        tvTerjemah.setText("Poin Terjemah Aksara: " + Poin.CHECKPOIN_TERJEMAH);

        tvTebak.setText("Poin Tebak Aksara: " + Poin.CHECKPOIN_POIN);


        nilaitebak=findViewById(R.id.dolanan2);
        Glide.with(this).load(R.drawable.dolanan2).into(nilaitebak);

        nilaiterjemah=findViewById(R.id.dolanan3);
        Glide.with(this).load(R.drawable.dolanan3).into(nilaiterjemah);

    }
}
