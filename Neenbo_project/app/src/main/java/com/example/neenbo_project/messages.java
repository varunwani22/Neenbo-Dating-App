package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class messages extends AppCompatActivity {
    private TextView mbtlikeyou;
    private TextView mbtlocation;
    private TextView mbtaccount;
    private TextView mbtencounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_messages);

    }

    private void bottom_navigation() {
        mbtencounter = findViewById(R.id.click_encounter);
        mbtlocation = findViewById(R.id.click_peopleNearby);
        mbtlikeyou = findViewById(R.id.click_likeyou);
        mbtaccount = findViewById(R.id.click_account);
    }

}
