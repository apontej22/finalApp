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

public class Length extends AppCompatActivity {
    double lengthEntered;
    double rslt1;
    double rslt2;
    double rslt3;
    double rslt4;
    double rslt5;
    double rslt6;
    double rslt7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        final EditText length = (EditText) findViewById(R.id.txtValue);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        final TextView result2 = (TextView) findViewById(R.id.txtResult2);
        final TextView result3 = (TextView) findViewById(R.id.txtResult3);
        final TextView result4 = (TextView) findViewById(R.id.txtResult4);
        final TextView result5 = (TextView) findViewById(R.id.txtResult5);
        final TextView result6 = (TextView) findViewById(R.id.txtResult6);
        final TextView result7 = (TextView) findViewById(R.id.txtResult7);
        final Spinner group2 = (Spinner) findViewById(R.id.txtGroup2);
        Button convert = (Button) findViewById(R.id.btnConvert3);

        group2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (group2.getSelectedItemPosition() == 0) {
                    rslt1 = lengthEntered * 1;
                    rslt2 = lengthEntered / 12;
                    rslt3 = lengthEntered / 36;
                    rslt4 = lengthEntered * 2.54;
                    rslt5 = lengthEntered / 39.37;
                    rslt6 = lengthEntered / 39370.079;
                    rslt7 = lengthEntered / 63360;

                } else if (group2.getSelectedItemPosition() == 1) {
                    rslt1 = lengthEntered * 12;
                    rslt2 = lengthEntered * 1;
                    rslt3 = lengthEntered / 3;
                    rslt4 = lengthEntered * 30.48;
                    rslt5 = lengthEntered / 32.81;
                    rslt6 = lengthEntered / 3280.84;
                    rslt7 = lengthEntered / 5280;
                } else if (group2.getSelectedItemPosition() == 2) {
                    rslt1 = lengthEntered * 36;
                    rslt2 = lengthEntered * 3;
                    rslt3 = lengthEntered * 1;
                    rslt4 = lengthEntered * 91.44;
                    rslt5 = lengthEntered / 1.094;
                    rslt6 = lengthEntered / 1093.613;
                    rslt7 = lengthEntered / 1760;
                } else if (group2.getSelectedItemPosition() == 3) {
                    rslt1 = lengthEntered / 2.54;
                    rslt2 = lengthEntered / 30.48;
                    rslt3 = lengthEntered / 91.44;
                    rslt4 = lengthEntered * 1;
                    rslt5 = lengthEntered / 100;
                    rslt6 = lengthEntered / 100000;
                    rslt7 = lengthEntered / 160934.4;
                } else if (group2.getSelectedItemPosition() == 4) {
                    rslt1 = lengthEntered * 39.37;
                    rslt2 = lengthEntered * 3.281;
                    rslt3 = lengthEntered * 1.094;
                    rslt4 = lengthEntered * 100;
                    rslt5 = lengthEntered * 1;
                    rslt6 = lengthEntered / 1000;
                    rslt7 = lengthEntered / 1609.344;
                } else if (group2.getSelectedItemPosition() == 5) {
                    rslt1 = lengthEntered * 39370.079;
                    rslt2 = lengthEntered * 3280.84;
                    rslt3 = lengthEntered * 1093.613;
                    rslt4 = lengthEntered * 100000;
                    rslt5 = lengthEntered * 1000;
                    rslt6 = lengthEntered * 1;
                    rslt7 = lengthEntered / 1.609;
                } else if (group2.getSelectedItemPosition() == 6) {
                    rslt1 = lengthEntered * 63360;
                    rslt2 = lengthEntered * 5280;
                    rslt3 = lengthEntered * 160934.4;
                    rslt4 = lengthEntered * 1609.344;
                    rslt5 = lengthEntered * 1.609;
                    rslt7 = lengthEntered * 1;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lengthEntered = Double.parseDouble(length.getText().toString());
                DecimalFormat tenth = new DecimalFormat("###.#####");
                result.setText(tenth.format(rslt1) + "   Inches");
                result2.setText(tenth.format(rslt2) + "   Feet");
                result3.setText(tenth.format(rslt3) + "   Yards");
                result4.setText(tenth.format(rslt4) + "   Centimeters");
                result5.setText(tenth.format(rslt5) + "   Meters");
                result6.setText(tenth.format(rslt6) + "   Kilometers");
                result7.setText(tenth.format(rslt7) + "   Miles");
            }
        });

    }
}
