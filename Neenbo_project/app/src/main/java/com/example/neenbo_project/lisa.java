package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lisa extends AppCompatActivity {

    private TextView mTvLisaBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisa);

        mTvLisaBack = findViewById(R.id.lisaback);


        mTvLisaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lisa.this, PeopleNearby.class);
                startActivity(intent);
            }
        });
    }
}
