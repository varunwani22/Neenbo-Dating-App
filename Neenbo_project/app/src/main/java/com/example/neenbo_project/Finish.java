package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Finish extends AppCompatActivity implements View.OnClickListener {

    private EditText mEtEmail;
    private EditText mEtName;
    private Button mBtnEncounters;
    private TextView mTvBackFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        initializeViewAndListeners();
    }

    private void initializeViewAndListeners() {
        mEtEmail = findViewById(R.id.etEnterYourEmail);
        mEtName = findViewById(R.id.etName);
        mBtnEncounters = findViewById(R.id.btnEncounterOfFinish);
        mTvBackFinish = findViewById(R.id.tvBackFinish);

        mBtnEncounters.setOnClickListener(this);

        mTvBackFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Finish.this,TermsOfUse.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (validation()) {
            Intent intent = new Intent(Finish.this,Encounter.class);
            intent.putExtra("data",mEtName.getText().toString());
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