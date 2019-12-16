package com.example.radenaksara;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class DolananActivity extends AppCompatActivity {
    private ImageView tebak;
    private ImageView terjemah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolanan);

        Log.d("LOG",Poin.CHECKPOIN_TERJEMAH.toString());
        tebak=findViewById(R.id.iv_tb);
        tebak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DolananActivity.this, TebakActivity.class);
                startActivity(intent);
            }
        });
        terjemah=findViewById(R.id.iv_tj);
        terjemah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DolananActivity.this, TerjemahAksActivity.class);
                startActivity(intent);
            }
        });

    }

}
