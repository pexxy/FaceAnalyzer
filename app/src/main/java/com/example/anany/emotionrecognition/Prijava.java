package com.example.anany.emotionrecognition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

//import android.support.v7.app.AppCompatActivity;

public class Prijava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prijava);
    }
    public void chooseUser(View view) {
        Intent i=new Intent(this, LoginUser.class);
        startActivity(i);
    }

    public void chooseAdmin(View view) {
        Intent i=new Intent(this, LoginAdmin.class);
        startActivity(i);
    }
}