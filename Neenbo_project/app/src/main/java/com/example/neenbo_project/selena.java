package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class selena extends AppCompatActivity {

    private TextView mTvSalenaBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selena);

        mTvSalenaBack = findViewById(R.id.selenaback);
        mTvSalenaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selena.this,PeopleNearby.class);
                startActivity(intent);
            }
        });
    }


    }