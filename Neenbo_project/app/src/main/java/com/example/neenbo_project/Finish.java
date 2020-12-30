package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Finish extends AppCompatActivity implements View.OnClickListener {

    private EditText mEtEmail;
    private EditText mEtName;
    private EditText mEtGender;
    private EditText mEtDay;
    private EditText mEtMonth;
    private EditText mEtYear;
    private Button nBtnEncounters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        initializeViewAndListeners();
    }

    private void initializeViewAndListeners() {
        mEtEmail = findViewById(R.id.etManOrWomen);
        mEtName = findViewById(R.id.etCityAndState);
        mEtDay = findViewById(R.id.et18);
        mEtMonth = findViewById(R.id.etTo);
        mEtYear = findViewById(R.id.et35);
        nBtnEncounters = findViewById(R.id.btnSave);

        nBtnEncounters.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (validation()){
            Intent intent = new Intent();
            startActivity(intent);
        }
    }

    private boolean validation() {
        boolean valid = true;

        if (!mEtEmail.getText().toString().contains("@gmail.com")) {
            mEtEmail.setError("Invalid Email");
            valid = false;
        }

        if (mEtName.getText().toString().length() < 4) {
            mEtName.setError("Invalid Name");
            valid = false;
        }

        return valid;
    }
}