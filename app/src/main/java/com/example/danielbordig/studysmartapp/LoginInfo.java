package com.example.danielbordig.studysmartapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Daniel Bordig on 25-11-2015.
 */
public class LoginInfo extends AppCompatActivity implements View.OnClickListener {

    EditText birthdate;
    ListView education;
    RadioButton male, female;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_info);

        String educationString = "Education 0,Education 1,Education 2";
        String[] educationProgram = educationString.split(",");
        birthdate = (EditText) findViewById(R.id.birthdate);
        education = (ListView) findViewById(R.id.educationList);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1,educationProgram);
        education.setAdapter(adapter);
        male = (RadioButton) findViewById(R.id.radioButtonMale);
        female = (RadioButton) findViewById(R.id.radioButtonFemale);
        done = (Button) findViewById(R.id.doneBut);

        male.setOnClickListener(this);
        female.setOnClickListener(this);
        done.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==male){
            female.setChecked(false);
        }
        if(v==female){
            male.setChecked(false);
        }
        if(v==done){
            if(birthdate.getText().toString() != "" && male.isChecked() || female.isChecked()){
                startActivity(new Intent(getApplicationContext(), HWC.class));
            }
            else{
                Toast.makeText(this, "Du mangler at udfylde nogle felter", Toast.LENGTH_LONG).show();
            }
        }
    }
}
