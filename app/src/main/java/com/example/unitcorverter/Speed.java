package com.example.unitcorverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Speed extends AppCompatActivity {
    double milesEntered;
    double conversion;
    double convertedMiles;
    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        final EditText miles = (EditText) findViewById(R.id.txtMilesHr);
        final Button convert = (Button)findViewById(R.id.btnConvertSped);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        final Spinner group3 = (Spinner) findViewById(R.id.txtGroup3);

        group3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (group3.getSelectedItemPosition() == 0) {
                    conversion = milesEntered * 1;
                } else if (group3.getSelectedItemPosition() == 1) {
                    conversion =  milesEntered * 1.467;
                } else if (group3.getSelectedItemPosition() == 2) {
                    conversion = milesEntered* 1.609;
                } else if (group3.getSelectedItemPosition() == 3) {
                    conversion = milesEntered/ 2.237;
                } else if (group3.getSelectedItemPosition() == 4) {
                    conversion =  milesEntered/ 1.151;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               milesEntered= Double.parseDouble(miles.getText().toString());
                choice = group3.getSelectedItem().toString();
                DecimalFormat tenth = new DecimalFormat("###.#####");
                convertedMiles = conversion;
                result.setText(tenth.format(convertedMiles) + "  " + choice);
            }
        });
    }
}
