package com.sveri.countrylistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaration
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialisation
        lv = findViewById(R.id.listCountries);

        //event handlers
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:
                        Toast.makeText(MainActivity.this, "You Clicked India",
                                Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(MainActivity.this, "You Clicked USA",
                                Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this, "You Clicked Russia",
                                Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Toast.makeText(MainActivity.this, "You Clicked Japan",
                                Toast.LENGTH_SHORT).show();
                        break;

                    case 4:
                        Toast.makeText(MainActivity.this, "You Clicked Germany",
                                Toast.LENGTH_SHORT).show();
                        break;

                    case 5:
                        Toast.makeText(MainActivity.this, "You Clicked Canada",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}