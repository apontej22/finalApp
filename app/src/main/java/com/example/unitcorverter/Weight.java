package com.example.unitcorverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Weight extends AppCompatActivity {

    double valueEntered;
    double convertedWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        final EditText value = (EditText)findViewById(R.id.txtValue);
        final CheckBox pound = (CheckBox) findViewById(R.id.chkBoxPound);
        final CheckBox ounce = (CheckBox) findViewById(R.id.chkBoxOunce);
        final CheckBox gram = (CheckBox) findViewById(R.id.chkBoxGram);
        final CheckBox kilo = (CheckBox) findViewById(R.id.chkBoxKilo);
        final CheckBox milligram = (CheckBox) findViewById(R.id.chkBoxMilligram);
        Button convert = (Button) findViewById(R.id.btnConvert4);
        final TextView result = (TextView) findViewById(R.id.txtResult);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valueEntered = Double.parseDouble(value.getText().toString());
                DecimalFormat tenth = new DecimalFormat("##.######");
                if(pound.isChecked()){
                    convertedWeight = valueEntered * 1;
                    result.setText(tenth.format(convertedWeight) + " " +"Pounds");
                } if (ounce.isChecked()){
                    convertedWeight = valueEntered * 16;
                    result.setText(tenth.format(convertedWeight) + " " +"Ounces");
                } if(gram.isChecked()){
                    convertedWeight = valueEntered * 453.592;
                    result.setText(tenth.format(convertedWeight) + " " +"Grams");
                } if(kilo.isChecked()){
                    convertedWeight = valueEntered * 0.453592;
                    result.setText(tenth.format(convertedWeight) + " " +"Kilograms");
                }if (milligram.isChecked()){
                    convertedWeight = valueEntered * 453592;
                    result.setText(tenth.format(convertedWeight) + " " +"Milligrams");
                }
            }
        });
    }
}
