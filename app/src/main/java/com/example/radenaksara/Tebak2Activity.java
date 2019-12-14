package com.example.radenaksara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Locale;

public class Tebak2Activity extends AppCompatActivity {
    private static final long COUNTDOWN_IN_MILLIS=15000;

    private TextView totalPoin;
    private TextView poin_countdown;
    private ImageView soal2;
    private TextView descSoal;
    private RadioButton sr1;
    RadioGroup sradioGroup;
    RadioButton radioButton;
//    ArrayList<Integer> gambar;
//    ArrayList<String> soal;
    String[][] jawaban={{"Ra","Ha","Ca", "La"}, {"Na","Ma","Ga","Ya"} };
    Long poin;

    private ColorStateList textColorDefaultCd;

    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak2);

        totalPoin=findViewById(R.id.poin_count);
        poin_countdown=findViewById(R.id.countdown);

        textColorDefaultCd=poin_countdown.getTextColors();
        timeLeftInMillis=COUNTDOWN_IN_MILLIS;
        startCountDown();

//        gambar=new ArrayList<>();
//        gambar.add(R.drawable.tebak_ca);
//        gambar.add(R.drawable.ya);
//
//        soal=new ArrayList<>();
//        soal.add("2. Aksara diatas adalah..");


        soal2=findViewById(R.id.iv_ya);
        Glide.with(this).load(R.drawable.ya).into(soal2);

//        descSoal=findViewById(R.id.tv2);
//        descSoal.setText(String.valueOf(soal));

        sr1=findViewById(R.id.r1a);
        sr1.setText(""+jawaban[1][0]);

        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        poin=preferences.getLong("Poin", 0 );

    }

    private void startCountDown(){
        countDownTimer=new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis=millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis=0;
                updateCountDownText();

            }
        }.start();
    }

    private void updateCountDownText(){
        int minutes=(int)(timeLeftInMillis/1000) / 60;
        int seconds=(int)(timeLeftInMillis / 1000) % 60;

        String timeFormatted=String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        poin_countdown.setText(timeFormatted);

        if(timeLeftInMillis < 10000){
            poin_countdown.setTextColor(Color.RED);
        }else{
            poin_countdown.setTextColor(textColorDefaultCd);
        }
    }


    public void showKirim(View view) {
        sradioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        int checked=sradioGroup.getCheckedRadioButtonId();
        radioButton =findViewById(checked);
        String selectedtext=(String)radioButton.getText();

        if (selectedtext.equals(jawaban[1][3])){
            countDownTimer.cancel();
            Intent intent=new Intent(this, DolananActivity.class);
            startActivity(intent);
        }else{
            showEditDialog();
            startCountDown();
        }
    }

    private void showEditDialog() {
        FragmentManager fm = getSupportFragmentManager();
        AlertDialogueFragment alertDialogueFragment = AlertDialogueFragment.newInstance("Some Title");
        alertDialogueFragment.show(fm, "fragment_edit_name");
    }

    private void storePoin(){
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putLong("Poin", poin);
        editor.apply();
    }

    protected void onDestroy(){
        super.onDestroy();
        if(countDownTimer!=null){
            showEditDialog();
            countDownTimer.cancel();
        }
    }



}