package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnGoogle;
    private Button mBtnFacebook;
    private Button mBtnEmail;
    private Button mBtnSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViewsAndListener();

    }

    private void initializeViewsAndListener() {
        mBtnGoogle = findViewById(R.id.btnGoogle);
        mBtnFacebook = findViewById(R.id.btnFacebook);
        mBtnEmail = findViewById(R.id.btnEmail);
        mBtnSMS = findViewById(R.id.btnSMS);

        mBtnGoogle.setOnClickListener(this);
        mBtnFacebook.setOnClickListener(this);
        mBtnEmail.setOnClickListener(this);
        mBtnSMS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,TermsOfUse.class);
        startActivity(intent);
    }

}