package com.example.anany.emotionrecognition;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class TheEnd extends AppCompatActivity {
    FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_end);
        fAuth = FirebaseAuth.getInstance();
    }

    public void Logout(View view) {
        fAuth.signOut();
    }
}