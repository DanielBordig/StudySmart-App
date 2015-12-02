package com.example.danielbordig.studysmartapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Daniel Bordig on 26-11-2015.
 */
public class HWC extends AppCompatActivity {

    TextView header;
    ListView homeworkList;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hwc);
        header = (TextView) findViewById(R.id.headerHWC);
        homeworkList = (ListView) findViewById(R.id.homeworkList);
        ArrayList<String> test = new ArrayList<String>();
        test.add("homework0");
        test.add("homework1");
        test.add("homework2");
        test.add("homework3");
        test.add("homework4");
        test.add("homework5");
        test.add("homework6");
        test.add("homework7");
        test.add("homework8");
        test.add("homework9");
        test.add("homework10");
        test.add("homework11");
        test.add("homework12");
        test.add("homework13");
        test.add("homework14");
        test.add("homework15");
        test.add("homework16");
        test.add("homework17");
        test.add("homework18");
        test.add("homework19");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, android.R.id.text1, test);
        homeworkList.setAdapter(adapter);
    }
}
