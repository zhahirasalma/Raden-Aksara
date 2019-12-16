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

import java.util.Locale;

public class TerjemahAks5Activity extends AppCompatActivity {
    private static final long COUNTDOWN_IN_MILLIS=20000;

    private TextView totalPoin;
    private TextView poin_countdown;
    private ImageView soalTerjemah4;

    private RadioButton sr1;
    RadioGroup sradioGroup;
    RadioButton radioButton;
    TextView terjemahAks;

    String[][] jawaban={{"bapak lagi gerah padaran","bapak lagi nyapu omah",
            "bapak lagi gerah waja", "bapak lagi nyapu latar"}};
    Long poin;

    private ColorStateList textColorDefaultCd;

    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terjemah_aks5);

        poin_countdown=findViewById(R.id.countdown);
        terjemahAks = findViewById(R.id.poin_count);

        terjemahAks.setText("Poin: " + Poin.CHECKPOIN_TERJEMAH);

        textColorDefaultCd=poin_countdown.getTextColors();
        timeLeftInMillis=COUNTDOWN_IN_MILLIS;
        startCountDown();

        soalTerjemah4=findViewById(R.id.iv_ta4);
        Glide.with(this).load(R.drawable.katon_apik).into(soalTerjemah4);

        sr1=findViewById(R.id.r1a);
        sr1.setText(""+jawaban[0][0]);

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

        if (selectedtext.equals(jawaban[0][2])){
            countDownTimer.cancel();
            Poin.CHECKPOIN_TERJEMAH += 100;

            simpanPoin();
            showEndDialog();
        }else{
            showEditDialog();
            startCountDown();
        }

    }

    public void simpanPoin() {
        SharedPreferences sp =  PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sp.edit();
        editor.putLong("poinUserTerjemah", Poin.CHECKPOIN_POIN);
        editor.commit();
    }

    private void showEditDialog() {
        FragmentManager fm = getSupportFragmentManager();
        AlertDialogueFragment alertDialogueFragment = AlertDialogueFragment.newInstance("Some Title");
        alertDialogueFragment.show(fm, "fragment_edit_name");
    }

    private void showEndDialog(){
        FragmentManager fm = getSupportFragmentManager();
        Alert2Fragment alert2Fragment = Alert2Fragment.newInstance("Some Title");
        alert2Fragment.show(fm, "fragment_edit_name");
    }

    private void storePoin(){
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putLong("Poin", poin);
        editor.apply();
    }

//    protected void onDestroy(){
//        super.onDestroy();
//        if(countDownTimer!=null){
//            showEditDialog();
//            countDownTimer.cancel();
//        }
//    }


}
