package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class profile extends AppCompatActivity {

    private Button mBtnBackArrowOfProfileActivity;
    private TextView mTvUsernameAtTopOfProfileActivity;
    private TextView mTvUserNameBelowImageOfProfileActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initializeViews();
        getDataFromIntent();

        mBtnBackArrowOfProfileActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this,Finish.class);
                startActivity(intent);
            }
        });
    }

    private void getDataFromIntent() {
        if (getIntent()!= null && getIntent().getExtras()!= null){
            String data = getIntent().getStringExtra("data");
            mTvUsernameAtTopOfProfileActivity.setText(data);
            mTvUserNameBelowImageOfProfileActivity.setText(data);
        }
    }

    private void initializeViews() {
        mBtnBackArrowOfProfileActivity = findViewById(R.id.btnBackArrowOfProfileActivity);
        mTvUsernameAtTopOfProfileActivity = findViewById(R.id.tvUserName_At_Top_Of_ProfileActivity);
        mTvUserNameBelowImageOfProfileActivity = findViewById(R.id.tvUserName_Below_Image_Of_ProfileActivity);
    }
}