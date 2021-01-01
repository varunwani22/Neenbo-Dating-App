package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lisa extends AppCompatActivity {

    private Button mBtnLisaBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisa);

        mBtnLisaBack = findViewById(R.id.btnBackButtonlisa);


        mBtnLisaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lisa.this, PeopleNearby.class);
                startActivity(intent);
            }
        });
    }
}
