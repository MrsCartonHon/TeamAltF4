package com.example.teamaltf4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class InformationTab extends AppCompatActivity {
    private Button HomeButton;
    private Button WButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_tab);

        HomeButton = (Button) findViewById(R.id.HomeButton);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        WButton = (Button) findViewById(R.id.WButton);
        WButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeatherTab();
            }
        });

        Spinner Chemicals = (Spinner) findViewById(R.id.chemSpin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Chemical_Names, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Chemicals.setAdapter(adapter);

    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openWeatherTab() {
        Intent intent = new Intent(this, WeatherTab.class);
        startActivity(intent);
    }
}
