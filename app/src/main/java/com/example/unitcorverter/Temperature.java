package com.example.unitcorverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Temperature extends AppCompatActivity {
    double tempEntered;
    double convertedTemp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        final EditText temperature = (EditText) findViewById(R.id.txtTemperature);
        final RadioButton celToFa = (RadioButton) findViewById(R.id.rdCelToFa);
        final RadioButton faToCel = (RadioButton) findViewById(R.id.rdFaToCel);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        Button convert = (Button) findViewById(R.id.btnConvert2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEntered = Double.parseDouble(temperature.getText().toString());
                DecimalFormat tenth = new DecimalFormat("##");
               if (celToFa.isChecked()) {
                    convertedTemp = tempEntered * 1.8 + 32;
                    result.setText(tenth.format(convertedTemp) + " " +"Fahrenheit");
                } if (faToCel.isChecked()){
                   convertedTemp =  (tempEntered - 32) * 0.556;
                    result.setText(tenth.format(convertedTemp) + " " +"Celsius");
                }

            }
        });
    }
}



