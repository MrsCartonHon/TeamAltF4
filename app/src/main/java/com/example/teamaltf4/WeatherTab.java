package com.example.teamaltf4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class WeatherTab extends AppCompatActivity {
    private Button HomeButton;
    private Button infoButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_tab);

        HomeButton = (Button) findViewById(R.id.HomeButton);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        infoButton = (Button) findViewById(R.id.infoButton);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoTab();
            }
        });



        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://forecast.weather.gov/MapClick.php?lat=42.07469810400005&lon=-93.49997241099999#.YG9cVOhKiF4");
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openInfoTab() {
        Intent intent = new Intent(this, InformationTab.class);
        startActivity(intent);
    }


}