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

public class TebakActivity extends AppCompatActivity {
    private ImageView soal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        soal1=findViewById(R.id.iv_ca);
        Glide.with(this).load(R.drawable.tebak_ca).into(soal1);
    }


    public void showKirim(View view) {
        AlertDialog.Builder myAlertBuilder=new
                AlertDialog.Builder(TebakActivity. this);
        myAlertBuilder.setTitle("Benar");
        myAlertBuilder.setMessage("Poin: 100");
        myAlertBuilder.setPositiveButton("Selanjutnya",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(TebakActivity.this, "Soal Selanjutnya", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(TebakActivity.this, Tebak2Activity.class);
                        startActivity(intent);
                    }
                    
                });

        myAlertBuilder.setNegativeButton("Ulangi",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(TebakActivity.this, "Ulangi Soal", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(TebakActivity.this, TebakActivity.class);
                        startActivity(intent);
                    }
                });
        myAlertBuilder.show();
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.r1:
                if (checked)
                    Toast.makeText(this, "Ra", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r2:
                if (checked)
                    Toast.makeText(this, "Ha", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r3:
                if (checked)
                    Toast.makeText(this, "Ca", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r4:
                if (checked)
                    Toast.makeText(this, "La", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
