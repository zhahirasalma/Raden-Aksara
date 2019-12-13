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

public class TerjemahAksActivity extends AppCompatActivity {
    private ImageView soalTerjemah1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terjemah_aks);

        soalTerjemah1=findViewById(R.id.iv_ca);
        Glide.with(this).load(R.drawable.terjemahan).into(soalTerjemah1);
    }

    public void showKirim(View view) {
        AlertDialog.Builder myAlertBuilder=new
                AlertDialog.Builder(TerjemahAksActivity. this);
        myAlertBuilder.setTitle("Salah");
        myAlertBuilder.setMessage("Poin: 0");
        myAlertBuilder.setPositiveButton("Selanjutnya",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(TerjemahAksActivity.this, TerjemahAks2Activity.class);
                        startActivity(intent);
                    }
                });

        myAlertBuilder.setNegativeButton("Ulangi",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(TerjemahAksActivity.this, TerjemahAksActivity.class);
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
                    Toast.makeText(this, "Mangan Sega", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r2:
                if (checked)
                    Toast.makeText(this, "Mangan Nanas", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r3:
                if (checked)
                    Toast.makeText(this, "Numpak Motor", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r4:
                if (checked)
                    Toast.makeText(this, "Mlayu Banter", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
