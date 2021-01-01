package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class salman extends AppCompatActivity {

    private Button mBtnSalmanBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salman);

        mBtnSalmanBack = findViewById(R.id.btnBackButtonSalman);

        mBtnSalmanBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(salman.this,PeopleNearby.class);
                startActivity(intent);
            }
        });
    }
}