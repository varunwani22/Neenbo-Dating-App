package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class julie extends AppCompatActivity {

    private Button mBtnJulieBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_julie);

        mBtnJulieBack = findViewById(R.id.btnBackButtonJulie);

        mBtnJulieBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(julie.this, PeopleNearby.class);
                startActivity(intent);
            }
        });
    }
}
