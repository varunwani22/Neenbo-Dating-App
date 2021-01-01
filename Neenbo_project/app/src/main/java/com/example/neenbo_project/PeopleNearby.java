package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class PeopleNearby extends AppCompatActivity {
    private TextView mbtmessage;
    private TextView mbtlikeyou;
    private TextView mbtaccount;
    private TextView mbtencounter;
    private TextView mbtfilter;

    private ImageView mIvlisa;
    private ImageView mIvjulie;
    private ImageView mIvselena;
    private ImageView mIvsalman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_nearby);
   bottom_navigation();
   onclick_for_navigation();
    }

    private void bottom_navigation() {
        mbtencounter = findViewById(R.id.click_encounter);
        mbtlikeyou = findViewById(R.id.click_likeyou);
        mbtmessage = findViewById(R.id.click_messages);
        mbtaccount = findViewById(R.id.click_account);
        mbtfilter= findViewById(R.id.click_filter);
    }
    private void onclick_for_navigation() {
        mbtlikeyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this, LikeYou.class);
                startActivity(intent);
            }
        });
        mbtmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this, messages.class);
                startActivity(intent);
            }
        });
        mbtaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this, MyAcount.class);
                startActivity(intent);
            }
        });
        mbtencounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this, Encounter.class);
                startActivity(intent);
            }
        });
        mbtfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this, Filter.class);
                startActivity(intent);
            }
        });
        mIvlisa = findViewById(R.id.lisa1);
        mIvjulie = findViewById(R.id.julie);
        mIvselena = findViewById(R.id.selena);
        mIvsalman = findViewById(R.id.salman);

        clickToProfile_PeopleNearBy();

    }

    private void clickToProfile_PeopleNearBy(){
        mIvlisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this,lisa.class);
                startActivity(intent);
            }
        });

        mIvjulie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this,julie.class);
                startActivity(intent);
            }
        });
        mIvselena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this,selena.class);
                startActivity(intent);
            }
        });
        mIvsalman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this,salman.class);
                startActivity(intent);
            }
        });
    }
}