package com.example.anany.emotionrecognition;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new CountDownTimer(3000, 1000){
            public void onTick(long millisUntilFinished){

            }
            public  void onFinish(){
                Intent i = new Intent(SplashScreen.this, Prijava.class);
                startActivity(i);
            }
        }.start();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}