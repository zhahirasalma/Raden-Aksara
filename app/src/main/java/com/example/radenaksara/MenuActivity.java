package com.example.radenaksara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MenuActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    public ImageView menu_person;
    private ImageView image_toMateri;
    private ImageView image_toDolanan;
    private ImageView image_toAsal;
    private ImageView image_toProfil;
    NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mDrawerLayout =findViewById(R.id.drawer_menu);
        mToggle = new  ActionBarDrawerToggle(this, mDrawerLayout,R.string.Open, R.string.Close);
        mDrawerLayout.addDrawerListener(mToggle);
        navView=findViewById(R.id.nav_menu);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupDrawerContent(navView);

        View header_view=navView.getHeaderView(0);

        menu_person=header_view.findViewById(R.id.person);
        menu_person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });


        image_toMateri=findViewById(R.id.iv_materi);
        image_toMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, MateriActivity.class);
                startActivity(intent);
            }
        });

        image_toDolanan=findViewById(R.id.iv_dolanan);
        image_toDolanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, DolananActivity.class);
                startActivity(intent);
            }
        });

        image_toAsal=findViewById(R.id.iv_auaj);
        image_toAsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, AsalUrunActivity.class);
                startActivity(intent);
            }
        });

        image_toProfil=findViewById(R.id.image_logo);
        image_toProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

    }

    public void selectItemDrawer(MenuItem item){
        Fragment myFragment = null;
        Class fragmentClass = null;
        Class activityClass = null;
        switch (item.getItemId()) {
            case R.id.menu_akun:
                fragmentClass=ProfilFragment.class;
                break;
            case R.id.menu_editprofil:
                activityClass=EditProfilActivity.class;
                break;
            case R.id.menu_keluar:
                activityClass=MainActivity.class;
                break;
            default:
                fragmentClass=ProfilFragment.class;
                break;
        }
        try{
            myFragment = (Fragment) fragmentClass.newInstance();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.drawer_menu, myFragment).commit();
        item.setChecked(true);
        setTitle(item.getTitle());
        mDrawerLayout.closeDrawers();


    }

    private void setupDrawerContent (NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                selectItemDrawer(menuItem);
                return true;
            }
        });
    }


    public void onBackPressed(){
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}











