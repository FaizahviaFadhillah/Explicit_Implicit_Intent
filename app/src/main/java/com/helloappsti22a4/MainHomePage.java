package com.helloappsti22a4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainHomePage extends AppCompatActivity {
    Button btnHello;
    Button btnCount;
    Button btnSianida;
    Button btnTwoActivity;
    Button btnAlarm;

    Button btnMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setLayout();
        setKlik();
    }

    void setLayout() {
        btnHello = findViewById(R.id.btnHello);
        btnCount = findViewById(R.id.btnCount);
        btnSianida = findViewById(R.id.btnSianida);
        btnTwoActivity = findViewById(R.id.btnTwoActivity);
        btnAlarm = findViewById(R.id.btnAlarm);
//        btnMaps = findViewById(R.id.btnMaps);

    }

    public void btnMaps(View view) {
        double latitude = 37.7749;
        double longitude = -122.4194;

        Uri geoLocation = Uri.parse("geo:" + latitude + "," + longitude + "?q=" + latitude + "," + longitude + "(Label)");

        showMap(geoLocation);
    }
    public void showMap(Uri geolocation){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geolocation);
        if (intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        }
    }
    void setKlik() {
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenthello = new Intent(MainHomePage.this, MainHello.class);
                startActivity(intenthello);
            }
        });
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcount = new Intent(MainHomePage.this, MainActivity.class);
                startActivity(intentcount);
            }
        });
        btnSianida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsianida = new Intent(MainHomePage.this, ScrollingIcecold.class);
                startActivity(intentsianida);
            }
        });
        btnTwoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttwoactivity = new Intent(MainHomePage.this, MainActivityOne.class);
                startActivity(intenttwoactivity);
            }
        });
        btnAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentalarm= new Intent(MainHomePage.this, AlarmActivity.class);
                startActivity(intentalarm);
            }
        });

    }


}