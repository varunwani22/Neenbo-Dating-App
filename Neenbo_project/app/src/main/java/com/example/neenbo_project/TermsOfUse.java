package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class TermsOfUse extends AppCompatActivity {

    private Button mBtnIAcceptTerms;
    private CheckBox mCbIAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_of_use);
        mBtnIAcceptTerms = findViewById(R.id.btnIAcceptTerms);
        mCbIAccept = findViewById(R.id.cbIaccept);
        mBtnIAcceptTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TermsOfUse.this, Finish.class);
                startActivity(intent);
            }

        });

    }
}