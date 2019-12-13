package com.example.radenaksara;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MasukActivity extends AppCompatActivity {
    private EditText email;
    private EditText katasandi;
    private Button masuk_toMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
        masuk_toMenu=findViewById(R.id.masuk);
//        masuk_toMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                masuk_menu();
//            }
//        });
    }

//    public void masuk_menu(){
//        Intent intent=new Intent(this, MenuActivity.class);
//        startActivity(intent);
//    }

    public void showMasuk(View view) {
        AlertDialog.Builder myAlertBuilder=new
                AlertDialog.Builder(MasukActivity. this);
        myAlertBuilder.setTitle("Gagal");
        myAlertBuilder.setMessage("Nama pengguna atau kata sandi salah. Masukkan kembali " +
                "nama pengguna dan kata sandi.");

        myAlertBuilder.setPositiveButton("Ulangi",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(MasukActivity.this, MasukActivity.class);
                        startActivity(intent);
                    }
                });
        myAlertBuilder.show();
    }
}
