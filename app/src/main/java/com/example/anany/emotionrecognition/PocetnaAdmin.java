package com.example.anany.emotionrecognition;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PocetnaAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetna_admin);
    }

    public void analyze(View view) {
        //startActivity(new Intent(this, Analyze.class));
    }
}