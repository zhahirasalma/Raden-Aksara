package com.example.radenaksara;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MateriActivity extends AppCompatActivity {
    private Button carakan;
    private Button psCarakan;
    private Button wilangan;
    private Button murda;
    private Button psMurda;
    private Button swara;
    private Button sandhangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        carakan=(Button) findViewById(R.id.button1);
        carakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MateriActivity.this, CarakanActivity.class);
                startActivity(intent);
            }
        });

        psCarakan=(Button) findViewById(R.id.button2);
        psCarakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MateriActivity.this, PasanganActivity.class);
                startActivity(intent);
            }
        });

        wilangan=(Button) findViewById(R.id.button3);
        wilangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MateriActivity.this, WilanganActivity.class);
                startActivity(intent);
            }
        });

        murda=(Button) findViewById(R.id.button4);
        murda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MateriActivity.this, MurdaActivity.class);
                startActivity(intent);
            }
        });

        psMurda=(Button) findViewById(R.id.button5);
        psMurda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MateriActivity.this, PsMurdaActivity.class);
                startActivity(intent);
            }
        });

        swara=(Button) findViewById(R.id.button6);
        swara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MateriActivity.this, SwaraActivity.class);
                startActivity(intent);
            }
        });

        sandhangan=(Button) findViewById(R.id.button7);
        sandhangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MateriActivity.this, Sandhangan1Activity.class);
                startActivity(intent);
            }
        });

    }


}
