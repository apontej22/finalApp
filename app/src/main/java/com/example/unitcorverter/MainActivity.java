package com.example.unitcorverter;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        String [] units = {"Currency", "Length",  "Temperature", "Weight", "Speed"};


       setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main, R.id.textView,  units));


     }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(MainActivity.this, Currency.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Length.class));
                break;

            case 2:
                startActivity(new Intent(MainActivity.this, Temperature.class));
                break;

            case 3:
                startActivity(new Intent(MainActivity.this, Weight.class));
                break;

            case 4:
                startActivity(new Intent(MainActivity.this, Speed.class));
                break;
        }
    }
}
