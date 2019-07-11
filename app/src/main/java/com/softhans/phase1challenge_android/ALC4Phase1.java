package com.softhans.phase1challenge_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ALC4Phase1 extends AppCompatActivity {

    private Button aboutAlcBtn, myProfileBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        aboutAlcBtn = (Button) findViewById(R.id.aboutBtn);
        myProfileBtn = (Button) findViewById(R.id.profileBtn);

        aboutAlcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ALC4Phase1.this, AboutALC.class));

            }
        });

        myProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ALC4Phase1.this, MyProfile.class));
            }
        });


    }
}
