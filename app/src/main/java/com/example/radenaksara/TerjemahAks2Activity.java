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

public class TerjemahAks2Activity extends AppCompatActivity {
    private ImageView soalTerjemah2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terjemah_aks2);

        soalTerjemah2=findViewById(R.id.iv_ta2);
        Glide.with(this).load(R.drawable.terjemahan2).into(soalTerjemah2);
    }

    public void showKirim(View view) {
        AlertDialog.Builder myAlertBuilder=new
                AlertDialog.Builder(TerjemahAks2Activity. this);
        myAlertBuilder.setTitle("Benar");
        myAlertBuilder.setMessage("Poin: 100");
        myAlertBuilder.setPositiveButton("Selanjutnya",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(TerjemahAks2Activity.this, DolananActivity.class);
                        startActivity(intent);
                    }
                });

        myAlertBuilder.setNegativeButton("Ulangi",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(TerjemahAks2Activity.this, TerjemahAks2Activity.class);
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
                    Toast.makeText(this, "anak kadhal", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r2:
                if (checked)
                    Toast.makeText(this, "katon cetha", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r3:
                if (checked)
                    Toast.makeText(this, "katon apik", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r4:
                if (checked)
                    Toast.makeText(this, "mangan roti", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
