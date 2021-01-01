package com.example.neenbo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PeopleNearby extends AppCompatActivity {

    private ImageView mIvlisa;
    private ImageView mIvjulie;
    private ImageView mIvselena;
    private ImageView mIvsalman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_nearby);
        mIvlisa = findViewById(R.id.lisa1);
        mIvjulie = findViewById(R.id.julie);
        mIvselena = findViewById(R.id.selena);
        mIvsalman = findViewById(R.id.salman);

        clickToProfile_PeopleNearBy();

    }

    private void clickToProfile_PeopleNearBy(){
        mIvlisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this,lisa.class);
                startActivity(intent);
            }
        });

        mIvjulie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this,julie.class);
                startActivity(intent);
            }
        });
        mIvselena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this,selena.class);
                startActivity(intent);
            }
        });
        mIvsalman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleNearby.this,salman.class);
                startActivity(intent);
            }
        });
    }
}