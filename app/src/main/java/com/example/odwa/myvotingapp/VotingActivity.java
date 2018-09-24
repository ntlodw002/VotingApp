package com.example.odwa.myvotingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VotingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);

        Button rating_2 = (Button) findViewById(R.id.scale2);
        Button rating_3 = (Button) findViewById(R.id.scale3);
        Button rating_4 = (Button) findViewById(R.id.scale4);
        Button rating_5 = (Button) findViewById(R.id.scale5);

        Button rating_1 = (Button) findViewById(R.id.scale1);
        rating_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                00
            }
        });
    }

}
