package com.example.radenaksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DaftarActivity extends AppCompatActivity {
    private Button button_toMenu;
    private EditText snamapengguna;
    private EditText semail;
    private EditText skatasandi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        button_toMenu=findViewById(R.id.daftar);
        button_toMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daftar_menu();
            }
        });
    }

    public void daftar_menu(){
        Intent intent=new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
