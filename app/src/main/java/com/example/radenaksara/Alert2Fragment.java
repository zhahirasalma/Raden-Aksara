package com.example.radenaksara;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;



public class Alert2Fragment extends DialogFragment{
    public Button mButton;
    public Alert2Fragment() {

    }

    public static Alert2Fragment newInstance(String title) {
        Alert2Fragment frag = new Alert2Fragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.popup_selamat, container);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Baca view yang dibuat di XML
        mButton = (Button) view.findViewById(R.id.btn_end);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), DolananActivity.class);
                startActivity(intent);
//                dismiss();
            }
        });
        // Ambil argument dari bundle (yang ada di newInstance) lalu mengatur title dari Dialog
        // yang ditampilkan dengan data di dalam bundle
        String title = getArguments().getString("title", "Enter Name");
        getDialog().setTitle(title);
        // Show soft keyboard automatically and request focus to field
        mButton.requestFocus();
        getDialog().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }


}