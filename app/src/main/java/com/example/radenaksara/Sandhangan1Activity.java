package com.example.radenaksara;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Sandhangan1Activity extends AppCompatActivity {
    private ImageView lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandhangan1);

        lanjut=findViewById(R.id.next_sdn1);
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sandhangan1Activity.this, Sandhangan2Activity.class);
                startActivity(intent);
            }
        });

    }
}
