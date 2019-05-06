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

public class Currency extends AppCompatActivity {
    double convertedAmount;
    double amountEntered;
    double conversionRate;
    String conversionChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        final EditText amount = (EditText)findViewById(R.id.txtAmount);
        final Spinner group1 = (Spinner) findViewById(R.id.txtGroup1);
       final Button convert = (Button) findViewById(R.id.btnConvert);
        final TextView result = (TextView) findViewById(R.id.txtResult);


           group1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    if (group1.getSelectedItemPosition() == 0) {
                        conversionRate = 0.89;
                    } else if (group1.getSelectedItemPosition() == 1) {
                        conversionRate = 19.01;
                    } else if (group1.getSelectedItemPosition() == 2) {
                        conversionRate = 1.35;
                    } else if (group1.getSelectedItemPosition() == 3) {
                        conversionRate = 1.43;
                    } else if (group1.getSelectedItemPosition() == 4) {
                        conversionRate = 110.91;
                    } else if (group1.getSelectedItemPosition() == 5) {
                        conversionRate = 3.30;
                    } else if (group1.getSelectedItemPosition() == 6) {
                        conversionRate = 3.67;
                    } else if (group1.getSelectedItemPosition () == 7){
                        conversionRate = 6.01;
                    }
                }



              @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    amountEntered = Double.parseDouble(amount.getText().toString());
                    conversionChoice = group1.getSelectedItem().toString();
                    DecimalFormat currency = new DecimalFormat("$###,###.##");
                    convertedAmount = amountEntered * conversionRate;
                    result.setText(currency.format(convertedAmount) + "  " + conversionChoice);
                }
            });



        }
}
