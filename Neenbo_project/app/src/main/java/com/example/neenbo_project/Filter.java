package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Filter extends AppCompatActivity implements View.OnClickListener {

    private EditText mEtManOrWomen;
    private EditText mEtCityAndState;
    private EditText mEtRdius;
    private Button mBtnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        initializeViewsAndListener();
    }

    private void initializeViewsAndListener() {
        mEtManOrWomen = findViewById(R.id.etManOrWomen);
        mEtCityAndState = findViewById(R.id.etCityAndState);
        mEtRdius = findViewById(R.id.etRadius);
        mBtnSave = findViewById(R.id.btnSave);

        mBtnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}