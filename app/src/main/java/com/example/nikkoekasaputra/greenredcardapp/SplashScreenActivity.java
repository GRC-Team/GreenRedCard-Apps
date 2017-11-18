package com.example.nikkoekasaputra.greenredcardapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final int welcomeScreenDisplay = 3000;

        Thread welcomeThread = new Thread() {

            int wait = 50;

            @Override
            public void run() {
                try {
                    super.run();
                    while (wait < welcomeScreenDisplay) {
                        sleep(100);
                        wait += 100;
                    }
                } catch (Exception e) {
                    System.out.println("EXc=" + e);
                } finally {
                    startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}
