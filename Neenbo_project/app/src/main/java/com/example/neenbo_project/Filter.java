package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Filter extends AppCompatActivity implements View.OnClickListener {

    private EditText mEtManOrWomen;
    private EditText mEtCityAndState;
    private EditText mEtRadius;
    private Button mBtnSave;
    private Button mBtnArrowOfFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        initializeViewsAndListener();
    }

    private void initializeViewsAndListener() {
        mEtManOrWomen = findViewById(R.id.etManOrWomen);
        mEtCityAndState = findViewById(R.id.etCityAndState);
        mEtRadius = findViewById(R.id.etRadius);
        mBtnSave = findViewById(R.id.btnSave);
        mBtnArrowOfFilter = findViewById(R.id.btnBackArrow_Of_FilterActivity);

        mBtnSave.setOnClickListener(this);

        mBtnArrowOfFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Filter.this, MyAcount.class);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Filter.this, profile.class);
        startActivity(intent);
    }
}