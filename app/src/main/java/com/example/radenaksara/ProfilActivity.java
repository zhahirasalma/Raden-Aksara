package com.example.radenaksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.IconMarginSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ProfilActivity extends AppCompatActivity {
//    private Button keluar;
//    private Button to_editProfil;
//    private ImageView fotoprofil;
    private ImageView nilaitebak;
    private ImageView nilaiterjemah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

//        fotoprofil=findViewById(R.id.gambarprofil);
//        Glide.with(this).load(R.drawable.profil).into(fotoprofil);

        nilaitebak=findViewById(R.id.dolanan2);
        Glide.with(this).load(R.drawable.dolanan2).into(nilaitebak);

        nilaiterjemah=findViewById(R.id.dolanan3);
        Glide.with(this).load(R.drawable.dolanan3).into(nilaiterjemah);
//
//        keluar=findViewById(R.id.button_keluar);
//        keluar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(ProfilActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        to_editProfil=findViewById(R.id.editProfil);
//        to_editProfil.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(ProfilActivity.this, EditProfilActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
