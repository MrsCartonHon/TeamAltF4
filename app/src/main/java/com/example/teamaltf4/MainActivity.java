package com.example.teamaltf4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button infoButton;
    private Button WButton;
    private Button EditButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoButton = (Button) findViewById(R.id.infoButton);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInformationTab();
            }
        });

        WButton = (Button) findViewById(R.id.WButton);
        WButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeatherTab();
            }
        });


        ImageButton MessageIcon = (ImageButton) findViewById(R.id.msgIcon);
        MessageIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainMessage.class);
                startActivity(intent);
            }
        });

    }

    public void openInformationTab() {
        Intent intent = new Intent(this, InformationTab.class);
        startActivity(intent);
    }

    public void openWeatherTab() {
        Intent intent = new Intent(this, WeatherTab.class);
        startActivity(intent);
    }

    public void openEditTab() {
        Intent intent = new Intent(this, EditTab.class);
        startActivity(intent);
    }



}