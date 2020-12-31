package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Encounter extends AppCompatActivity {
    private ImageView mbtright;
    private Button mbtleft;
    private TextView mbtlocation;
    private TextView mbtmessage;
    private TextView mbtlikeyou;
    private TextView mbtaccount;
    private TextView mbtfilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encounter);
        bottom_navigation();
        onclick_for_navigation();
    }

    private void bottom_navigation() {
        mbtlocation = findViewById(R.id.click_peopleNearby);
        mbtlikeyou = findViewById(R.id.click_likeyou);
        mbtmessage = findViewById(R.id.click_messages);
        mbtaccount = findViewById(R.id.click_account);
        mbtfilter= findViewById(R.id.click_filter);
        mbtright=findViewById(R.id.ivright);
    }

    private void onclick_for_navigation() {
        mbtlikeyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Encounter.this, LikeYou.class);
                startActivity(intent);
            }
        });
        mbtmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Encounter.this, messages.class);
                startActivity(intent);
            }
        });
        mbtaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Encounter.this, MyAcount.class);
                startActivity(intent);
            }
        });
        mbtlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Encounter.this, PeopleNearby.class);
                startActivity(intent);
            }
        });
        mbtfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Encounter.this, Filter.class);
                startActivity(intent);
            }
        });
        mbtright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbtright.setImageResource(R.drawable.bird);
            }
        });
    }
        }
