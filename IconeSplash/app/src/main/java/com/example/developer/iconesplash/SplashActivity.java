package com.example.developer.iconesplash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;

public class SplashActivity extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        Handler hadler = new Handler();
        hadler.postDelayed(this, 2000);


    }
    public void run(){
        startActivity(new Intent(this, TelaPrincipal.class));
        finish();
    }

}
