package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class salman extends AppCompatActivity {

    private TextView mTvSalmanBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salman);

        mTvSalmanBack = findViewById(R.id.salmanback);

        mTvSalmanBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(salman.this,PeopleNearby.class);
                startActivity(intent);
            }
        });
    }
}