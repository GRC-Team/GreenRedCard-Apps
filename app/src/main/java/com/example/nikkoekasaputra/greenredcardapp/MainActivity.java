package com.example.nikkoekasaputra.greenredcardapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button greenCard, redCard;
    LinearLayout setting, report, export;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greenCard = (Button) findViewById(R.id.btn_green_card);
        redCard = (Button) findViewById(R.id.btn_red_card);
        setting = (LinearLayout) findViewById(R.id.btn_setting);
        report = (LinearLayout) findViewById(R.id.btn_report);
        export = (LinearLayout) findViewById(R.id.btn_export);

        greenCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, GreenCardActivity.class);
                startActivity(i);
            }
        });

        redCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RedCardActivity.class);
                startActivity(i);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "On Developing..", Toast.LENGTH_SHORT).show();
            }
        });

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ReportActivity.class);
                startActivity(i);
            }
        });

        export.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "On Developing..", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
