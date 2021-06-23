package com.example.anany.emotionrecognition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

//import android.support.v7.app.AppCompatActivity;

public class LoginUser extends AppCompatActivity {

    EditText txtUsername, txtPass;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        txtUsername = findViewById(R.id.txtUsernameU);
        txtPass = findViewById(R.id.txtPasswordU);
        fAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(FirebaseAuth.getInstance().getCurrentUser() != null){
            startActivity(new Intent(this, PocetnaUser.class));
            finish();
        }
    }

    public void loginUser(View view) {
        String username = txtUsername.getText().toString();
        String pass = txtPass.getText().toString();

        if(username.isEmpty() || pass.isEmpty()){
            Toast.makeText(this, "Fields can not be empty!", Toast.LENGTH_SHORT).show();
            return;
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(pass);

        fAuth.signInWithEmailAndPassword(username,pass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                startActivity(new Intent(getApplicationContext(), PocetnaUser.class));
                finish();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "Login not successful"+e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });


        // provera u bazi
        /*
        if(konekcijaKorisnik.exists(user)){
                Intent i1 = new Intent(this, ProfileUser.class);
                i1.putExtra("username",user.username);
                startActivity(i1);
            }
            else{
                Toast.makeText(this,"Pogresno korisnicko ime ili sifra",Toast.LENGTH_LONG).show();
            }
         */
        Intent i = new Intent(this,PocetnaUser.class);
        startActivity(i);
    }

    public void registerUser(View view) {
        Intent i = new Intent(this, Registracija.class);
        startActivity(i);

    }
}