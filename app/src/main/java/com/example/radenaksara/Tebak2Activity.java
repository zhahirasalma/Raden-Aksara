package com.example.radenaksara;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class Tebak2Activity extends AppCompatActivity {
    private ImageView soal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak2);

        soal2=findViewById(R.id.iv_ya);
        Glide.with(this).load(R.drawable.ya).into(soal2);
    }


    public void showKirim(View view) {
        AlertDialog.Builder myAlertBuilder=new
                AlertDialog.Builder(Tebak2Activity. this);
        myAlertBuilder.setTitle("Benar");
        myAlertBuilder.setMessage("Poin: 200");
        myAlertBuilder.setPositiveButton("Selanjutnya",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Tebak2Activity.this, "Soal Selanjutnya", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(Tebak2Activity.this, DolananActivity.class);
                        startActivity(intent);
                    }

                });

        myAlertBuilder.setNegativeButton("Ulangi",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Tebak2Activity.this, "Ulangi Soal", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(Tebak2Activity.this, Tebak2Activity.class);
                        startActivity(intent);
                    }
                });
        myAlertBuilder.show();
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.r1a:
                if (checked)
                    Toast.makeText(this, "Na", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r2a:
                if (checked)
                    Toast.makeText(this, "Ma", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r3a:
                if (checked)
                    Toast.makeText(this, "Ga", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r4a:
                if (checked)
                    Toast.makeText(this, "Ya", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}

