package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MyAcount extends AppCompatActivity {
    private TextView mbtlikeyou;
    private TextView mbtlocation;
    private TextView mbtmessage;
    private TextView mbtencounter;
    private ImageButton mbtfilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
        bottom_navigation();
        onclick_for_navigation();
    }
    private void bottom_navigation() {
        mbtencounter = findViewById(R.id.click_encounter);
        mbtlocation = findViewById(R.id.click_peopleNearby);
        mbtlikeyou = findViewById(R.id.click_likeyou);
        mbtmessage = findViewById(R.id.click_messages);
        mbtfilter=findViewById(R.id.userLocation);
    }
    private void onclick_for_navigation() {
        mbtfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAcount.this, Filter.class);
                startActivity(intent);
            }
        });
        mbtlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAcount.this, PeopleNearby.class);
                startActivity(intent);
            }
        });
        mbtlikeyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAcount.this, LikeYou.class);
                startActivity(intent);
            }
        });
        mbtmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAcount.this, messages.class);
                startActivity(intent);
            }
        });
        mbtencounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAcount.this, Encounter.class);
                startActivity(intent);
            }
        });
    }
}