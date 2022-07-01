package com.example.a10119263_tugas2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

//IDENTITAS PENGERJAAN TUGAS :
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public class Onboard extends AppCompatActivity {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    Button tombol;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.onboardnya);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new com.example.a10119263_tugas2.ModelViewAdapter(this));

        tombol = (Button)findViewById(R.id.beranda);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(Onboard.this, MainActivity.class);
                startActivity(pindah);
                finish();
            }
        });
    }
}