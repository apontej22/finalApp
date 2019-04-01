package com.example.unitcorverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class Currency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        final EditText amount = (EditText)findViewById(R.id.txtAmount);
        final Spinner group = (Spinner) findViewById(R.id.txtGroup);
    }
}
