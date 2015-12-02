package com.example.danielbordig.studysmartapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView header;
    ImageView logo, dtu, cbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.university);

        header = (TextView) findViewById(R.id.headerHWC);
        logo = (ImageView) findViewById(R.id.logo);
        dtu = (ImageView) findViewById(R.id.dtuImage);
        cbs = (ImageView) findViewById(R.id.cbsImage);

        dtu.setOnClickListener(this);
        cbs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==dtu) startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        if (v==cbs) startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    }
}
