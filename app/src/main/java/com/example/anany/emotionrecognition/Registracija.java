package com.example.anany.emotionrecognition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

//import android.support.v7.app.AppCompatActivity;

public class Registracija extends AppCompatActivity {

    EditText imePrez, txtUsername, txtPass;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracija);
        imePrez = findViewById(R.id.txtImePrezime);
        txtUsername = findViewById(R.id.txtUsernameR);
        txtPass = findViewById(R.id.txtPass1);
        fAuth = FirebaseAuth.getInstance();
    }

    public void registracija(View view) {
        String ime = imePrez.getText().toString();
        String username = txtUsername.getText().toString();
        String pass = txtPass.getText().toString();
        if(ime.isEmpty() || username.isEmpty() || pass.isEmpty()){
            Toast.makeText(this, "Fields can not be empty!", Toast.LENGTH_SHORT).show();
            return;
        }

        User user = new User(ime,username,pass);

        fAuth.createUserWithEmailAndPassword(username,pass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(getApplicationContext(), "success!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), PocetnaUser.class);
                startActivity(i);
                finish();
            }
        });

        /*
        ubacivanje u bazu
         */
        finish();
    }
}