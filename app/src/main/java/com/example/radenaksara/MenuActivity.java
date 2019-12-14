package com.example.radenaksara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MenuActivity extends AppCompatActivity {
    private ImageView image_toMateri;
    private ImageView image_toDolanan;
    private ImageView image_toAsal;
    private ImageView image_toProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        image_toMateri=findViewById(R.id.iv_materi);
        image_toMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, MateriActivity.class);
                startActivity(intent);
            }
        });

        image_toDolanan=findViewById(R.id.iv_dolanan);
        image_toDolanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, DolananActivity.class);
                startActivity(intent);
            }
        });

        image_toAsal=findViewById(R.id.iv_auaj);
        image_toAsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, AsalUrunActivity.class);
                startActivity(intent);
            }
        });

        image_toProfil=findViewById(R.id.image_logo);
        image_toProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

    }


}











