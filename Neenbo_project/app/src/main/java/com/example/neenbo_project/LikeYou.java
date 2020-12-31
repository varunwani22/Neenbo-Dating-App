package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LikeYou extends AppCompatActivity {
    private TextView mbtmessage;
    private TextView mbtlocation;
    private TextView mbtaccount;
    private TextView mbtencounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like_you);
        bottom_navigation();
        onclick_for_navigation();
    }

    private void bottom_navigation() {
        mbtencounter = findViewById(R.id.click_encounter);
        mbtlocation = findViewById(R.id.click_peopleNearby);
        mbtmessage = findViewById(R.id.click_messages);
        mbtaccount = findViewById(R.id.click_account);
    }

    private void onclick_for_navigation() {
        mbtlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LikeYou.this, PeopleNearby.class);
                startActivity(intent);
            }
        });
        mbtmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LikeYou.this, messages.class);
                startActivity(intent);
            }
        });
        mbtaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LikeYou.this, MyAcount.class);
                startActivity(intent);
            }
        });
        mbtencounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LikeYou.this, Encounter.class);
                startActivity(intent);
            }
        });
    }
}