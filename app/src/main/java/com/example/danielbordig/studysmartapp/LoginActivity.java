package com.example.danielbordig.studysmartapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Daniel Bordig on 25-11-2015.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView logo;
    TextView headerLogin;
    EditText mail, password;
    Button loginBut;
    StudentDAO stuDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        logo = (ImageView) findViewById(R.id.logoLogin);
        headerLogin = (TextView) findViewById(R.id.headerLogin);
        mail = (EditText) findViewById(R.id.mailText);
        password = (EditText) findViewById(R.id.passwordText);
        loginBut = (Button) findViewById(R.id.loginBut);

        loginBut.setOnClickListener(this);
        loginBut.setBackgroundColor(Color.BLUE);
        loginBut.setTextColor(Color.WHITE);

        stuDAO = new StudentDAO();
        
        mail.setHint("Mail");
        password.setHint("Password");
    }

    @Override
    public void onClick(View v) {
        String mailString = mail.getText().toString().trim();
        String passwordString = password.getText().toString().trim();
        if (stuDAO.Login(mailString, passwordString)){
                startActivity(new Intent(getApplicationContext(), HWC.class));
        }
        else {
            Toast.makeText(this, "Forkert mail eller password", Toast.LENGTH_LONG).show();
        }
    }
}
